import java.util.LinkedList;
import java.util.List;

public class SistemaControl {
    private Ascensor ascensor;
    private List<Integer> solicitudesDestino;
    private List<BotonLlamada> solicitudesLlamada;
    private final int MAX_PISO = 10; // Ejemplo

    public SistemaControl() {
        this.ascensor = new Ascensor();
        this.solicitudesDestino = new LinkedList<>();
        this.solicitudesLlamada = new LinkedList<>();
    }

    // ----------------------------------------------------
    // METODOS DE GESTION DE SOLICITUDES
    // ----------------------------------------------------
    
    public void agregarSolicitudDestino(int piso) {
        if (!solicitudesDestino.contains(piso)) {
            solicitudesDestino.add(piso);
            System.out.println("Sistema: Destino " + piso + " registrado.");
        }
    }

    public void agregarSolicitudLlamada(int piso, String direccion) {
        boolean yaExiste = solicitudesLlamada.stream()
            .anyMatch(s -> s.pisoActual == piso && s.direccion.equals(direccion));
            
        if (!yaExiste) {
            BotonLlamada nuevaSolicitud = new BotonLlamada(piso, direccion);
            solicitudesLlamada.add(nuevaSolicitud);
            System.out.println("Sistema: Llamada en piso " + piso + " (" + direccion + ") registrada.");
        }
    }
    
    // ----------------------------------------------------
    // METODOS DE CONTROL CENTRAL (Criterio 5)
    // ----------------------------------------------------

    public void procesarCiclo() {
        System.out.println("\n--- CICLO DE PROCESAMIENTO ---");
        
        // 1. Verificar si hay solicitudes para el piso actual
        if (solicitudesDestino.contains(ascensor.getPisoActual())) {
            ascensor.detenerEnPiso();
            solicitudesDestino.remove(Integer.valueOf(ascensor.getPisoActual()));
            System.out.println("Sistema: Solicitud de destino completada en " + ascensor.getPisoActual());
        }

        // 2. Optimización del movimiento (Criterio 5) 
        // Lógica: priorizar solicitudes en la dirección actual [cite: 36]
        int siguientePiso = -1;
        String direccionActual = ascensor.getDireccion();
        
        if (direccionActual.equals("SUBIENDO")) {
            siguientePiso = encontrarSiguienteEnDireccion(true);
        } else if (direccionActual.equals("BAJANDO")) {
            siguientePiso = encontrarSiguienteEnDireccion(false);
        } else { // Si está DETENIDO, decide la dirección inicial
            if (!solicitudesDestino.isEmpty()) {
                if (solicitudesDestino.get(0) > ascensor.getPisoActual()) {
                    ascensor.cambiarDireccion("SUBIENDO");
                    siguientePiso = encontrarSiguienteEnDireccion(true);
                } else {
                    ascensor.cambiarDireccion("BAJANDO");
                    siguientePiso = encontrarSiguienteEnDireccion(false);
                }
            }
        }
        
        // 3. Ejecutar movimiento o cambiar de dirección si es necesario 
        if (siguientePiso != -1) {
            ascensor.mover();
        } else {
             // Si no hay más en la dirección actual, cambiar (Criterio 5) 
            if (direccionActual.equals("SUBIENDO") && !solicitudesDestino.isEmpty()) {
                 ascensor.cambiarDireccion("BAJANDO");
            } else if (direccionActual.equals("BAJANDO") && !solicitudesDestino.isEmpty()) {
                 ascensor.cambiarDireccion("SUBIENDO");
            } else {
                ascensor.cambiarDireccion("DETENIDO");
            }
        }
    }
    
    // Método auxiliar para encontrar el destino más cercano en la dirección actual
    private int encontrarSiguienteEnDireccion(boolean subiendo) {
        int mejorPiso = -1;
        int pisoActual = ascensor.getPisoActual();
        
        for (int piso : solicitudesDestino) {
            if (subiendo && piso > pisoActual) {
                if (mejorPiso == -1 || piso < mejorPiso) {
                    mejorPiso = piso;
                }
            } else if (!subiendo && piso < pisoActual) {
                if (mejorPiso == -1 || piso > mejorPiso) {
                    mejorPiso = piso;
                }
            }
        }
        return mejorPiso;
    }
    
    // ----------------------------------------------------
    // METODOS DE EMERGENCIA (Criterio 7) [cite: 51, 52, 66]
    // ----------------------------------------------------
    
    public void notificarFalla(String componente) {
        System.out.println("\n*** ALERTA DE FALLA ***: " + componente + " ha fallado.");
        System.out.println("Sistema: Enviando alerta al equipo de mantenimiento[cite: 51].");
        System.out.println("Sistema: Deteniendo ascensor en el piso más cercano[cite: 51].");
        if (!ascensor.getPuertaAscensor().isAbierta()) {
             System.out.println("Sistema: Abriendo puertas por emergencia[cite: 52].");
             ascensor.getPuertaAscensor().abrir();
        }
    }
    
    // Getter para prueba
    public Ascensor getAscensor() {
        return ascensor;
    }
}
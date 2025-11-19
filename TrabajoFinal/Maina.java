public class Maina {
    public static void main(String[] args) {
        SistemaControl sistema = new SistemaControl();
        Ascensor ascensor = sistema.getAscensor();

        System.out.println("--- INICIO DE SIMULACIÓN ---");

        // Simulación de solicitudes de los usuarios
        // 1. Llamada desde el piso 5 para BAJAR
        BotonLlamada bLlamada5 = new BotonLlamada(5, "BAJAR");
        bLlamada5.presionar(); // Enciende luz [cite: 31]
        bLlamada5.enviarSolicitud(sistema);

        // 2. Solicitud de destino dentro del ascensor (piso 8)
        BotonAscensor bDestino8 = new BotonAscensor(8);
        bDestino8.presionar();
        bDestino8.enviarSolicitud(sistema);
        
        // 3. Solicitud de destino dentro del ascensor (piso 2)
        BotonAscensor bDestino2 = new BotonAscensor(2);
        bDestino2.presionar();
        bDestino2.enviarSolicitud(sistema);


        System.out.println("\n--- COMIENZO DEL MOVIMIENTO ---");

        // El ascensor está en el piso 1. Debería subir primero al 8 (o 5) y luego ir al 2.
        
        // Ciclo 1: Sube al 2
        sistema.procesarCiclo(); // Ascensor subiendo al piso 2
        sistema.procesarCiclo(); // Ascensor subiendo al piso 3
        sistema.procesarCiclo(); // Ascensor subiendo al piso 4
        sistema.procesarCiclo(); // Ascensor subiendo al piso 5

        // Ciclo 5: Debería llegar al 5, completar solicitud de llamada y seguir al 8
        sistema.procesarCiclo(); // Ascensor subiendo al piso 6
        sistema.procesarCiclo(); // Ascensor subiendo al piso 7

        // Ciclo 8: Llega al 8
        sistema.procesarCiclo();
        
        // Ciclo 9: Debería cambiar de dirección a BAJANDO e ir al piso 2
        sistema.procesarCiclo(); 
        
        // Ciclo 10: Bajando al 6
        sistema.procesarCiclo(); 
        
        // ... (Se necesitarían más ciclos para llegar al 2) ...

        System.out.println("\n--- SIMULACIÓN DE FALLA ---");
        // Simulación de un sensor de puerta fallando (Criterio 7)
        ascensor.getPuertaAscensor().detectarObstaculo(true);
        ascensor.getPuertaAscensor().cerrar(); // Intenta cerrar, falla [cite: 41]
        sistema.notificarFalla("Sensor de Puerta"); // Notifica a mantenimiento [cite: 51]
        
        System.out.println("\n--- FIN DE SIMULACIÓN ---");
    }
}
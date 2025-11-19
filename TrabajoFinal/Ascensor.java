public class Ascensor {
    // Atributos para el estado 
    private int pisoActual;
    private String direccion; // "SUBIENDO", "BAJANDO", "DETENIDO"
    private Puerta puertaAscensor;

    public Ascensor() {
        this.pisoActual = 1;
        this.direccion = "DETENIDO";
        this.puertaAscensor = new Puerta("Ascensor");
    }

    // Método para mover el ascensor (Criterio 3) 
    public void mover() {
        if (!direccion.equals("DETENIDO")) {
            System.out.println("Ascensor moviéndose: " + direccion);
            // Simulación de movimiento
            if (direccion.equals("SUBIENDO")) {
                pisoActual++;
            } else if (direccion.equals("BAJANDO")) {
                pisoActual--;
            }
            System.out.println("Ascensor llega al piso " + pisoActual);
        } else {
            System.out.println("Ascensor detenido en piso " + pisoActual);
        }
    }

    // Lógica para detener y manejar puertas (Criterio 6) [cite: 40, 66]
    public void detenerEnPiso() {
        this.direccion = "DETENIDO";
        System.out.println("--- Ascensor DETENIDO en el piso " + pisoActual + " ---");
        puertaAscensor.abrir(); // Apertura automática [cite: 40]
        // Se esperaría un tiempo aquí
        puertaAscensor.cerrar(); // Cierre automático [cite: 40]
    }

    // Lógica para cambio de dirección (Criterio 5) 
    public void cambiarDireccion(String nuevaDireccion) {
        if (!direccion.equals(nuevaDireccion)) {
            this.direccion = nuevaDireccion;
            System.out.println("--- CAMBIO DE DIRECCIÓN: " + nuevaDireccion + " ---");
        }
    }

    // Getters
    public int getPisoActual() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }

    public Puerta getPuertaAscensor() {
        return puertaAscensor;
    }
}
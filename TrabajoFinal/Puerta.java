public class Puerta {
    private String tipo; // "Ascensor" o "Piso"
    private boolean abierta;
    private boolean obstaculoDetectado;

    public Puerta(String tipo) {
        this.tipo = tipo;
        this.abierta = false;
        this.obstaculoDetectado = false;
        System.out.println(tipo + " - Puerta creada.");
    }

    public void abrir() {
        if (!abierta) {
            this.abierta = true;
            System.out.println("[" + tipo + "] Puerta ABRIMOS.");
        }
    }

    public void cerrar() {
        if (abierta && !obstaculoDetectado) { // Manejo de sensores [cite: 41]
            this.abierta = false;
            System.out.println("[" + tipo + "] Puerta CERRADA.");
        } else if (obstaculoDetectado) {
            System.out.println("[" + tipo + "] *ALERTA*: No se puede cerrar, obstáculo detectado. Puerta ABIERTA.");
            // Esto podría ser una alerta de falla para mantenimiento (Criterio 7) [cite: 51, 66]
        }
    }
    
    // Simulación del sensor de seguridad [cite: 41]
    public void detectarObstaculo(boolean hayObstaculo) {
        this.obstaculoDetectado = hayObstaculo;
    }
    
    // Simulación del botón "Mantener puertas abiertas" (Criterio 6) [cite: 47, 66]
    public void mantenerAbierta() {
        if (abierta) {
            System.out.println("[" + tipo + "] Botón 'Mantener Abiertas' presionado. Puerta permanecerá abierta más tiempo.");
        }
    }

    // Getters para encapsulación
    public boolean isAbierta() {
        return abierta;
    }
}
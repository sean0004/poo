// Botón en el piso para llamar al ascensor (subida o bajada)
public class BotonLlamada extends Boton {
    protected int pisoActual;
    protected String direccion; // "SUBIR" o "BAJAR"

    public BotonLlamada(int pisoActual, String direccion) {
        super("Piso " + pisoActual + " " + direccion);
        this.pisoActual = pisoActual;
        this.direccion = direccion;
    }

    @Override
    public void enviarSolicitud(SistemaControl sistema) {
        if (isPresionado()) {
            System.out.println("[Piso " + pisoActual + "] Solicitud de " + direccion + " enviada.");
            sistema.agregarSolicitudLlamada(pisoActual, direccion);
            // El botón se soltará después de que el ascensor llegue y se abra
        }
    }

    public String getDireccion() {
        return direccion;
    }
}
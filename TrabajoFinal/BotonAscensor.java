// Botón dentro del ascensor para seleccionar destino
public class BotonAscensor extends Boton {
    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        super("Destino " + pisoDestino);
        this.pisoDestino = pisoDestino;
    }

    @Override
    public void enviarSolicitud(SistemaControl sistema) {
        if (isPresionado()) {
            System.out.println("[Ascensor] Solicitud de destino al piso " + pisoDestino + " enviada.");
            sistema.agregarSolicitudDestino(pisoDestino);
            // El botón se soltará después de que el ascensor llegue al piso
        }
    }
}
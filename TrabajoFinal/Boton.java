public abstract class Boton {
    // Atributos protegidos para encapsulación
    protected boolean presionado;
    protected String etiqueta;

    public Boton(String etiqueta) {
        this.etiqueta = etiqueta;
        this.presionado = false;
    }

    // Método para simular la iluminación/sonido (Criterio 4) 
    public void presionar() {
        if (!presionado) {
            this.presionado = true;
            System.out.println("-> Botón '" + etiqueta + "' PRESIONADO. Indicador: ON.");
            // Lógica para emitir sonido suave (requerimiento) [cite: 31]
        }
    }

    public void soltar() {
        this.presionado = false;
        System.out.println("-> Botón '" + etiqueta + "' liberado. Indicador: OFF.");
    }

    // Getters y Setters (encapsulación)
    public boolean isPresionado() {
        return presionado;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
    
    // Método abstracto que debe ser implementado por subclases
    public abstract void enviarSolicitud(SistemaControl sistema);
}
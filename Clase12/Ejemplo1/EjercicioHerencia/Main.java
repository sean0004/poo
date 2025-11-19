class Balon {
    private String marca;
    private String color;
    private double tamano; // en centímetros

    public Balon() {
        this.marca = "Genérica";
        this.color = "Blanco";
        this.tamano = 22.0;
    }

    public Balon(String marca, String color, double tamano) {
        this.marca = marca;
        this.color = color;
        this.tamano = tamano;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getTamano() { return tamano; }
    public void setTamano(double tamano) { this.tamano = tamano; }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Tamaño: " + tamano + " cm");
    }
}

class BalonFutbol extends Balon {
    private String tipo; 
    private double presion;

    public BalonFutbol() {
        super();
        this.tipo = "Entrenamiento";
        this.presion = 10.5;
    }

    public BalonFutbol(String marca, String color, double tamano, String tipo, double presion) {
        super(marca, color, tamano);
        this.tipo = tipo;
        this.presion = presion;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getPresion() { return presion; }
    public void setPresion(double presion) { this.presion = presion; }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Tipo de balón: " + tipo);
        System.out.println("Presión: " + presion + " PSI");
    }
}

public class Main {
    public static void main(String[] args) {
        BalonFutbol balon1 = new BalonFutbol();
        System.out.println("=== BALÓN 1 ===");
        balon1.mostrarInfo();

        System.out.println();

        BalonFutbol balon2 = new BalonFutbol("Adidas", "Blanco y negro", 22.5, "Profesional", 12.0);
        System.out.println("=== BALÓN 2 ===");
        balon2.mostrarInfo();
    }
}
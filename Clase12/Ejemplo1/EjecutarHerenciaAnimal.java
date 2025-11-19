public class EjecutarHerenciaAnimal {
    public static void main(String[] args) {
        
        Animal Tomoe = new Gato();
        Animal Doki = new Perro();

        Tomoe.hacerSonido();
        Doki.hacerSonido();
    }
}
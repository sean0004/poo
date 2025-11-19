package Clase7;


public class persona {

    //atributos
    private int Identificacion;
    private String nombres;
    private String apellidos;
    private int edad;
    private Double estatura;
    private Double peso;

    //Método construtor de la clase se reconoce proque lleva el mismo nombre de la clase 
    //El construtor de la clase me permite inicializar la clase
    //la palabra this"
    public persona(int Identificacion, String nombres, String apellidos, int edad, double estatursa, double peso, Double estatura){
        this.Identificacion = Identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }
    
    //Métodos
    public Void caminar (){
        System.out.println("caminar");
    }
    public Boolean jugar (){
        return true;
    }
    public Void comer (){
        System.out.println("comiendo");
    }
    public String estudiar (){
        return "Usted esta estudiando";
    }

    
}
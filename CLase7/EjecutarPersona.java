public class EjecutarPersona {
    public static void main(String[] args) {
        
        //Creación del objeto
        //El operador "new" me permite instanciar(crear) el objeto
        persona objPersona1 = new Persona. (1006234, 
                                            "Juan Manuel", 
                                            "Quijano López", 
                                            23, 
                                            1.80, 
                                            70.3);

        persona objPersona2 = new Persona (123408, 
                                            "Oscar Daniel", 
                                            "Balanta Villegas", 
                                            17, 
                                            1.84, 
                                            65.0);

        System.out.println(objPersona2.estudiar());
    }
}
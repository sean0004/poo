public class Vehiculo {
    
    private String placa;
    private Motor motor;  //Composición --> relación fuerte
    
    public Vehiculo(String placa, Motor motor){
        this.placa = placa;
        this.motor = motor;
    }
    
    public void asignarConductor(Conductor conductor){  //Agregación --> relación débil
        System.out.println("El conductor(a): " + conductor + " fue asignad@");
    }
    
    public String toString(){
        return "Vehiculo { Placa: " + placa + " Motor: " + motor + " }";  
    }
}
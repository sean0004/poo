public class Main {
    public static void main(String[] args) throws Exception {
        Motor objMotor = new Motor("FE3456", "Mercedez");
        Conductor objConductor = new Conductor(90876, "Lio Messi");
        
        System.out.println(objMotor); //Motor { Serial: FE3456 Fabricante: Mercedez }
        System.out.println(objConductor);// Conductor { Cédula: 90876 Nombre: Lio Messi }

        Vehiculo objVehiculo = new Vehiculo("POM321", objMotor); 
        
        System.out.println(objVehiculo); //Vehiculo { Placa: POM321 Motor: Motor { Serial: FE3456 Fabricante: Mercedez } }
        objVehiculo.asignarConductor(objConductor); //El conductor(a): Conductor { Cédula: 90876 Nombre: Lio Messi } fue asignad@

    }
}
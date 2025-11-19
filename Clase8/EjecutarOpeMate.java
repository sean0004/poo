import java.util.Scanner;

public class EjecutarOpeMate {
    public static void main(String[] args) {
        //Clase Scanner para leer datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer número...");
        //Con el objeto sc llamamos los metodos de la clase Scanner, por ejemplo: sc.nextInt()
        int a = sc.nextInt();
        System.out.println("Digite el segundo número...");
        int b = sc.nextInt();

        /*
         * Para leer enteros: nexInt() ó nextlong()
         * Para leer reales: nextdouble() ó nextfloat()
         * Para leer cadenas: next() ó nextline()
         * Para leer booleanos: nextboolean()
         */
        OperacionesMatematicas objOp = new OperacionesMatematicas(8, 6);

        System.out.println("El resultado de la suma es:" + objOp.sumar());
        System.out.println("El resultado de la resta es:" + objOp.restar());
        System.out.println("El resultado de la multiplicaion es:" + objOp.multiplicar());
        System.out.println("El resultado de la division es:" + objOp.dividir());

        sc.close();

        //Tarea: implementar los metodos:
        //Elevar al cuadrado
        //Elevar al cubo
        //Elevar a la n 
        //Sacar la raiz cuadrada
        //Sacar la raiz cubica
        //Sacar la raiz n
        //Todo lo anterior con un menu de opciones 

        
    }
    
}
public class PracticaCondicionales {

    public static void main(String[] args) {

        /*
         * Ejercio 4.1.a
         * Requerimiento: Si un ángulo recto a 90 grados, imprimir el
         * mensaje "El ángulo es un ángulo recto" sino imprimir el
         * mensaje "El mensaje no es un ángulo recto".
         * 
         * Entrada ángulo
         * Proceso validar si el ángulo es igual a 90 grados
         * Salida: obtener el mensaje si es o no es un ángulo recto:
         */

         int angulo = 90;
         if (angulo == 90) {
            System.out.println("El ángulo es un ángulo recto");
        } else {
            System.out.println("El ángulo no es un ángulo recto");
        }

        /*
         * Si la temperatura es superior a 100 grados, visualizar el
         * mensaje “por encima del punto de ebullición del agua” sino
         * visualizar el mensaje “por debajo del punto de ebullición del agua”.
         * 
         * Entrada: temperatura
         * Proceso: validar que la temperatura sea superior a 100 grado
         * Salida. si alcanza o no el punto de ebullición
         */

        double temperatura = 30.0;
        if (temperatura > 100) {
            System.out.println("por encima del punto de ebullición del agua");
        } else {
            System.out.println("por denajo del punto de ebullición del agua");
        }

        // ------------------------------------------------------------------------------

        /*
         * Ejercicio 4.1.c
         * Si el número es positivo, sumar el número a total
         * de positivos, sino sumar al total de negativos.
         * 
         * Entrada: numero
         * Proceso: sumar el numero a positivos o negativos
         * Salida: ordenar la salida
         */

        int numero = 19;
        int total_numero_positivo = 0;
        int total_numero_negativo = 0;

        if (numero > 0) {
            total_numero_positivo += numero;
        } else {
            total_numero_negativo += numero;
        }

        System.out.println("El numero es positivo");
        System.out.println("El numero es negativo");

        // ------------------------------------------------------------------------------

        /*
         * Ejercicio 4.1.d
         * 
         * 
         * 
         * 
         */

        // -----------------------------------------------------------------------------

        /*
         * Ejercicio 4.9
         * Un ángulo se considera agudo si es menor de 90
         * grados, obtuso si es mayor de 90 grados y recto si
         * es igual a 90 grados. Utilizando esta información,
         * escribir un algoritmo que acepte un ángulo en grados
         * y visualice el tipo de ángulo correspondiente a los
         * grados introducidos.
         * 
         * Entrada: angulo (ang)
         * Proceso: validar si el angulo esta entre los siguientes rangos
         * angulo menor a 90, angulo mayor a 90, angulo iagual a 90
         * Salida: mostrar si es un angulo agudo, obtuso u recto
         */

        int ang = 89;
        if (ang < 90) {
            System.out.println("Angulo agudo");
        } else {
            if (ang > 90) {
                System.out.println("Angulo obtuso");
            } else {
                System.out.println("angulo recto");
            }
        }

    }

}
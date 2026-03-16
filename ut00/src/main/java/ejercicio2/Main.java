package ejercicio2;

import java.io.Console;



public class Main {
    

    public static void main(String[] args) {
        
    }

    
    class ArithmeticDemo {
        public static void main(String[] args) {
        int result = 1 + 2;
        result = result - 1; // result -= 1
        result = result * 2; // result *= 2
        result = result / 2; //result /= 2
        result = result + 8; // result += 8
        result = result % 7; // result %= 7
    }

    //Explicar con detalle qué ocurre en la instrucción: int a = 5; int i = 3; a += ++i;.
    
    public void metodo() {
        int a = 5;
        int i = 3;
        a += ++i; // i se incrementa a 4, luego a se incrementa en el nuevo valor de i (4), resultando en a = 9
    }
  
}


    /*  Ejercicio 2.3

        int result = 1 + 2;  asignacion y declaracion de variable
        result = result - 1; asignacion
        result = result * 2; asignacion
        result = result / 2; asignacion
        result = result + 8; asignacion
        result = result % 7; asignacion
    */

    //Ejercicio 2.4

    //Agregar una variante que reciba dos valores por línea de comandos, los convierta a números y realice
    // operaciones básicas.

    public static void metodo2()
    {
            Console console = System.console();
            int int1 = Integer.parseInt(console.readLine("Ingrese el primer número: "));
            int int2 = Integer.parseInt(console.readLine("Ingrese el segundo número: "));
    
            int suma = int1 + int2;
            int resta = int1 - int2;
            int multiplicacion = int1 * int2;
            double division = (double) int1 / int2;
    
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);
    }
    
    //Ejercicio 2.5

    //Indicar qué wrapper se usa para int, double y boolean, y mostrar un ejemplo breve de autoboxing o unboxing.
    // Integer para int, Double para double, Boolean para boolean
    // Ejemplo de autoboxing: Integer num = 10; (el compilador convierte automáticamente el valor primitivo al objeto wrapper)
    // Ejemplo de unboxing: int n = num; (el compilador convierte automáticamente el objeto wrapper al valor primitivo)
}

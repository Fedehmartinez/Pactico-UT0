package ejercicio1;

public class Main {


    public static void main(String[] args) {
        PruebaAtributos prueba = new PruebaAtributos();
        prueba.mostrarValores();
    }

    public static class PruebaAtributos {

        private int numero;
        private boolean bool;
        private double decimal;
        private char caracter;
        private String texto;

        public void mostrarValores() {
            System.out.println("valor del int:" + numero);
            System.out.println("valor del boolean:" + bool);
            System.out.println("valor del double:" + decimal);  
            System.out.println("valor del char:" + caracter);
            System.out.println("valor del String:" + texto);
        }

        // declarar con nombres validos:
        private int edad;
        private String nombre;

        //declarar con nombres invalidos:
        /*
        private int 1numero;  //Syntax error on token "1", delete this token
        private String @nombre;  //illegal start of type
        private double double;  //invalid VariableDeclarator
        */

        private void metodo() {
            int numero = 0;
            boolean bool = false;
            double decimal = 0.0;
            char caracter = '\u0000';
            String texto = "";

            
            System.out.println("valor del int:" + numero);
            System.out.println("valor del boolean:" + bool);        
            System.out.println("valor del double:" + decimal);
            System.out.println("valor del char:" + caracter);
            System.out.println("valor del String:" + texto);
            
            //las variables locales deben ser inicializadas antes de usarse, no tienen valores por defecto.
        }

    }  


    //comentario de una sola linea

    
    /* 
    comentario de
    varias
    lineas
    */





}
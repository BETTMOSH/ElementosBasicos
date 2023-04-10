package Metodos;

import java.util.Scanner;

public class CosasDeAves {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        /*double Peso = pedirPeso();
        int edad = pedirEdad();
        double racion = calculaRacion(Peso,edad);*/
        String ave = pedirAve();
            imprimirRación(calculaRacion(pedirPeso(ave),pedirEdad(ave))); // una vez que los métodos están hechos se puede resumir la impresión de esta manera

        }
        // tienes que crear 3 métodos
        // pide el peso de un loro y lo devuelve
        public static double pedirPeso(String ave){
            System.out.println("cuanto pesa el + " + ave + " ?");
            double peso = sc.nextDouble();
            return peso;
        }
        // pide la edad del loro y la devuelve
        public static int pedirEdad(String ave){
            System.out.println("Cuanto años tiene el" + ave +  "? ");
            int años = sc.nextInt();
            return años;
        }
        // calcula la cantidad en gramos de semillas que hay que darle con esta
        // fórmula (peso del loro / 5) + edad loro y la devuelve "return"
        public static double calculaRacion(double peso, int edad){
            double racion = (peso / 5)+ edad;
            return racion;
        }
        //imprime cuantas semillas tenemos que darle diariamente al loro.
        //(recibe la cantidad de semillas y a continuación con algún texto adicional
        public static void imprimirRación(double r){
            System.out.println("Teniendo en cuenta el peso y la edad del loro deberá darle: " + r + " gramos de semilla diariamente.");
        }
        public static String pedirAve(){
            System.out.println("De que ave se trata?: ");
            return sc.nextLine();
        }
    }


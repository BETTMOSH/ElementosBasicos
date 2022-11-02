package EstructurasDeControl;

import java.util.Scanner;

public class EjemplosIF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       /*
        System.out.println("Dime tu edad: ");
        int edad = sc.nextInt();

        // si la edad es mayor que 100 es una persona con mucha experiencia
        // si no, pues nada no decimos anda
        if (edad > 100) {
            System.out.println("Eres una perdona con mucha experiencia: ");
        }
        */
        //el resultado de la condicion es boolean; podemos simplificar

        boolean semaforoAbierto = true;
        if (semaforoAbierto == true) {
            System.out.println("Adelante, puedes pasar. ");
        } else{
            System.out.println("Detente¡ pecador. ");

        /*
        System.out.println("Introduce el numero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero es par: ");
        }else {
            System.out.println("El numero es impar: ");
        }*/
        /*
        int presupuestos = sc.nextInt();
        if( presupuestos<100) {
            System.out.println("Esto no lo puede comprar");
        } else if (presupuestos>=100 && presupuestos <200) {
            System.out.println("Comprare el paquete Basico. ");
        } else if (presupuestos>=200 && presupuestos <300){
            System.out.println("Me llevare el Estandar");
        }else if (presupuestos >= 300){
            System.out.println("Me puedo comprar el que yo quiera. ");
*/
        }
    }




}

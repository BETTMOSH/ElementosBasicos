package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Realiza un programa que pida por teclado el sueldo anual de una persona, si supera
        //los 9000 euros, mostrar un mensaje en pantalla indicando que debe abonar
        //impuestos. Si no lo supera, que indique que no debe abonarlos.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero ");
        int n = sc.nextInt();
        if(n > 9000){
            System.out.println("Usted a superado el maximo, debe pagar impuestos.");
        }else
            System.out.println("No supera el maximo, no debe pagar nada");


    }
}

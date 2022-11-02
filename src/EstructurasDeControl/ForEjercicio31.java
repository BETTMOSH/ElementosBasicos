package EstructurasDeControl;

import java.util.Scanner;

public class ForEjercicio31 {
    public static void main(String[] args) {
        //Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo:
        //el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)
        Scanner sc=new Scanner(System.in);
        System.out.print("numero: ");
        int numero = sc.nextInt();

        int factorial = 1;
        for (int i = numero; i > 0 ; i--) {

                factorial = factorial * 1;

            }
        System.out.println(numero + "! = " + factorial);

    }
}

package EstructurasDeControl;

import java.util.Scanner;

public class Recu {
    public static void main(String[] args) {
        ////Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor
        //        //de ellos.
        //        // vamos a usar dos variables auxiliares: max y min
        //        // el max lo guardaremos temporalmente el numero mayor que tengamos.
                Scanner sc = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int num1 = sc.nextInt();
        int max=num1;
        int min=num1;

        System.out.print("ingrese un numero: ");
        int num2 = sc.nextInt();
        if (num2>max){
            max=num2;
        }if (num2<max){
            min=num2;
        }
        System.out.print("numero: ");
        int num3 = sc.nextInt();
        if (num3 > max){
            max=num3;
        }if (num3<max){
            max=num3;
            min=num3;
        }
        System.out.print("numer: ");
        int num4 = sc.nextInt();
        if (num4 > max){
            max = num4;
        }
        if (num4< max) {
            min=num4;
        }
        System.out.print("numero: ");
        int num5 = sc.nextInt();
        if (num5 > max){
            max=num5;
        }if (num5 < max){
            min=num5;
        }
        System.out.println("El numero mayor es: " + max );
        System.out.println("Y el numero menor es: " + min + " veces.");
    }
}

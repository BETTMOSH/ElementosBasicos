package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        //Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor
        //de ellos.
        Scanner sc = new Scanner(System.in);
        // vamos a usar dos variables auxiliares: max y min
        // el max lo guardaremos temporalmente el numero mayor que tengamos.
        System.out.println("Numero: ");
        int n1 = sc.nextInt();
        int max = n1;
        int min = n1;
        System.out.println("Numero: ");
        int n2 = sc.nextInt();
        if (n2>max){   // si n2 es mayor que el que teniamos, lo guardamos en max
            max=n2;
        }
        if (n2<min){   // si n2 es menor que el que teniamos se guarda en min
            min=n2;
        }
        System.out.println("Numero: ");
        int n3 = sc.nextInt();
        if (n3>max){
            max=n3;
        }if (n3 < max){
            min=n3;
        }
        System.out.println("Numero: ");
        int n4 = sc.nextInt();
        if (n4>max){
            max=n4;
        }if (n4 < max){
            min = n4;
        }
        System.out.println("Numero: ");
        int n5 = sc.nextInt();
        if (n5>max){
            max=n5;
        }if (n5 < max){
            min = n5;
        }
        System.out.println("Numero: ");
        int n6 = sc.nextInt();
        if (n6>max){
            max=n6;
        }if (n6<max){
            min=n6;
        }
        System.out.println("Numero: ");
        int n7 = sc.nextInt();
        if (n7>max){
            max=n7;
        }if (n7<max){
            min=n7;
        }
        System.out.println("Numero: ");
        int n8 = sc.nextInt();
        if (n8>max){
            max=n8;
        }if (n8 < max){
            min=n8;
        }
        System.out.println("Numero: ");
        int n9 = sc.nextInt();
        if (n9>max){
            max=n9;
        }if (n9 < max){
            min = n9;
        }
        System.out.println("Numero: ");
        int n10 = sc.nextInt();
        if (n10>max){
            max=n10;
        }if (n10 < max){
            min=n10;
        }


        System.out.println("El numero mayor introducido es: " + max);
        System.out.println("El numero menor introducido es: " + min);

    }
}

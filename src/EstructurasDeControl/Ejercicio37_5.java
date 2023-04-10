package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio37_5 {
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
            min=3;
        }
        System.out.println("Numero: ");
        int n4 = sc.nextInt();
        if (n4>max){
            min=n4;
        }
        System.out.println("Numero: ");
        int n5 = sc.nextInt();
        if (n5>max){
            min=5;
        }
        System.out.println("Numero: ");
        int n6 = sc.nextInt();
        if (n6>max){
            min=6;
        }
        System.out.println("Numero: ");
        int n7 = sc.nextInt();
        if (n7>max){
            min=7;
        }
        System.out.println("Numero: ");
        int n8 = sc.nextInt();
        if (n8>max){
            min=8;
        }
        System.out.println("Numero: ");
        int n9 = sc.nextInt();
        if (n9>max){
            min=9;
        }
        System.out.println("Numero: ");
        int n10 = sc.nextInt();
        if (n10>max){
            min=10;
        }


        System.out.println("El numero mayor introducido es: " + max);
        System.out.println("El numero mayor introducido es: " + min);

    }
}

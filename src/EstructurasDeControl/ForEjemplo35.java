package EstructurasDeControl;

import java.util.Scanner;

public class ForEjemplo35 {
    public static void main(String[] args) {
        //Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado,
        //siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo,
        //para n = 5:
        // *****
        //****
        //***
        //*
        Scanner sc=new Scanner(System.in);
        System.out.print("introduce el numero: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i--) {

            for (int j = 1; j <= n; j--) {
            }
            System.out.println("* ");

        }
        System.out.println(" ");
    }
}

package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //Escribe un programa que lea un número de tres cifras y muestre el número invertido.
        //Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si
        //introducimos 976, el programa debe mostrar 679.

        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3, numeros, inverso;
        System.out.println("Intruce las sifras a invertir: ");
        numeros = scanner.nextInt();

        n1 = numeros % 10;
        n2 = numeros / 10 % 10;
        n3 = numeros / 100;
        inverso = n3 + (n2 * 10) + (n1 * 100);

        System.out.printf("El numero invertido es: " + inverso);


    }
}

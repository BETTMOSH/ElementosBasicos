package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        //Escribe un programa que lea tres números enteros e imprima true si el primer
        //número está entre el segundo y el tercero (ambos inclusive). De lo contrario, debe
        //imprimir false.
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los numeros enteros: ");

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        boolean comprobacion = (n1 >=n2 && n1<=n3) || (n1<=n2 && n1 >=n3);
        System.out.println("Cumple condición: " + comprobacion);





    }
}

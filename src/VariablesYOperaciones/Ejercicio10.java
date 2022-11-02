package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Dado un número de dos dígitos, imprime su primer número (las decenas).
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de dos digitos: ");
        int numero = sc.nextInt();

        // LAS DECENAS SON EL COCIENTE
        System.out.print("Las decenas son: " + (numero / 10));
        System.out.println("... y las unidades, " + (numero % 10));
    }
}

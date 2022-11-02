package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        //20. Realizar un programa que lea cuatro valores numéricos e imprima su suma y su
        //media. Ten en cuenta que la media puede contener decimales.

        // para vamos a calcular la media trabajaremos con valores decimales.

        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextInt();
        double n2 = sc.nextInt();
        double n3 = sc.nextInt();
        double n4 = sc.nextInt();

        double suma = n1 + n2 + n3 +n4;
        double media = suma / 4;
        System.out.println("suma" + suma);
        System.out.println("media" + media);
    }
}

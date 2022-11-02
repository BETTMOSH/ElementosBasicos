package PracticandoEnCasa;

import java.util.Scanner;

public class IntercambiarValores {
    public static void main(String[] args) {
        // Programa que recibe dos variables numéricas A y B, y después
        //intercambia los valores de las mismas.
        // Usaremos el metodo auxiliar en este caso el C.
        Scanner sc = new Scanner(System.in);
        int valorA,valorB,valorC;

        System.out.println("Introduce el valor de A: ");
        valorA=sc.nextInt();
        System.out.println("Valor de B: ");
        valorB = sc.nextInt();
        valorC = valorA;
        valorA= valorB;
        valorB = valorC;
        System.out.println("el de vale de A es: "+ valorA + valorB);

    }
}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //haz un programa que lea 5 numeros decimales y lo imprima al revés
        Scanner sc = new Scanner(System.in);

        double[] n = new double[5];
        for (int i = 0; i < n.length; i++) {
            System.out.println("el numero " + (i + 1) + ": ");
            n[i]=sc.nextDouble();
        }
        // para imprimir al revés
        for (int i = n.length -1; i >= 0 ; i++) {
            System.out.println(n[i] + " : ");
        }
    }
}

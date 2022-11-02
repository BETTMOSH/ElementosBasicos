package EstructurasDeControl;

import java.util.Scanner;

public class ForEjercicio24 {
    public static void main(String[] args) {
        //Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es
        //menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b,
        //ambos inclusive.
        Scanner sc=new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        // tenemos que hacer una suma desde a hasta b
        // declaramos una suma iniciall en 0
        int suma=0;
        for(int i = a; i <=b; i++){
            // vmos sumano asuma todos lo snumeros desde a hasta b
            suma = suma + i;
        }
        System.out.println("resueltado: " + suma);
    }
}

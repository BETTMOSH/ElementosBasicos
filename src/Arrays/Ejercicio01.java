package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los
        //muestre en el mismo orden introducido.
        Scanner sc = new Scanner(System.in);
        double[] n = new double[5];
        for (int i = 0; i < n.length; i++) {
            System.out.println("el numero " + (i + 1) + ": ");
        n[i]=sc.nextDouble();
        }
        System.out.println(Arrays.toString(n));

    }
}

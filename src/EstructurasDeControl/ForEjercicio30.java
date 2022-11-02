package EstructurasDeControl;

import java.util.Scanner;

public class ForEjercicio30 {
    public static void main(String[] args) {
        //Hacer un programa que calcule la suma y el producto de los 30 primeros números
        //naturales.
        //Scanner sc = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i <= 30; i++) {
            suma += i;
        }
            System.out.println("suma: " + suma);

        double producto = 1;
        for (int i = 1; i < 31; i++) {
            producto *= i;
            System.out.printf("producto: " + producto + " ");

        }
    }
}

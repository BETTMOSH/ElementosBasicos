package VariablesYOperaciones;


import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Escribir un programa en el cual se piden cuatro números y se calcule e imprima la
        //suma de los dos primeros y el producto del tercero y el cuarto.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los numeros ");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int suma = num1+num2;
        int producto = num3 * num4;
        System.out.println("la suma de los dos primeros es: " + suma + " y el producto de los dos finales es: "+ producto);

    }
}

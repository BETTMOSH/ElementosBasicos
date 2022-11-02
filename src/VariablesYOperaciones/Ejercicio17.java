package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        //17. Calcular el área de un triangulo ( base * altura)/2.

        Scanner sc = new Scanner(System.in);
        System.out.print("Base:");
        double base = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        //Resuelve el ejercicio primero con variables de tipo entero
        // y después con variables de tipo float.
        double area = (base * altura) /2;
        //mostramos el resultado
        System.out.println("Area: " + area);

    }
}

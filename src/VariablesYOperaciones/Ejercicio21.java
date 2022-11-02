package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        //Realiza un programa que pida las notas de las tres evaluaciones del módulo
        //Programación y muestre la nota final (la nota final es la media de las tres
        //evaluaciones).
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera evaluacion: ");
        double n1 = sc.nextDouble();
        System.out.println("Ingrese la segunda evaluacion: ");
        double n2 = sc.nextDouble();
        System.out.println("Ingrese la tercera evaluacion: ");
        double n3 = sc.nextDouble();
        double suma = n1 + n2 + n3;
        double media = suma / 3;
        System.out.printf("La nota final es %.2f ", media);
    }
}

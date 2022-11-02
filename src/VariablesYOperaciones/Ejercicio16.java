package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        //Realiza un programa que pida el lado de un cuadrado,
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el lado del cuadrado en cms: ");
        double lado = sc.nextInt();

        //calcular el perimetro(El perímetro de un cuadrado se calcula multiplicando el valor
        // del lado por cuatro).
        double perimetro = lado * 4;

        // y muestre por pantalla el
        // perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor
           //     del lado por cuatro).
        System.out.println("perimetro: "+ perimetro + " cms.");

    }
}

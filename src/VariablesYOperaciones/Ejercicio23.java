package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        //Realiza un programa que pida un número y un porcentaje, y
        //a. Calcule y muestre ese número incrementado en ese porcentaje.
        //b. Calcule y muestre ese número decrementado en ese porcentaje.
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        double numero = sc.nextDouble();
        System.out.println("porcentaje ");
        double porcentaje = sc.nextDouble();
        // a) calculamos
        double porcentajeCalculado = numero*porcentaje/100;
        System.out.println(porcentajeCalculado);

        double incrementadoConPorcentaje = numero*porcentajeCalculado;   // 500 * 17,5
        System.out.println(numero + "incremento de un " + porcentaje + "% es " + incrementadoConPorcentaje);

        //incrmentamos el numeor
        //b) calculamos y mosytramos decremento
        double decrementadoConPorcentaje = numero-porcentajeCalculado; // 500 - 17,5
        System.out.println(numero + "decremento en un " + porcentaje + "% es " + decrementadoConPorcentaje);

    }
}

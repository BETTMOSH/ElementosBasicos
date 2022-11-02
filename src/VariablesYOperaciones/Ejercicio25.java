package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio total de la compra: ");
        double precioCompra = sc.nextDouble();

        double descuento = precioCompra*15/100;
        System.out.println("debe abonar: " + precioCompra + " € ");


    }
}

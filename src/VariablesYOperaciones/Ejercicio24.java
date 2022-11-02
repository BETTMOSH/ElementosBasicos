package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("precio: ");
        double precio = sc.nextDouble();

        System.out.println("cantidad de productos: ");
        int cantidad = sc.nextInt();

        System.out.println("Porcentaje de IVA a aplicar: ");
        double porcentajeIva = sc.nextDouble();

        double precioSinIva = precio * cantidad;
        System.out.println();

        double ivaCalculado = precioSinIva * porcentajeIva;
        System.out.println();




    }
}

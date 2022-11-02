package VariablesYOperaciones;

import java.util.Scanner;

public class Ejericicio26 {
    public static void main(String[] args) {
        //Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
        //vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
        //tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
        //su sueldo base y comisiones.
        Scanner sc = new Scanner(System.in);
        //datos que necesitamos verificar
        System.out.println("sueldo base: ");
        double sueldoBase = sc.nextDouble();
        System.out.println("importe venta 1: ");
        double venta1 = sc.nextDouble();
        System.out.println("importe venta 2: ");
        double venta2 = sc.nextDouble();
        System.out.println("importe venta 3: ");
        double venta3 = sc.nextDouble();

        double comisiones1 = venta1 * 10 /100;
        double comisiones2 = venta2 * 10 /100;
        double comisiones3 = venta3 * 10 /100;

        double comision = comisiones1+ comisiones2+comisiones3;
        System.out.println("Obtendra por comision: " + comision + "euros");

        double sueldoTOtal = sueldoBase + comision;
        System.out.println("el sueldo total a percibir es: " + sueldoTOtal + "euros");
    }
}

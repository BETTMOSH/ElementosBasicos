package EstructurasDeControl;

import java.util.Scanner;

public class Ejericicio36_B {
    public static void main(String[] args) {
        //Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
        //vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
        //tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
        //su sueldo base y comisiones.
        //Ejercicio 26: en vez de 3 ventas pedir por teclado el número de ventas realizadas y el
        //importe de cada venta.
        Scanner sc = new Scanner(System.in);
        //datos que necesitamos verificar



         // en vez de pedir lo del anterior tenemos que pedir el numero de ventas.

        System.out.println("numero de ventas realizadas: ");
        double ventas = sc.nextDouble();
        double comisionTotal=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("sueldo base: ");
            double sueldoBase = sc.nextDouble();

        System.out.println("importe venta "+ i + 1);
        double ventai = sc.nextDouble();
            double comisiones1 = ventai * 10 /100;
            comisionTotal=comisionTotal + comisiones1;
        }

        System.out.println("Obtendra por comision: " + comisionTotal + "euros");
        double sueldoBase=0;

        double sueldoTotal = sueldoBase + comisionTotal;
        System.out.println("el sueldo total a percibir es: " + sueldoTotal + "euros");
    }
}

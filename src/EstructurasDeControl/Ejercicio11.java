package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //11. Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si
        //es un número divisible por 4, pero no si es divisible por 100, excepto que también
        //sea divisible por 400.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el año");
        int año = sc.nextInt();

        if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) {
                System.out.println("El año es Bisiesto");
        }else {
            System.out.println("El año no es Bisiesto");
        }

    }
}

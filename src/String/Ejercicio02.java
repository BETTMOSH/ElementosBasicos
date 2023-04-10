package String;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Realizar un programa que comprueba si una cadena leída por teclado comienza por una
        //subcadena introducida también por teclado.
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String subCadena=sc.nextLine();
        boolean resultado = cadena.startsWith(subCadena);
        System.out.println("¿\"" + cadena + "\" empieza por \"" + subCadena + "\"? :" + resultado);
    }
}

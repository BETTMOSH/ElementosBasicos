package String;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        // Escribe un programa que compruebe si una cadena dada comienza por “J”, sin que tenga en
        //cuenta si está en mayúsculas o minúsculas. El programa debe imprimir true o false.
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        boolean resultado = cadena.startsWith("J") || cadena.startsWith("j");
        System.out.println("¿Empeza por J o j?: " + resultado);
    }
}

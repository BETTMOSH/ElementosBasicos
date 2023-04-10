package String;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        // Escribe un programa que lea dos cadenas y las compare sin tener en cuenta los espacios en
        //blanco. El programa debería imprimir true si son iguales, false en caso contrario.
        Scanner sc = new Scanner(System.in);
        String cadena1 = sc.nextLine();
        String cadena2 = sc.nextLine();
        cadena1 = cadena1.replace(" ", "");
        cadena2 = cadena2.replace(" ", "");
        System.out.println("son iguales? : " + cadena1.equals(cadena2));  // distinguiendo mayúscula de minúsculas.
        // si me da igual mayúsculas a minúsculas.
        System.out.println("son iguales? : " + cadena1.equalsIgnoreCase(cadena2));

    }
}

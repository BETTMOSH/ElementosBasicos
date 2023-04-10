package String;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        //Escribe un programa que lea una cadena de texto que consista en un nombre y sus apellidos
        //y a continuación muestre las iniciales en mayúsculas.

        Scanner sc = new Scanner(System.in);
        String cadena= sc.nextLine();
        System.out.print(cadena.substring(0,1));
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') { // si el carácter está en la posición que estoy mirando es un '' espacio en blanco imprime el siguiente.
                System.out.print( "." + cadena.charAt(i+1));
            }
        }

    }
}

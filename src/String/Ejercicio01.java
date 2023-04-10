package String;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Escribir por pantalla cada carácter de una cadena introducida por teclado.
        Scanner sc = new Scanner(System.in);
        /*System.out.println("introduzca una frase");
        String cadena = sc.nextLine();
        for (int i = 0; i <= cadena.length() -1 ; i++) {  //recordemos el string desde el primer
                                                      // carácter primera posición int i "0" hasta el último.
            System.out.print(cadena.charAt(i) + " ");

        }*/
        System.out.println("introduzca una frase");
        String cadena = sc.nextLine();
        int contar = 0;
        for (int i = 0; i <= cadena.length() - 1; i++) {
            System.out.print(cadena.charAt(i) + " " );
            if (cadena.charAt(i) != cadena.length()){
                contar++;
            }
        }
        System.out.println("\nLa frase tiene: " + contar + " caracteres");
    }
}

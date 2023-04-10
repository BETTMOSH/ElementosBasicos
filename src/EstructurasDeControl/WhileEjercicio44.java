package EstructurasDeControl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileEjercicio44 {
    public static void main(String[] args) {
        //Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO
        //VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            System.out.println("introduce un caracter: ");
            c = sc.nextLine().charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'
                    || c == 'I' || c == 'O' || c == 'U') {
                System.out.println("vocal");
            } else {
                System.out.println("no vocal");
            } if (c == ' ') {
                break;
            }
        } while (c != ' ');
    }
}

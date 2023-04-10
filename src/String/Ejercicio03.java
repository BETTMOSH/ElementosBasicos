package String;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        //Escribe un programa que lea una cadena de texto y reemplace todas las ocurrencias de la
        //letra ‘a’ con la letra ‘b’. A continuación debe imprimir la cadena resultante.

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace("a", "b");
        System.out.println(str);

    }
}

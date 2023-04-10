package String;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Pide una cadena y dos caracteres por teclado y sustituye la aparición del primer carácter en
        //la cadena por el segundo carácter.
        System.out.println("introducir una cadena");
        String cadena=sc.nextLine();
        System.out.println("introducir dos caracteres");
        String caracter=sc.nextLine();
        cadena=cadena.replace(caracter.charAt(0), caracter.charAt(1));
        System.out.println(cadena);

    }
}

package String;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        //Suponiendo que hemos introducido una cadena por teclado que representa una frase
        //(palabras separadas por espacios), realiza un programa que cuente cuántas palabras tiene.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = sc.nextLine();
        cadena = cadena.trim();
        int contador = 1;
        for (int i = 0; i <cadena.length()-1 ; i++) {
        if (cadena.charAt(i)==' '){
            contador++;
        }
        if (cadena.equals("")){
            contador=0;
        }
        }
        System.out.println("La frase tiene: " + contador + " palabras");


    }

}

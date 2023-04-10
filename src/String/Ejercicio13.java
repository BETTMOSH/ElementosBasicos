package String;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma
        //es aquella que se lee igual adelante que atrás.
        Scanner sc = new Scanner(System.in);
        String cadena= sc.nextLine();
        cadena=cadena.replace(" ", "");
        //System.out.println(cadena);
        String invertida = "";
        for (int i = cadena.length()-1; i >=0 ; i--) {
            invertida+=cadena.charAt(i);
        }
        if (cadena.equals(invertida)){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No, no lo es");
        }
    }
}

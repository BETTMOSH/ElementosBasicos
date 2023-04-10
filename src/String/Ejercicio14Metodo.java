package String;

import java.util.Scanner;

public class Ejercicio14Metodo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        imprimirPalabras(contarPalabras(pedirFrase()));
    }
    // un método que pida las frases
    public static String pedirFrase(){

        System.out.println("Ingrese una frase");
        String fra = sc.nextLine();
        return fra;
    }
    // otro método que calcule las palabras
    public static int contarPalabras(String cadena){
        int contador = 1;

        for (int i = 0; i < cadena.length()-1; i++) {
            if (cadena.charAt(i) == ' '){
                contador++;
            }
        }
        return contador++;
    }
    //que imprima las palabras
    public static void imprimirPalabras(int contador){
        System.out.println("La frase tiene: " + contador + " palabras");
    }
}

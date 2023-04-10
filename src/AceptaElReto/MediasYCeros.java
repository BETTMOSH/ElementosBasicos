package AceptaElReto;

import java.util.Scanner;

public class MediasYCeros {
    public static void main(String[] args) {
        //pedir 10 números y mostrar la media de los números positivos,
        //la media de los números negativos y la cantidad de ceros.
        Scanner sc = new Scanner(System.in);
        /*double mediaPOsi = 0, mediaNega = 0;
        int contPosi = 0, contNega = 0, contCeros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("ingresa un número: ");
            int num = sc.nextInt();
            if (num > 0){
                mediaPOsi = mediaPOsi + num;
                contPosi++;
            } else if (num < 0) {
                mediaNega = mediaNega + num;
                contNega++;
            } else if (num == 0) {
                contCeros++;
            }
        }
        if (mediaPOsi == 0){
            System.out.println("\nno se puede sacar la media por que no aparece números positivos.");

        }else {
            mediaPOsi = mediaPOsi/contPosi;
        }if (mediaNega == 0){
            System.out.println("\nNo se puede sacar la media por que no aparece números negativos.");
        }else {
            mediaNega = mediaNega/contNega;
        }
        System.out.printf("\nLa media de positivos es: %.2f" , mediaPOsi);
        System.out.printf("\nLa media de positivos es: %.2f" , mediaNega);
        System.out.println("\nLa media de positivos es: " + contCeros);*/
        int contadorPosi = 0, contadorNega = 0, contadorCeros = 0;
        double mediaPosi = 0, mediaNegat = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número");
            int num = sc.nextInt();
            if (num == 0) {
                contadorCeros++;
            }else if (num > 0){
                mediaPosi = mediaPosi + num;
                contadorPosi++;
            } else {
                mediaNegat = mediaNegat + num;
                contadorNega++;
            }
        }
        if (mediaPosi == 0){
            System.out.println("No se puede sacar la media por que no aparecen números positivos");
        }else {
            mediaPosi = mediaPosi / contadorPosi;
        }if (mediaNegat == 0){
            System.out.println("No se puede sacar la media por que no aparecen números negativos");
            mediaNegat = mediaNegat / contadorNega;
        }
        System.out.printf("\nLa media de números positivos es: " + mediaPosi);
        System.out.printf("\nLa media de números negativos es: " + mediaNegat);
        System.out.printf("\nLa media de ceros es: " + contadorCeros);
    }
}

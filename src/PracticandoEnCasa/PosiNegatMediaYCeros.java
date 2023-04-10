package PracticandoEnCasa;

import java.util.Scanner;

public class PosiNegatMediaYCeros {
    public static void main(String[] args) {
        //pedir 10 números y mostrar la media de los números positivos,
        //la media de los números negativos y la cantidad de ceros.
        Scanner sc = new Scanner(System.in);
        /*int nPositivos = 0, nNegativos = 0, nCeros=0;
        double mediaPosi=0, mediaNegat=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce 10 números:");
            int num = sc.nextInt();
            if (num > 0) {
                mediaPosi += num;
                nPositivos++;
            } else if (num == 0) {
                nCeros++;
            } else if (num < 0) {
                mediaNegat += num;
                nNegativos++;

            }
        }
            if (nPositivos == 0){
                System.out.println("no se puede sacar la media de positivos ");
            }else {
                mediaPosi = mediaPosi / nPositivos;
                System.out.printf("la media de los positivos es: %.2f",  mediaPosi);
            }if (nNegativos == 0){
                System.out.println("\nno se puede sacar la media de los negativos.");
            }else {
                mediaNegat = mediaNegat / nNegativos;
                System.out.printf("\nLa media de numeros negativos es: %.2f",  mediaNegat);
            }
            System.out.println("\nla cantidad de ceros es: " + nCeros);*/



        //pedir 10 números y mostrar la media de los números positivos,
        //la media de los números negativos y la cantidad de ceros.
        double mediaPosi = 0, mediaNega = 0;
        int nPositivos = 0, nNegativos = 0, nCeros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("ingrese 10 números: ");
            int num =  sc.nextInt();
            if (num > 0){
                mediaPosi += num;
                nPositivos++;
            }else if (num < 0){
                mediaNega += num;
                nNegativos++;
            }else if (num == 0){
                nCeros++;
            }
        }
            if (nPositivos == 0){
                System.out.println("\nno se puede sacar la media por que no hay números positivos");
            }else {
                mediaPosi = mediaPosi/nPositivos;
                System.out.printf("\nla media de positivos es: %.2f ", mediaPosi);
            }if (nNegativos == 0){
            System.out.println("\nNo se puede obtener la media por que no hay números negativos");
            }else {
            mediaNega = mediaNega/nNegativos;
            System.out.printf("\nLa media de negativos es: %.2f ", mediaNega);
        }
        System.out.println("\nel total de Ceros es: " + nCeros);
        }

    }


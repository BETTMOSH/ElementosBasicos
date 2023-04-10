package ParaPracticar;

import java.util.Scanner;

public class MediaPositNegaYCeros {
    public static void main(String[] args) {
        //pedir 10 números y mostrar la media de los números positivos,
        //la media de los números negativos y la cantidad de ceros.
        Scanner sc = new Scanner(System.in);
        int contadorPosi=0, contadorNega=0,contadorCeros=0;
        double numPositivos=0, numNegativos=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.print("ingrese 10 números: ");
            int numero = sc.nextInt();
            if (numero == 0) {
                contadorCeros++;
            } else if (numero > 0) {
                numPositivos += numero;
                contadorPosi++;
            } else {
                numNegativos += numero;
                contadorNega++;
            }
        }
        if (contadorPosi==0){
            System.out.println("no se puedes sacar la media de los positivos");
        }
        else {
            numPositivos=numPositivos/contadorPosi;
            System.out.printf("la media de los positivos es: %.2f" , numPositivos);
        }if (contadorNega==0){
            System.out.println("\nno se puede sacar la media de los negativos");
        }else{
            numNegativos=numNegativos/contadorNega;
            System.out.printf("la media de los negativos es: %.2f",  numNegativos);
        }
        System.out.println("la cantidad de ceros es: " + contadorCeros+ "\t");
    }
}

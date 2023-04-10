package ParaPracticar;

import java.util.Scanner;

public class Practicar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos numeros vas a introducir");
        int numerosAIntroducir = sc.nextInt();
        int contadorPostivo=0, contadorNegativo=0,contadorDeCeros=0;
        int numero;
        for (int i = 0; i < numerosAIntroducir; i++) {
            System.out.print("introduzca los numeros: ");
            numero = sc.nextInt();
            if (numero > 0){
                contadorPostivo++;
            }else if (numero < 0){
                contadorNegativo++;
            }else {
                contadorDeCeros++;
            }
        }
        System.out.println(contadorPostivo + " positivos " );
        System.out.println(contadorNegativo + " negativos ");
        System.out.println(contadorDeCeros + " ceros ");
    }
}

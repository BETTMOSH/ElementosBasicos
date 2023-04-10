package EstructurasDeControl;

import java.util.Scanner;

public class forEjercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Hacer un programa que imprima por pantalla los 50 primeros múltiplos de 5,
        //añadiendo un salto de línea cada 10 números.

        int contadorMulti5=0;
        int numero=1;
        while (contadorMulti5 <50){
            if (numero%5==0){
                System.out.print(numero + " ");
                contadorMulti5++;
                if (contadorMulti5%10==0){
                    System.out.println();
                }

            }
            numero++;

        }



    }
}

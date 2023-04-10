package EstructurasDeControl;

import java.util.Scanner;

public class DoWhile42 {
    public static void main(String[] args) {
        //Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.
        Scanner sc = new Scanner(System.in);
        int contadorMultiplo5 = 0;
        int numero=1;  // inicializo en 1 porque no quiero que salga 0 como multiplo de 5
        while (contadorMultiplo5 < 20 ){
            if (numero%5==0){
                System.out.println(numero);
                contadorMultiplo5++;
            }
            numero++;
        }

    }
}

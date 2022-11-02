package EstructurasDeControl;

import java.util.Scanner;

public class DoWhileEjemplo {
    public static void main(String[] args) {
        //La vcentaja que tiee do-while es que siempre va a ejecutar llo de adentro del bloqueal menos una vez
        //pedimos numeros y 0 para salir
       /* Scanner sc = new Scanner(System.in);
        System.out.println("intrudcue numeros: y 0 para salir ");
        int numero = 0;
        do{
            numero = sc.nextInt();
        }while (numero!=0); // mientras eso no sea false va a seguir pideindo numeros.*/


        //Escribe un programa que solicite al usuario un numero entre 1 y 100, ambos inclusive
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("introduce numeros entre 1 y 100: ");
            n = sc.nextInt();
            if (n < 1 || n > 100){
                System.out.println("error");
            }
        }while (n <1 || n >100);
        System.out.println(n);

    }
}

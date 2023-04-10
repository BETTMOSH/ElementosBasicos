package ParaPracticar;

import java.util.Scanner;

public class MostrarNNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pedir 10 numeros y mostrar al final si se ha introducido uno negativo.
        int numero;
        boolean hay_negativos=false;
        int contadorNegativo=0;
        /*for (int i = 1; i <=10 ; i++) {
            System.out.println("introducir los numeros: ");
            numero= sc.nextInt();
            if (numero<0){
                contadorNegativos+=numero;
            }
        }
        System.out.println("la cantidad de numeros negativos es: " + contadorNegativos);*/
        for (int i = 1; i <=10 ; i++) {
            System.out.print("introducir los numeros: ");
            numero= sc.nextInt();
            if (numero < 0){
                hay_negativos=true;
                contadorNegativo++;
            }
        }
        if (hay_negativos == true){

            System.out.print("Si !! al menos hay " + contadorNegativo + " numeros negativos" );
        }else {
            System.out.print("No existe ningun numero negativo...");
        }
    }
}

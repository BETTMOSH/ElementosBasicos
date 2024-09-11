package AceptaElReto;

import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aleatorio = 0;
        int intentos = 0;
        aleatorio = (int) (Math.random() * 100);
        System.out.println("Adivina el numero del 1 al 100: ");
        while (aleatorio != 0){
            intentos++;
            int numero = sc.nextInt();
            if (aleatorio < numero){
                System.out.println("Mas bajo");
            } else if (aleatorio > numero) {
                System.out.println("Mas alto");
            }else {
                break;
        }
        System.out.println("Correcto adivinaste en " + intentos + " intentos");
    }
}

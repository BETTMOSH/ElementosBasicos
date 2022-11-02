package EstructurasDeControl;

import java.util.Scanner;

public class ForEjercicio33 {
    public static void main(String[] args) {
        //Escribe un programa que, dados dos números, uno real (base) y un entero positivo
        //(exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el
        //método Math.pow().
        Scanner sc= new Scanner(System.in);
        System.out.println("base");
        int base = sc.nextInt();
        System.out.println("exponente");
        int exponente = sc.nextInt();
        int produc = 1;
        for (int i = 0; i <exponente ; i++) {
            produc=produc*base;
        }
        System.out.println(produc);
    }
}

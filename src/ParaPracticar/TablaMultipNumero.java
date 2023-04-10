package ParaPracticar;

import java.util.Scanner;

public class TablaMultipNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pide un numero que debe estar entre 0 y 10 y mostrar
        // su tabla de multiplicacion de dicho numero.
        int numero;
        do {
            System.out.println("ingrese u numero: ");
            numero= sc.nextInt();
        }while (numero<0 || numero> 10);
        System.out.println("la tabla de multiplicar del " + numero + " es: ");
        for (int i = 1; i <=10; i++) {
            System.out.println(numero + " * " + i + " = " + numero*i);
        }
    }
}

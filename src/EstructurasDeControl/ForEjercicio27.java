package EstructurasDeControl;

import java.util.Scanner;

public class ForEjercicio27 {
    public static void main(String[] args) {
        //Escribe un programa que, dado un número n introducido por teclado, dibuje un
        //cuadrado de dimensiones n * n, con un carácter también introducido por teclado.
        //
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce un numero positivo: ");
        int n = sc.nextInt();
        if (n<=0){
            System.out.println("no me vale pal cuadrado");
        }else{ //si entra por aqui es que m
            System.out.println("introduce un caracter");
            char c= sc.next().charAt(0);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c + " ");
                }
                System.out.println();

            }

            }
    }
}

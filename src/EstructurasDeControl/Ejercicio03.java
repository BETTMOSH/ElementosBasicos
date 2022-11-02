package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        //Escribe un programa que pida dos números e indique si el primero es mayor que el
        //segundo o no.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n2 = sc.nextInt();
        if(n1 > n2){
            System.out.println("el primero es mayor que es segundo ");
        }

    }
}

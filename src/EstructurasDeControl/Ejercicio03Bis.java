package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio03Bis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n2 = sc.nextInt();

        if(n1 > n2) {
            System.out.println("el primero es mayor que es segundo ");
        }else if (n1 == n2) {
            System.out.println("los dos numeros son iguales");
        }else {
            System.out.println("El primero es menor que el segundo");
        }
        }
}

package ParaPracticar;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ingresa un digito");
        int numero=sc.nextInt();
        int factorial=1;
        for (int i = 1; i <=numero; i++) {
            factorial*=i;

        }
        System.out.println("el factorial de " + numero +  " es: " + factorial);
    }
}

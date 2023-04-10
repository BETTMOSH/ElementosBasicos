package ParaPracticar;

import java.util.Scanner;

public class PractyicaFor {
    public static void main(String[] args) {
        // imprimer todos los numeros desde el 55 hasta 73
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int num1 = sc.nextInt();
        System.out.println();
        int num2 = sc.nextInt();
        int mayor=0, menor=0;

        if (num1<num2) {
            menor = num1;
            mayor = num2;
        }else{
                menor=num2;
                mayor=num1;
        }
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
}

package EstructurasDeControl;

import java.util.Scanner;

public class ForEjercicio25 {
    public static void main(String[] args) {
        //Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el
        //segundo.
        // Es decir, pedir dos números enteros por teclado e imprimir la suma de todos
        //los números enteros desde el menor hasta el mayor, ambos inclusive.
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        int suma = 0;
        int mayor,menor;
        if (a < b ) {
            menor = a;
            mayor = b;
        }else {
            menor = b;
            mayor = a;
        }
        for (int i = menor; i <=mayor ; i++) {
            suma = suma +1;
        }
        System.out.println(suma);
    }
    }

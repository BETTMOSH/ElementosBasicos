package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio11ConArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> enteros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

        }
        Collections.sort(enteros);
        System.out.println(enteros);
        int numero = 0;
        do {
            System.out.println("introduce un numero entyre 1 y 20");
            numero = sc.nextInt();
            if (numero<1 || numero>20){
                System.out.println("fuera de rango");
            }
        }while (numero<1 || numero>20);
        if (enteros == null) {
            System.out.println();
        }else{
            System.out.println("el numero no esta en el Array");
        }

    }
}

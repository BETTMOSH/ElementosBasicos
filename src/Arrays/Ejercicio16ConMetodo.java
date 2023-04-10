package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16ConMetodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Crear un programa que rellene aleatoriamente un array de 10 números enteros y a continuación pedir
        // por teclado una posición (entre 0 y 9). ELiminar el elemento de la posición sin dejar huecos.
        ArrayList<Integer> enteros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            enteros.add((int) (Math.random() * 100));
        }
        System.out.println(enteros);
        // pido el índice del elemento a eliminar entre el 0 y el 9
        int indice = 0;
        do {
            System.out.println("indice del elemento a eliminar");
            indice = sc.nextInt(); sc.nextLine();
            if (indice < 0 || indice > 9){
                System.out.println("error.... El numero debe estar entre el 0 y el 9");
            }
        }while (indice < 0 || indice > 9);
        //procedemos a eliminar
        enteros.remove(indice);
        System.out.println(enteros);
    }
}

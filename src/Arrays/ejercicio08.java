package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        //Realizar un programa que pida un tamaño de array por teclado y a continuación cree un
        //array formado por elementos aleatorios pares entre 1 y 50.
        Scanner sc = new Scanner(System.in);
        int tamaño = 0;
        do {
            System.out.println("tamaño del array");
            tamaño= sc.nextInt();
        }while (tamaño<=0);

        // creamos un array formado por elementos aleatorios pares entre 1-50 enteros
        int[]pares = new int[tamaño];
        // tenemos que utilizar un while del que saldremos cuando hayamos rellenado el array
        int i = 0;  // con esta variable llevamos la posición del aaryya, avanzará cada vez que encontremos un numero par.
        // terminamos cuando la i llegue a la última posición.--> tamaño
        while (i < pares.length){
            int numero=(int)(Math.random()* 50 + 1);

            if (numero % 2 == 0){
                pares[i] = numero;
                i++;
            }
        }
        System.out.println(Arrays.toString(pares));
    }
}

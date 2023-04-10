package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //Generar un array de 10 enteros ordenados crecientemente. Pedir un número por teclado
        //y buscarlo en el array. Se debe mostrar la posición en que se encuentra. Si no está,
        //indicarlo con un mensaje.
        Scanner sc = new Scanner(System.in);
        int[] numEnteros = new int[10];
        //lo rellenamos de números aleatoriamente entre 1 y 10
        for (int i = 0; i < numEnteros.length; i++) {
            numEnteros[i] = (int)(Math.random() * 20 + 1);
        }
        // lo ordenamos con sort
        Arrays.sort(numEnteros);
        System.out.println(Arrays.toString(numEnteros));

        //ahora empieza el ejercicio
        //pedir un número por teclado
        int numero = 0;
        do {
            System.out.println("introduce un numero entre 1 y 20: ");
            numero=sc.nextInt();
            if (numero < 1 || numero > 20 ){
                System.out.println("fuera de rango");
            }
        }while (numero<1 || numero>20);
        // lo buscamos en el array
        boolean encontrado = false; // si recorremos tod el array y no esat el valor es que no está
        for (int i = 0; i < numEnteros.length; i++) {
            if (numEnteros[i] == numero){
                // se de mostrar la posición en que se encuentra
                System.out.println("el numero " + numero + " esta en la posición " + (i + 1) + " (indice " + i + ").");
                encontrado = true;
                break;
            }
        }
        if (encontrado == false){
            // si salimos del for y encontrado sigue como false es que no está en el array
            System.out.println("el numero no esta en el Array.");
        }
    }
}

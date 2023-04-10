package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio18ConArraylist {
    public static void main(String[] args) {
        // Generar dos arrays de 10 enteros, que estarán ordenados crecientemente. Copiar
        //(fusionar) ambos en un tercero, de forma que sigan ordenados.
        ArrayList<Integer> enteros1 = new ArrayList<>();
        ArrayList<Integer> enteros2 = new ArrayList<>();
        // rellenamos aleatoriamente
        for (int i = 0; i < 10; i++) {
            enteros1.add((int) (Math.random() * 100));
            enteros2.add((int) (Math.random() * 100));
        }

        // los ordenamos en orden decreciente
        Collections.sort(enteros1);
        Collections.sort(enteros2);
        System.out.println("Primer Arraylist " + enteros1);
        System.out.println("Segundo Arraylist " + enteros2);

        // creamos un tercer arraylist que junte los 2
        ArrayList<Integer> enteros3 = new ArrayList<>();
        enteros3.addAll(enteros1);
        enteros3.addAll(enteros2);

        //los ordenamos
        Collections.sort(enteros3);
        System.out.println("Tercer Arraylist " + enteros3);
    }
}

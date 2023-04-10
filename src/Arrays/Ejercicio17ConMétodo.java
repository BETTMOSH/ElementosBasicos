package Arrays;

import java.util.Arrays;

public class Ejercicio17ConMétodo {
    public static void main(String[] args) {
        // Crear un programa que rellene aleatoriamente un array de números enteros. Guardar en otro array los elementos
        // pares del primero y a continuación, los elementos impares.
        int[] enteros = new int[10];
        int[] paresImpares = new int[10];
        // rellenamos el primer array
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(enteros));
        int posArray2 = 0; // esta variable es para guardar la posicion en el segundo array. avanzara cuando metamos un número par
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0){
                paresImpares[posArray2] = enteros[i];
                // avanzo una posicion en la posicion paresImpares
                posArray2++;
            }
        }
        System.out.println(Arrays.toString(paresImpares));
        // ahora rellenamos el resto del array: lo vuelvo a recorrer epro esta
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 != 0) {
                paresImpares[posArray2] = enteros[i];
                // avanzo una posicion en la posicion paresImpares
                posArray2++;
            }
        }
        System.out.println(Arrays.toString(paresImpares));
    }
}

package Arrays;

import java.util.Arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        //12. Rellenar aleatoriamente dos arrays (A y B) de 10 números enteros entre 1 y 10 y
        //mezclarlos en un tercero de la forma: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.
        /*int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        // Rellenamos aleatoriamente A y B
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 10 + 1);
            B[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        int cont1 = 0;
        int cont2 = 0;
        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0){
                C[i]= A[cont1];
                cont1++;
            } else if (i % 2 != 0) {
                C[i] = B[cont2];
                cont2++;
            }
        }
        System.out.println(Arrays.toString(C));*/
        int[] posicion1 = new int[10];
        int[] posicion2 = new int[10];
        int[] posicion3 = new int[20];
        int contador1 = 0;
        int contador2 = 0;
        for (int i = 0; i < posicion1.length; i++) {
            posicion1[i] = (int) (Math.random() * 10 + 1);
            posicion2[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(posicion1));
        System.out.println(Arrays.toString(posicion2));
        // rellenamos la posicion 3 con los arrays 1 y 2
        for (int i = 0; i < posicion3.length; i++) {
            if (i % 2 == 0){
                posicion3[i] = posicion1[contador1];
                contador1++;
            } else if (i % 2 != 0) {
                posicion3[i] = posicion2[contador2];
                contador2++;
            }
        }
        System.out.println(Arrays.toString(posicion3));
    }
}

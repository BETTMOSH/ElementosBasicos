package Arrays;

import java.util.Arrays;

public class Ejericico05 {
    public static void main(String[] args) {
        //Hacer un programa que inicialice una lista de números con valores aleatorios (10
        //valores), y los muestre ordenados de menor a mayor.
        // rango entre -5 y 5
        //int tamaño = 0;
        //int negativos = 0;
        //int positivo = 0;
        int[] lista = new int[10];
        for (int i = 0; i < lista.length; i++) {
            /*if (tamaño < -5 && tamaño >0){
                negativos++;
            } else if (tamaño < 0 && tamaño >5) {
                positivo++;*/
            lista[i] = (int)(Math.random()*12-6);
            }
        System.out.println(Arrays.toString(lista));
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));

    }
}

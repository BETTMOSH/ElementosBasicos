package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15ConMetodo {
    public static void main(String[] args) {
        /*15. Crear un programa que rellene aleatoriamente un array de 10 números enteros y a
        continuación desplace sus elementos una posición hacia la derecha (el último pasa a ser
                el primero).*/
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);

        }
        System.out.println(Arrays.toString(num));
        num = desplazar(num); // paso el array de enteros al metodo  en el
                              // metodo desplazar los elementos y devuelve el arraz desplazado
        System.out.println(Arrays.toString(num));
    }
    public static int[] desplazar(int[] num){
       int[] solucion = new int[10];
       // en la primera posición ira el último elemento de los números enteros
        solucion[0]= num[num.length-1];
        for (int i = 0; i <= num.length - 1; i++) {
            solucion[i + 1] = num[i];
        }
        return solucion;
    }
}

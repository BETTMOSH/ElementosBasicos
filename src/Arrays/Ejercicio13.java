package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Haz un programa que rellene por teclado un array de 5 números enteros. La aplicación
        //debe indicarnos si los números están ordenados de forma creciente, decreciente, o si
        //están desordenados.
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("numero: " + (i+1) + ":");
            int n = sc.nextInt();
            // los añadimos
            arrayList.add(n);
        }
        // comprobamos si esta ordenado si no o esta lo oredenamos
        //orden ascendente
        boolean ordenCreciente = true;
        if (!ordenCreciente){
        for (int i = 0; i < arrayList.size()-1; i++) {
            if (!(arrayList.get(i) <= arrayList.get(i+1))) {
                ordenCreciente = false;
                break;
            }
            }
        }
        // si no esta en orden creciente para todos los elementos i tiene que ser >= i+1.
        boolean oredenDecreciente = true;
        if (!ordenCreciente)
        for (int i = 0; i < arrayList.size()-1; i--) {
            if (!(arrayList.get(i) >= arrayList.get(i-1))){
                oredenDecreciente = false;
                break;
            }
        }
        System.out.println();
    }
}

package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> enteros = new ArrayList<>();
        // lo rellenamos con Math.Random en vez de leer por teclado
        for (int i = 0; i <= 10; i++) {
            int numAleatorio = (int) (Math.random() * 10 + 1);
            enteros.add(numAleatorio);

        }
        System.out.println(enteros);

        System.out.println("numero a insertar");
        int n = sc.nextInt(); sc.nextLine();

        // controlamos que la posicion qu e nos dan est edentro del array
        int pos = 0;
        do{
            System.out.println("en que posicion lo quieres insertar?");
            pos = sc.nextInt();
        }while (pos > enteros.size());
        // desplazo todos los que estan detras de esta posicion
        //insertamos el numero en la posicion que nos indique.
        enteros.add(pos, n);
        //quitamos el ultimo elemento para que siga con 10 elementos
        enteros.remove(enteros.size()-1);
        System.out.println(enteros);
    }
}

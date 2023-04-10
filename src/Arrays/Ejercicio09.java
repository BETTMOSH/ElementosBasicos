package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        // Realizar un programa que declare un array y lo vaya llenando de números introducidos
        //por teclado hasta que introduzcamos un número negativo. Entonces debe imprimir los
        //elementos que contiene (el número negativo sólo sirve para finalizar el programa, no
        //entra en el array).
        Scanner sc = new Scanner(System.in);
        //int numero=0;
        // int[] array = new int[?]; como no sabemos la cantidad de numeros utilizaaremos arrays list
        /*ArrayList<Integer> arrayList = new ArrayList<>();
        do {
            System.out.println("Introduce numero negativo para terminar");
             numero = sc.nextInt();
            if (numero >= 0){
                arrayList.add(numero);  // si fuera un array[i] = numero
        }
        }while (numero >= 0);
        // cuando terminamos imprimimos
        System.out.println(arrayList);*/
        int numero = 0;
        ArrayList<Integer> celda = new ArrayList<>();
        do {
            System.out.println("ingrese un numero negativo para terminar :");
            numero = sc.nextInt();
            if (numero >= 0){
                celda.add(numero);
            }
        }while (numero >= 0);
        System.out.println(celda);
        ArrayList<Integer> desc = new ArrayList<>();
        for (int i = celda.size(); i < 1; i++) {
            desc.add(i);
        }
        System.out.println(desc);
    }
}

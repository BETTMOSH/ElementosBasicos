package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio19 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        // Vamos a crear un programa que cree un array de números enteros (tamaño introducido
        //por teclado), muestre el siguiente menú y realice lo que en las opciones se indica:
        //1. Añadir número al final: pide un número y lo añade al final del array.
        //2. Añadir número en una posición: pide un número y una posición, y si la posición
        //existe en el array lo añade en esa posición (la posición se pide a partir de 1).
        //3. Longitud del array: muestra el tamaño del array.
        //4. Eliminar el último número: muestra el último número del array y lo borra.
        //5. Eliminar un número: pide una posición, y si la posición existe en el array borra el
        //elemento que contiene (lo reemplaza con un 0).
        //6. Contar números: pide un número y te dice cuántas veces aparece en el array.
        //7. Posiciones de un número: pide un número y te dice en que posiciones está.
        //8. Mostrar números: Muestra los números que contiene.
        //9. Salir


        int opcion = 0;
        do {
            System.out.println("1. Añadir número al final\n"+
                    "2. Añadir número en una posición\n" +
                    "3. Longitud del array.\n"+
                    "4. Eliminar el último número.\n"+
                    "5. Eliminar un número.\n"+
                    "6. Contar números.\n"+
                    "7. Posiciones de un número.\n"+
                    "8. Mostrar números.\n"+
                    "9. Salir");
            opcion= sc.nextInt();
            switch (opcion){
                case 1 -> añadirNumeroAlFinal();
                case 2 -> añadirNumeroEnPosicion();
                case 3 -> longitudArray();
                case 4 -> EliminarNUmeroFinal();
                case 5 -> EliminarUnNumero();
                case 6 -> contarNumeros();
                case 7 -> posicionesDeUnNumero();
                case 8 -> mostrarNumeros();
            }

        }while (opcion != 9);
    }

    private static void posicionesDeUnNumero() {  // "7"
        System.out.println("Elija la posicion de un número: ");
        int posicion = sc.nextInt();
        arrayList.contains(arrayList.size()-1);
    }

    public static void contarNumeros() {  // "6"
        System.out.println("numeros a contar");
        int numero = sc.nextInt();
        int contador=0;
        for (int i = 0; i < numero; i++) {
            if (arrayList.get(i) == 1){
                contador++;
            }
        }
    }
    public static void EliminarUnNumero() {   // "5"
        System.out.println("posición a eliminar");
        int posicion = sc.nextInt();
        arrayList.remove(posicion-1);
    }
    public static void EliminarNUmeroFinal() {   // "4"
        arrayList.remove(arrayList.get(arrayList.size()-1));
    }
    public static void longitudArray() {  // "3"
        System.out.println(arrayList);
    }
    public static void añadirNumeroEnPosicion() {  // "2"
        // pido el numero
        System.out.println("numero a añadir");
        int numero = sc.nextInt();
        System.out.println("posicion a la que se quiere añadir");
        int posicion = sc.nextInt();
        arrayList.add((posicion - 1), numero);
    }

    public static void añadirNumeroAlFinal() {  // aqui se mete el codigo   "1"
        System.out.println("introduce un numero a añadir");
        int numero = sc.nextInt();
        arrayList.add(numero);
    }
    public static void mostrarNumeros(){  // "8"
        // mostrar los números
        System.out.println(arrayList);
    }
}

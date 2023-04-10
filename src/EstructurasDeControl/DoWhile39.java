package EstructurasDeControl;

import java.util.Scanner;

public class DoWhile39 {
    public static void main(String[] args) {
        //Escribe un programa que cuente la cantidad de números que vamos introduciendo
        //por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud de la
        //secuencia (sin contar el 0 final).
        Scanner sc = new Scanner(System.in);
        //vamos a ir introduciendo hasta que ingresemos un cero.
        // mejor do while por qu eal menos un numero tenemos que meter.
        int n = 0;  // esta variable es para guardar el numero introducido por teclado
        int contador = 0;
        do {
            n = sc.nextInt();
            contador++;
        }while (n!=0);
        // al finalizar, mostraremos la longitud de la secuencia o sea cuantos numeros hemos entrado.
        System.out.print((contador-1)); // restamos -1 para quitar el cero
    }
}

package Metodos;

import java.util.Scanner;

public class Ejercicio01 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //1. Escribe un método de nombre determinarSigno que reciba un número entero y
        //compruebe si el número es negativo, positivo o cero. El método debe devolver -1, 1 o
        //0, respectivamente.
        int num = recibirNumero(9);
        int signo = comprobarNumeros(recibirNumero(23));
    }
    public static int recibirNumero(int n){
        System.out.println("Ingrese un numero entero: ");
        return sc.nextInt();
    }
    public static int comprobarNumeros (int n){
        int numero = 0;
        int positivo=0, ceros=0;
        int negativo=0;
        if (numero < 0){
            negativo++;
        } else if (numero == 0) {
            ceros++;
        } else {
            positivo++;
        }
        return n;
    }
    static public void determinarSigno(){
        System.out.println("el numero es: ");
    }
}

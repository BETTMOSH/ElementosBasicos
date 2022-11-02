package VariablesYOperaciones;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        // Sirven para comprara dos numeros noralemnte y dan como resultado un boolean
        int num1 = 35;
        int num2 = 23;

        num2 = num1; // estoy asignando  num2 el valor de num1
        boolean comparacion = num2 == num1; // estoy comparandp ambas variables de num1 y el resultado(true)
        // si el resultado true lo asigno a comparacion.

        boolean otraComparacion = num2 != num1;  // "!" ¿distinto?

        int nueve = 9;
        int otroNueve = 9;
        int diez = 10;
        System.out.println(nueve > otroNueve);
        System.out.println(nueve >= otroNueve);
        int edad = 10;
        System.out.println("¿Mayor de eda? " + (edad>=18));
        System.out.println("¿Mayor de eda? " + (edad > 17));

        // cuando apracen operadores mezcladrod de distinto tipo(
        // parentesis,
        // incrementos y decrementos
        //operadores aritmeticos
        //operadores racionales
        //operadores slogicos

        int num = 1000;
        boolean resultado = num + 10 > num + 9;

        int a = 5;
        int b = 6;
        int c = 7;
        //quiero saber si a <= b <= c
        System.out.println(a <= b && b <= c);;
        System.out.println("============");
        // pedimos tres estaturas por teclado y queremos ver si estan en orden ascendente
        Scanner sc = new Scanner(System.in);
        double estatura1 = sc.nextDouble();
        double estatura2 = sc.nextDouble();
        double estatura3 = sc.nextDouble();
        boolean ordenAscendente = estatura1 <= estatura2 && estatura2 <= estatura3;
        System.out.println("Orden ascendente: " + ordenAscendente);

    }
}

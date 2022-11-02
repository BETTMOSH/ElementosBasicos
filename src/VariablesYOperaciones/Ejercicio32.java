package VariablesYOperaciones;

import java.util.Scanner;

public interface Ejercicio32 {
    public static void main(String[] args) {
        //Escribe un programa que lea un valor entero y verifique si es menor que 10 y mayor
        //que 0. El programa debe imprimir un booleano (true o false).
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor: ");
        int valor = sc.nextInt();
        boolean menorQue10;
        boolean mayorQue0;
        boolean valorEntero = valor < 10 && valor >0;
        System.out.println("El valor es: " + valorEntero);;
        //int valor = sc.nextInt();
        //boolean menorQue10YMenorQue0 = valor <10 && valor > 0;
        //System.out.println(menorQue10YMenorQue0);




    }
}


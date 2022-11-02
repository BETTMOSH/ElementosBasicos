package PracticandoEnCasa;

import java.util.Scanner;

public class CalculaLaNota {
    public static void main(String[] args) {
        //Realiza un programa que calcule la nota final de un estudiante, considerando por cada respuesta 5 puntos,
        //las incorrectas restan un punto, y las no contestadas ni suman ni restan.
        Scanner sc = new Scanner(System.in);

        int notaFinal;
        int correctas;
        int incorrectas;
        int noContestadas;
        int notaMaxima;
        double notaSobre10;

        System.out.println("Ingrese el total respuestas correctas");
        correctas = sc.nextInt();
        System.out.println("Ingrese el total de respuestas incorrectas");
        incorrectas = sc.nextInt();
        System.out.println("Ingrese el total de respuestas no contestadas");
        noContestadas = sc.nextInt();

        notaMaxima = correctas + incorrectas + noContestadas *5;
        notaFinal = (correctas *5) + (incorrectas*(-1));

        notaSobre10 = (double) + (notaFinal*10) / notaMaxima;

        System.out.printf("La nota final es de: " + notaFinal + ", que corresponde a un %5.2f sobre 10", notaSobre10);


    }
}

package PracticandoEnCasa;

import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {
       // En el segundo ejercicio vamos a realizar un programa que te realice el promedio de las notas de un alumno,
        // para ello el programa te va a tener que solicitar el nombre del alumno y las notas de las 3 evaluaciones.
        // Requisitos: Las notas pueden tener decimales.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno");
        String nombreAlumno = sc.nextLine();
        System.out.println("ingrese la primera nota");
        double n1 = sc.nextDouble();
        System.out.println("ingrese la segunda nota");
        double n2 = sc.nextDouble();
        System.out.println("ingrese tercera nota");
        double n3 = sc.nextDouble();
        double evaluaciones = (n1 + n2 + n3) / 3;

        System.out.printf("el promedio final de: " + nombreAlumno + " es %.2f\n ", evaluaciones );
    }
}

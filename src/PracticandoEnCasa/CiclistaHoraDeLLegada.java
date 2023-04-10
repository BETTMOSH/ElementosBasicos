package PracticandoEnCasa;

import java.util.Scanner;

public class CiclistaHoraDeLLegada {
    public static void main(String[] args) {
        //Un ciclista parte de una ciudad "A" a las HH horas, MM minutos y SS segundos.
        //El tiempo de viaje hasta llegar a otra ciudad "B" es de T segundos.
        // Escribir un algoritmo que determine la hora de llegada a la ciudad B.
        Scanner sc = new Scanner(System.in);
        int hora, minutos, segundos,tSegundos, tiempo, totalSegundos, segundosRestantes;
        System.out.println("ingrese la hora: ");
        hora = sc.nextInt();
        System.out.println("ingrese los minutos: ");
        minutos = sc.nextInt();
        System.out.println("ingrese los segundos: ");
        segundos = sc.nextInt();
        System.out.println("ingrese la duracion del viaje: ");
        tiempo = sc.nextInt();
        totalSegundos = hora * 3600 + minutos * 60 + segundos + tiempo;
        hora = totalSegundos / 3600;
        segundosRestantes = totalSegundos % 3600;
        minutos = segundosRestantes / 60;
        segundos = segundosRestantes % 60;
        System.out.println("La hora de llegada es de: " + hora +":"+ minutos +":"+ segundos);
    }
}

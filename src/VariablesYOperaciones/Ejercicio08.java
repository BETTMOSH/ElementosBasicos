package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        //Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
        //tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
        //son 3 horas, 30 minutos y 10 segundos.
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt();    // por ejemplo 3751
        // calcular de este tiempo las horas, minutos. y segundos
        //De los segundos qu entran, primero divido por 60 para saber cuantos minutos y segundos hay
        int minutos =segundos/60; // 62 minutos con ese ejemplo
        int segundosRestantes = segundos % 60;
        int horas =  minutos/ 60;
        //en estos  minutos pude haber una hora mas, como en este caso
        int minutosRestantes = minutos % 60;
        System.out.println("en " +segundos + " hay " + horas + " horas " + minutosRestantes+ " minutos " + segundosRestantes+ " segundos ");




    }
}

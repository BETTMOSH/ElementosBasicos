package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
            //Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha
        //calificación se compone de los siguientes porcentajes:
        //a. 55% del promedio de sus tres calificaciones parciales.
        //b. 30% de la calificación del examen final.
        //c. 15% de la calificación de un trabajo final.
        Scanner sc = new Scanner(System.in);
        System.out.print("Parcial: 1");
        double parcial1 = sc.nextDouble();
        System.out.print("Parcial 2: ");
        double parcial2 = sc.nextDouble();
        System.out.print("Parcial 3: ");
        double parcial3 = sc.nextDouble();
        System.out.print("Examen final: ");
        double exmaneFinal = sc.nextDouble();
        System.out.print("Trabajo final: ");
        double trabajoFinal = sc.nextDouble();

        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        //System.out.println(promedioParciales);

        double  porcentajeParciales = promedioParciales*55/100;
        System.out.println(porcentajeParciales);
        double porcentajeExamenFinal = exmaneFinal*30/100;
        System.out.println(porcentajeExamenFinal);
        double porcentajeTrabajoFinal = trabajoFinal*15/100;
        System.out.println(porcentajeTrabajoFinal);

        double calificacionFinal = porcentajeParciales+porcentajeExamenFinal+porcentajeTrabajoFinal;
        System.out.printf("la calificacion final sera %.2f " , calificacionFinal);

    }
}

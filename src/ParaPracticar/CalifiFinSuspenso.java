package ParaPracticar;

import java.util.Scanner;

public class CalifiFinSuspenso {
    public static void main(String[] args) {
        // pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso
        Scanner sc = new Scanner(System.in);
        double calificaciones;
        boolean contadorSuspenso = false;
        for (int i = 1; i <= 5; i++) {
            do {
                System.out.print("Digite las clalificaciones: ");
                calificaciones = sc.nextDouble();
            } while (calificaciones < 0 || calificaciones > 10);
            if (calificaciones < 5) {
                contadorSuspenso = true;
            }
        }
        if(contadorSuspenso == true) {
            System.out.println("si existen al menos un suspenso" + contadorSuspenso);
        }else{
        System.out.println("no hay suspensos");
        }

    }
}


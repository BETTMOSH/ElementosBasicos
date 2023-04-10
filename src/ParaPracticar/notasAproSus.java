package ParaPracticar;

import java.util.Scanner;

public class notasAproSus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // dadas 6 notas, escribir la cantidad de alumnos
        // aprobados, condicionados (=4) y suspensos.
        double notas;
        int contadorAprobados=0,contadorCondicionados=0, suspensos=0;
        for (int i = 1; i <=6 ; i++) {
            do {
                System.out.print("Ingrese la nota "+i+ ":");
                notas= sc.nextDouble();
            }while (notas<0 || notas>10);
            if (notas==4){
                contadorCondicionados++;
            } else if (notas>=5) {
                contadorAprobados++;
            }else {
                suspensos++;
            }
        }
        System.out.println("la cantidad de alumnos aprobados es: " + contadorAprobados);
        System.out.println("la cantidad de alumnos condicionados es: " + contadorCondicionados);
        System.out.println("la cantidad de alumnos suspensos es: " + suspensos);
    }
}

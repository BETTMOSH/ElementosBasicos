package ParaPracticar;

import java.util.Scanner;

public class SemanasDiasHoras {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // ejemplo... 1000 horas = 5 semanas, 6 dias y 16 horas
        int horasTotales=0;
        int semanas=0;
        int dias=0;
        int horas;

        System.out.println("Digite las horas totales: ");
        horasTotales= sc.nextInt();

        semanas = horasTotales / 168;
        dias = horasTotales % 168 / 24;
        horas = horasTotales % 24;

        System.out.println("\n El equivalente de las horas entradas son: " + semanas + " semanas " + dias + " dias " + horas + " horas");
    }
}

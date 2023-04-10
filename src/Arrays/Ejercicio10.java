package Arrays;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
        //diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para
        //simplificarlo vamos a suponer que febrero tiene 28 días.
        Scanner sc = new Scanner(System.in);
        int mes = 0;
        do {
            System.out.println("Di un numero de mes (1-12)");
            mes= sc.nextInt();
        }while (mes < 0 || mes > 12);
        // array de meses
        String[] nombreMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        //array de meses con los dias

        // los dos arrays van correlativos el mismo indica nombre y dias que tiene el mes
        // si meto un 4 -> abril tiene 30 dias

        System.out.println(nombreMes[mes-1] + " tiene " + diasMes[mes-1] + " dias.");

    }
}

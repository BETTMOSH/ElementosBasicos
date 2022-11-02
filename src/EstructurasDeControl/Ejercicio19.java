package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        //19. Realizar un programa que pida un número entero por teclado y visualice el dia de la
        //semana correspondiente.
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        int numero = sc.nextInt();
        String dia = "";
        switch (numero){
            case 1 -> dia = "lunes";
            case 2 -> dia = "martes";
            case 3 -> dia = "miercoles";
            default -> System.out.println(dia);
        }

    }
}

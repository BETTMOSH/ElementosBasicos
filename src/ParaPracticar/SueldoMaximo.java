package ParaPracticar;

import java.util.Scanner;

public class SueldoMaximo {
    public static void main(String[] args) {
        // Pedir un numero <N> introducir N sueldos y mostrar el sueldo maximo
        Scanner sc = new Scanner(System.in);
        int numeroN;
        double sueldosN;
        double sueldoMaximo=0;
        System.out.println("digite la cantidad de sueldos: ");
        numeroN= sc.nextInt();
        for (int i = 1; i <=numeroN ; i++) {
            System.out.println("digite el sueldo: ");
            sueldosN= sc.nextDouble();
            if (sueldosN>sueldoMaximo){
                sueldoMaximo=sueldosN;
            }
        }
        System.out.println("el sueldo maximo es: " + sueldoMaximo);
    }
}

package ParaPracticar;

import java.util.Scanner;

public class SueldosSumaMayor {
    public static void main(String[] args) {
        //Pedir 10 sueldos y mostrar su suma y cuantos billetes mayores de 1000 € hay
        Scanner sc = new Scanner(System.in);
        double contadorBilletes=0;
        double suma=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.print("Introduzca los sueldos: ");
            double sueldos= sc.nextDouble();
            if (sueldos > 1000) {
                contadorBilletes++;
            }
                suma += sueldos;
            }
        System.out.println("la suma de los sueldos es de: " + suma);
        System.out.println("la cantidad de billetes mayores de 1000 son: " + contadorBilletes);
    }
}

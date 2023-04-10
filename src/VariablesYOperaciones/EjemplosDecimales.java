package VariablesYOperaciones;

import java.util.Scanner;

public class EjemplosDecimales {
    public static void main(String[] args) {
        double ceroComaCero = 0.0;
        double unoComaCero = 1.0;
        double decimalNegativo = 1.4567;

        //tipo float

        float decimalFloat = 1.3f;
        float decimalLargo = -3.12353546465778657786957548789f;
        System.out.println(decimalLargo); // perdemos precision
        //NOTACION CIENTIFICA
        double eps = 5e-3;// es lo mismo que 5*10^(-3) = 0.005
        System.out.println(eps);
        double n = 0.01e2; // es lomismo que 0.01*10^2= 1.0
        System.out.println(n);

        System.out.println("suma " + (eps + n));
        System.out.println("resta " + (eps-n));
        System.out.println("producto " + (eps*n));
        System.out.println("division " + (eps/n));
    // no tiene sentido hacer el % resto

    // que pasa si divido numeros enteros y los guardo en una variBLE con decimales
    double d1 = 5 / 4;  // divide dos numeros enteros y lo asigna a la variable decimal
        System.out.println("Division 1: " + d1);
    double d2 = 5.0 / 4.0; // divide dos niumeros decimales
        System.out.println("Division 2: " + d2);
        // falta de presicion a veces con las variables primitivas decimales
        System.out.println(3.3 / 3);
        double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        Scanner sc = new Scanner(System.in);
        float decimalPorTeclado = sc.nextFloat();
        System.out.println(decimalPorTeclado);
        double doublePorTeclado = sc.nextDouble();
        System.out.println(doublePorTeclado);


    }

    public static class Ejercicio11 {
        public static void main(String[] args) {
            //Dado un número de dos cifras, escribe un programa que permita obtener el número
            // invertido. Ejemplo, si se introduce 23 que muestre 32.
            Scanner sc = new Scanner(System.in);
            int numeros;
            int digito1;
            int digito2;
            int inverso;
            System.out.println("Introduce los numeros para invertirlos");
            numeros = sc.nextInt();
            // 23 dividimos entre 10
            digito1 = numeros / 10;
            digito2 = numeros % 10;
            inverso = digito2 * 10 + digito1;
            System.out.println("El numero invertido es: " + inverso);

        }
    }
}

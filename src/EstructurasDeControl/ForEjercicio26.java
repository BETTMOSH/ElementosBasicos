package EstructurasDeControl;

import java.util.Scanner;

public class ForEjercicio26 {
    public static void main(String[] args) {
            //Hacer un programa que pida diez números por teclado y calcule su media.
        Scanner sc = new Scanner(System.in);
        double suma= 0;
        for (int i = 0; i < 10; i++) {

            System.out.print("numero: ");
        double numero = sc.nextDouble();
        suma = suma + numero;
            //System.out.println(suma);
        }
        double media=suma/10;
        System.out.print(media);
    }
}

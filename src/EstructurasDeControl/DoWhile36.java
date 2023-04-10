package EstructurasDeControl;

import java.util.Scanner;

public class DoWhile36 {
    public static void main(String[] args) {
        // Realiza un programa que lea cuatro valores numéricos e imprime su suma y su media.
        // Ten en cuenta que la media puede contener decimales
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca los valores: ");
        int n;
        double suma=0;
        for (int i = 0; i < 4; i++) {
            n = sc.nextInt();
            suma = suma+n;
        }
        double media = suma/4;
        System.out.println("suma " + suma);
        System.out.println("media " + media);

    }
}

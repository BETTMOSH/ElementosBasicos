package ParaPracticar;

import javax.swing.*;
import java.util.Scanner;

public class ForAnidadoOrdenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ordenar[];
        int nElementos;
        int aux;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del arreglo"));
        ordenar = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i+1) + " Digite un numero: ");
            ordenar[i] = sc.nextInt();
        }
        //Método burbuja.
        for (int i = 0; i <(nElementos-1); i++) {
            for (int j = 0; j <(nElementos-1) ; j++) {
                if (ordenar[j] > ordenar[j+1]){
                    aux = ordenar[j];
                    ordenar[j] = ordenar[j+1];
                    ordenar[j+1] = aux;
                }
            }
        }
        System.out.print("este arreglo esta ordenado en orden creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(ordenar[i] + " - ");
        }
        System.out.println("\nArreglo ordenado de forma decreciente: ");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(ordenar[i] + " - ");
        }
        System.out.println("");
    }
}

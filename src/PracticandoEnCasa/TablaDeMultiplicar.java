package PracticandoEnCasa;

import javax.swing.*;
import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Este ejercicio es un poco más complejo, lo que queremos es solicitar un número al usuario y que el
        // programa muestre la tabla de multiplicar de ese número, desde el 0 hasta el 10.
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un digito a multiplicar: "));
        int resultado;
        for (int i = 0; i <=10; i++) {
            resultado=numero*i;
           JOptionPane.showMessageDialog(null,"tabla del: " + numero + " X " + i + " = " + resultado);
        }

    }
}

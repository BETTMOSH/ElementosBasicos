package PracticandoEnCasa;

import javax.swing.*;
import java.util.Scanner;

public class ContarVocalYConsonante {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Contar cuantas vocales y consonantes tiene el String Java. ¡Ojo con los espacios!
        //Por ejemplo Java Java Java = 6 vocales y 6 consonantes.

        String cadena;
        cadena = JOptionPane.showInputDialog("Ingrese una cadena de texto: ");
        cadena = cadena.trim();
        int contadorVocal = 0;
        int contadorConso = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i'
                    || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
                contadorVocal++;
            }else if (cadena.charAt(i) !=' ') { // si no es un espacio, sólo tienes que controlar eso porque si entra aquí es que no es una vocal
                contadorConso++;
            }
        }
        JOptionPane.showMessageDialog(null,"El la cadena de texto hay: " + contadorVocal + " vocales y " + contadorConso + " consonantes");
    }
}

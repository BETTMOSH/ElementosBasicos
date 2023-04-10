package ParaPracticar;

import javax.swing.*;
import java.util.Scanner;

public class CondicionalTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        //System.out.println("digite un numero para saber si es par o es impar: ");
        numero= Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        JOptionPane.showMessageDialog(null,(numero % 2 == 0) ? "es par": "es impar");
    }
}

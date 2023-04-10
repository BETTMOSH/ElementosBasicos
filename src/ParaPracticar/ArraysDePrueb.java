package ParaPracticar;

import javax.swing.*;
import java.util.Scanner;

public class ArraysDePrueb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz [][],nFilas,nCol;
        boolean simétrica = true;
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de columnas: "));
        matriz = new int[nFilas][nCol];

        System.out.print("Digite una matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz["+i+"]["+j+"]:");
                matriz[i][j]= sc.nextInt();
            }
        }
        if (nFilas == nCol){
            int i,j;
            i=0;
            while (i<nFilas && simétrica == true){
                j=0;
                while (j<i && simétrica == true){
                    if (matriz[i][j] != matriz[j][i]){
                        simétrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simétrica == true){
                JOptionPane.showMessageDialog(null,"la matriz es simétrica");
            }
            else {
                JOptionPane.showMessageDialog(null,"la matriz no es simétrica. ");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"la matriz no es simétrica. ");
        }
    }
}


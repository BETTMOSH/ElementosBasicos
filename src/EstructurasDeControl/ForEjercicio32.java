package EstructurasDeControl;

import java.util.Scanner;

public class ForEjercicio32 {
    public static void main(String[] args) {
        //Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n
        //un número introducido por el usuario.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // ejem 100
        // tenemos que ir mirando todos los numeros entre 1 y n y entonces
        // si
        for (int i = 1; i <=n; i++) {
            if (i % 5 == 0){
                System.out.print(i +" ");
        }



        }
    }
}

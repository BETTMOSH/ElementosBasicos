package EstructurasDeControl;

import java.util.Scanner;

public class ForEjercicio28 {
    public static void main(String[] args) {
        //Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un
        //rectángulo en que la base sea el número mayor y la altura el número menor, con un
        //carácter también introducido por teclado.
        Scanner sc = new Scanner(System.in);
        System.out.print("intrudice el primer numero: ");
        int a = sc.nextInt();
        System.out.print("intrudice el segundo numero: ");
        int b = sc.nextInt();

        if (a<=0|| b <=0) {
            System.out.println("no valen ");
        }else{         // si hasta aqui a y b son validos, ya entraremso ne el bloque
            int base,altura;
            if (a > b){
                base=a;
                altura=b;
            }else{
                base=b;
                altura=a;
            }
            char c = sc.next().charAt(0);
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < base; j++) {
                    System.out.println(c + " ");
                }
                System.out.println();
        }


        }
    }
}

package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Escribe un programa que pida tres números y los muestre ordenados (de mayor a
        //menor);
        Scanner sc = new Scanner(System.in);
        System.out.println("primer numero");
        int num1 = sc.nextInt();
        System.out.println("segundo numero");
        int num2 = sc.nextInt();
        System.out.println("tercer numero");
        int num3 = sc.nextInt();

        System.out.println("Los numeros de mayor a menor son:");

        if (num1 > num2 && num2 > num3){
           System.out.println(num1 + ", " + num2 + ", " +num3);
        } else if (num1 >num3 && num3 > num2) {
           System.out.println(num1 + ", " + num3 + ", " +num2);
       } else if (num2 > num1 && num1 > num3) {
           System.out.println(num2 + ", " + num1 + ", " +num3);
       } else if (num2 > num3 && num3 > num1) {
           System.out.println(num2 + ", " + num3 + ", " +num1);
       } else if (num3 > num1 && num1 > num2) {
           System.out.println(num3 + ", " + num1 + ", " +num2);
       } else if (num3 > num2 && num2 > num1) {
           System.out.println(num3 + ", " + num2 + ", " +num1);
       }




    }
}

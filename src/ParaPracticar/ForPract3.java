package ParaPracticar;

import java.util.Scanner;

public class ForPract3 {
    public static void main(String[] args) {
        //        Realiza un programa que comience solicitando al usuario dos números cualesquiera.
        //        A continuación, tendrá que mostrar, de forma similar al ejercicio anterior, la secuencia
        //        de números entre los que ha introducido el usuario, pero sólo mostrará los pares.
        //        Por ejemplo, si el usuario introduce el 10 y el 20, el programa hará aparecer la siguiente
        //        secuencia por pantalla: 10, 12, 14, 16, 18, 20
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el primer numero: ");
        int n1= sc.nextInt();
        System.out.print("el segundo: ");
        int n2= sc.nextInt();
        int numero;
        for (int i = n1; i <=n2 ; i+=2) {
            if (n1 % 2 == 0 && n2 % 2 == 0){
            }else {
                System.out.println("no son numeros pares");
        }
            System.out.println(i);
        }


    }
}

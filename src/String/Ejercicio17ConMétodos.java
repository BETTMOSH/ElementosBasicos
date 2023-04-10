package String;

import java.util.Scanner;

public class Ejercicio17ConMétodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Realiza una aplicación que solicite por pantalla una serie de números (salimos pulsando 0) y
        //los guarde en una cadena de texto separado por un espacio. Por ejemplo, si el usuario
        //introduce el 2, el 13 y el 235, el programa los almacena como “2 13 235” y lo pinta en la
        //pantalla.
        /*
        String n1 = "15";
        String n2 = "18";
        System.out.println(n1 + n2);

        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        System.out.println(a + b);

        String cadena = String.valueOf(100);
        System.out.println(cadena + cadena);*/

        int n = 0;
        String cadena= "";
        do {
            System.out.println("numeros: ");
            n = sc.nextInt(); sc.nextLine();
            //comprobamos si es 0 si lo es lo meto en la cadena
            if (n != 0){
                // para guardarlso en una cadena de texto lo tengo que convertir a String
                String num = String.valueOf(n);
                // y añadirlo a una cadena
                cadena = cadena + num +" ";
            }

        }while (n != 0);
        System.out.println(cadena);
    }
}

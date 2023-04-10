package EstructurasDeControl;

import java.util.Scanner;

public class doWhileEjercicio38 {
    public static void main(String[] args) {
        //Escribe un programa que solicite al usuario un número entre 1 y 100, ambos
        //inclusive. Si se introduce un número fuera del intervalo debe indicarlo mediante un
        //error y seguir pidiendo el número hasta que se introduzca el número en el rango
        //indicado. Al terminar debe imprimir por pantalla el número introducido.
        Scanner sc = new Scanner(System.in);
        int numero=0;
        int flag=0;
        do {
            System.out.println("introducir un numero: ");
             numero= sc.nextInt();
             if (numero>=1 && numero<=100){
               flag=1;
             } else {
                 System.out.println("numero erroneo ");
             }
        }while (flag==0);


    }
}

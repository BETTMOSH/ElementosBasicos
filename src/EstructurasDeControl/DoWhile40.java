package EstructurasDeControl;

import java.util.Scanner;

public class DoWhile40 {
    public static void main(String[] args) {
        //Escribe un programa que pida números hasta que se introduzca un cero. Debe
        //imprimir la suma y la media de todos los números introducidos.
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int contador = 0;
         // es la suma de los numeros dividido entre la
        int suma=0;
        do {
            System.out.println("introduce un cero para terminar");
            n = sc.nextInt();
            suma+=n;
            ;
            if (n!=0){
                contador++;
            }
        }while (n!=0);
        double media;
        media=suma/contador;
        System.out.println("suma" + suma);
        System.out.println(media);
    }
}

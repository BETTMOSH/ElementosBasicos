package EstructurasDeControl;

import java.util.Scanner;

public class DoWhile41 {
    public static void main(String[] args) {
        //Dada una secuencia de números enteros (que finaliza con el número 0), encuentra el
        //elemento más grande de la secuencia. El número 0 no está incuido en la secuencia,
        //sólo se utiliza para finalizar el programa.
        Scanner sc = new Scanner(System.in);
        int numUsuario;
        System.out.println("Introduce numeros enteros: ");
        numUsuario= sc.nextInt();
        int numMayor=numUsuario;

        do {
            System.out.println("introduce numero entero(cero para salir");
            if (numUsuario!=0){
            if (numUsuario>numMayor) {
                numMayor = numUsuario;
            }
            }
        }while (numMayor!=0);
        System.out.println("El numero mayor es: " + numMayor);
    }
}

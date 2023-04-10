package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {

                //Haz el ejercicio anterior, pero de forma que el usuario responda con un “sí” o con un
        //“no” (en vez de true/false).
        Scanner sc = new Scanner(System.in);
        System.out.print("Eres culpable? (S/N) ");
        String culpable = sc.nextLine();
        if (culpable.equals("S")){  // la comparación entre String se hace por el método equals.Es decir si la variable es culpable es igual a S
            System.out.println("A la cárcel! ");
        }else if (culpable.equals("N")){
            System.out.println("A casa! ");
        }else {
            System.out.println("No me tomes el pelo. ");
        }
    }
}

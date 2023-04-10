package EstructurasDeControl;

import java.util.Scanner;

public class IfEjercicio16 {
    public static void main(String[] args) {
        //Harry Potter necesita ayuda para identificar lo que significa cada casa. Lee una
        //cadena que represente una casa (puedes asociarla a un número para hacer más fácil
        //la entrada por teclado) y que obtenga lo siguiente:
        //• si es "gryffindor" , salida "valentía" ;
        //• si es "hufflepuff" , salida "lealtad" ;
        //• si es "slytherin" , salida "astucia" ;
        //• si es "ravenclaw" , salida "intelecto" ;
        //• de lo contrario, la salida "no es una casa válida" .
        Scanner sc = new Scanner(System.in);
        System.out.println("elige casa: \n1. gryffindor\n2. hufflepuff\n3. slythering\n4. ravenclaw");
        int casa= sc.nextInt();
        for (int i = 0; i < 100; i++) {
        //int casa = (int) (Math.random()*4+1);
        }
        switch (casa){
            case 1:
                System.out.println("valentia");
                break;
            case 2:
                System.out.println("lealtad");
                break;
            case 3:
                System.out.println("astusia");
                break;
            case 4:
                System.out.println("intelecto");
                break;
            default:
                System.out.println("no es una opcion correcta. ");
        }

    }

}

package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        //A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de
        //mantequilla de cacahuete. Pero no debe haber muchas, porque si no enferman. Una
        //fiesta de la marmota exitosa tendrá entre 10 y 20 tazas de mantequilla de cacahuete,
        //ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25
        //tazas.
        //Escribe un programa que lea dos valores:
        //• El primero es el número de tazas de mantequilla de cacahuete que hay en la
        //fiesta.
        //• El segundo es un booleano que indica si es fin de semana.
        //El programa debe imprimir si la fiesta tiene éxito o no (true o false).
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de tazas");
        int tazas = sc.nextInt();

        boolean finde = sc.hasNextBoolean();
        boolean exito;
        if (tazas >= 10 && tazas <= 20 && finde == false){
            exito= true;
        } else if (finde == true && tazas >= 15 && tazas <= 25 ) {
            exito=true;
        }else {
            exito = false;
        }
        System.out.println("la fiesta es: "+ exito);


    }
}

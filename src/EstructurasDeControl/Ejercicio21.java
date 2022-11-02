package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        //Escribe un programa que responda a un usuario que quiere comprar un helado en
        //una conocida marca de comida rápida cuanto le costará en función del topping que
        //elija.
        //• El helado sin topping cuesta 1.90€.
        //• El topping de oreo cuesta 1€.
        //• El topping de KitKat cuesta 1.50€.
        //• El topping de brownie cuesta 0.75€.
        //• El topping de lacasitos cuesta 0.95€.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tooping: sin tooping, oreo, kitkat, brownie, lacasitos: ");
        String tooping = sc.nextLine();
        double precio = 1.90; // el precio de helado
        switch (tooping) {
            case "sin tooping":
                // nohacemos nada pro que el precio es por defecto.
                break;
            case "oreo":
                precio = precio+1;
                break;
            case "kitkat":
                precio = precio+1.50;
                break;
            case "brownie":
                precio = precio+0.75;
                break;
            case "lacasitos":
                precio = precio+0.95;
                break;
            default:
                System.out.println("No tenemos este tooping, lo sentimos");
                System.out.println("El precio del helado sin tooping es: " + precio);
        }
        System.out.printf("El precio de tu helado es: %.2f €", precio );
        //• En caso de no disponer del topping solicitado por el usuario el programa escribirá
        //por pantalla «no tenemos este topping, lo sentimos.» y a continuación informará
        //del precio del helado sin ningún topping.




    }
}

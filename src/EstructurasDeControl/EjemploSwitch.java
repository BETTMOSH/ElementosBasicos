package EstructurasDeControl;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una accion (1-4)");
        int accion= sc.nextInt();
        sc.nextLine();
//        if (accion == 1){
//            System.out.println("comentando partida");
//        } else if (accion ==2) {
//            System.out.println(" Cargando partida guardada");
//
//        } else if (accion==3) {
//            System.out.println("Mostrar ayuda");
//
//        } else if (accion==4) {
//            System.out.println("salir");
//        }else {
//            System.out.println("accion incorrecta");
//        }
        // estto se puede poner de otra forma
        // Cuando en el if tienes == 0 equals -> evalúas el vaor de una variable y segun sea haces una accion u otra
       /* switch (accion) {   // en el parectisis solo puede ir el nombre de la variable
            case 1:
                System.out.println("comenzando partida");
                break;
            case 2:
                System.out.println("cargando partida guardada");
                break;
            case 3:
                System.out.println("Mostrar ayuda");
                break;
            case 4:
                System.out.println("salir");
                break;
            default:    // aqui entra si no se cumple ningun caso de los anterires.
                System.out.println("accion incorrecta");
                break;*/
    // segun el dia que sea quiero me diga un número.
        System.out.println("dia de la semana:");
        String dia = sc.nextLine();
        int numero = 0;
        switch (dia){
            case "lunes":
            numero=1;
            break;
            case "martes":
            numero = 2;
            break;
            case "miercoles":
                numero =3;
                break;
            case "jueves":
                numero = 4;
                break;
            case "viernes":
                numero = 5;
                break;
            default:
                    System.out.println("Lo que has introducido no es un dia de la semana.");
        }
        System.out.println(numero);
    }
}

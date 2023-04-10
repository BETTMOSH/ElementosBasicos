package Examen22;

import java.util.Scanner;

public class Ejercicio02Tickets {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int edad = pedirEdad();
        /*String tipo = devolverTipo(edad);
        int precio = calcularPrecio(tipo);
        imprimirTicket(tipo,precio);*/
        imprimirTicket(devolverTipo(edad), calcularPrecio(devolverTipo(edad)));
    }
    static int pedirEdad(){
        System.out.println("edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        return edad;
    }

    // recibe la edad en años y devuelve "adulto" o "niño"
    static String devolverTipo(int edad){
        if (edad >= 18){
            return "Adulto";
        }else {
            return "Niño";
        }

    }
    // recibe el tipo de entrada y devuelve el precio en euros
    static int calcularPrecio(String tipo){
        if (tipo.equals("Adulto")){
            return 4;
        }else {
            return 2;
        }
    }

    static void imprimirTicket(String tipo, int precio){
        System.out.println("==========================");
        System.out.println("|      TICKET DE ENTRADA      |");
        System.out.println("|  " + tipo + "  " + precio + " €  |");

    }
}

package Metodos;

import java.util.Scanner;

public class EjemploMetodos {
    // cuando utilizamos métodos estáticos para utilizarlos en toda la clase necesitamos declarar un Scanner.
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // a los métodos lo llamaremos desde aquí
        String nombre = pideNombre();

        // quiero utilizar el método imprimeNombre para imprimir la variable Nombre,
        // llamo al método imprimeNombre
        imprimeNombre(nombre);
        imprimeLongitud(nombre);

        int longitud= nombre.length();
        System.out.println();
    }
    // aquí dentro de la clase pero fuera dek main
    // escribiremos los otros métodos

    //public static nombre que devuelve nombre del mátodo y (parámetros o no)y llaves { }
    // instrucciones que se ejecutan al llamar o invocar al método

    // declaracion del metodo
        public static void imprimeNombre(String n){ // del paramtro tengo qu eponer e tipo y e lnombre  qu eyo quiera
            System.out.println("Nombre: " + n);
    }
    // declara un metodo que imprima un String e imprima su longitud
    public static void imprimeLongitud(String l){
        System.out.println("longitud de " + l + ": " + l.length());
    }
    // declara un metodo que no reciba nada, pregunta un nombre y o devuelve
    public static String pideNombre(){
        System.out.println("Escribe un nombre");
        String nombre=sc.nextLine();
        // cuando devuelve algun método hay que poner "return"
    return nombre;

}
}

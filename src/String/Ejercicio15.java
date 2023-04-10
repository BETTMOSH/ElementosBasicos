package String;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
           //Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la
           //cadena.
        Scanner sc = new Scanner(System.in);
        String cadena;
        char caracter=0;
        int contadorCaracter=0;
            System.out.print("Ingrese una cadena:");
            cadena=sc.nextLine();
        System.out.println("ingrese un caracter");
        caracter=sc.nextLine().charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)== caracter){
                contadorCaracter++;
            }
        }
        System.out.println("el caracter " + caracter + " aparece " + contadorCaracter + " veces en " + cadena);
    }
    // usar metodos y sacar parte del codigo al metodo contarCaracter que recibe un string uy un char y decuelve un int
    // y un metodo para imprimir el resultado
}

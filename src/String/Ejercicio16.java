package String;

import java.util.Scanner;

public class Ejercicio16 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Escribe un programa que pida una lista de palabras (la guardas como una cadena de texto) y,
        //a continuación dé tres opciones:
        //• Contar: pide una palabra, y me dice cuantas veces aparece en la lista
        //• Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones
        //de la primera por la segunda.
        //• Eliminar: pide una , y la elimina de la lista.
        //• Mostrar: muestra la lista de cadenas
        //• Salir
        String palabra = "";
        String cadena = "";
        do {
            System.out.println("ingrese una cadena y (0 para salir) ");
            palabra = sc.nextLine();
            if (palabra.equals("0")){
                cadena=cadena+palabra +"";
            }
        }while (!palabra.equals("0"));

       int opcion;
        do {
            System.out.println("seleccione una opcion del menu: \n1. contar \n2. Modificar \n3. eliminar \n4. mostrar \n5. salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    contar(cadena);
                    break;
                case 2:
                    modificar(cadena);
                    break;
                case 3:
                    eliminar(cadena);
                    break;
                case 4:
                    mostrar(cadena);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción incorrecta");
                }
        }while (opcion !=5);

    }

    private static void mostrar(String cadena) {
        System.out.println(cadena);
    }

    private static void eliminar(String cadena) {
        System.out.println("esta es la cadena: " + cadena);
        System.out.println("palabra a eliminar");
        String palabra = sc.nextLine();
        if (cadena.contains(palabra)) {
            cadena = cadena.replaceAll(palabra, "");
        }
    }
    private static String modificar(String cadena) {
        System.out.println("escribe una de estas palabras");
        String palabra = sc.nextLine();
        System.out.println("con que palabra quieres reemplazarla?: ");
        String otraPalabra=sc.nextLine();
        cadena=cadena.replaceAll(palabra,otraPalabra);
        mostrar(cadena);
        return cadena;
    }

    private static void contar(String cadena) {
        mostrar(cadena);
        System.out.println("que palabra quieres contar?: ");
        String palabra = sc.nextLine();
        String[] a = cadena.split("");
        //System.out.println(Arrays.toString(a));
        int contador=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(palabra)){
                contador++;
            }
        }
        System.out.println("la palabra " + palabra + "aparece " + contador + "veces ");
    }
}

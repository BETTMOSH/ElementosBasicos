package String;

import java.util.Locale;
import java.util.Scanner;

public class EjemplosString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = "hola"; // String es el unico tipo que se puede saltar lo de "new String",
                                // al crear una variable de este tipo.
        String cadena2 = new String("hola");
        String ejemplo = "esternocleidomastoideo";
        // mediante este método podremos acceder a sus caracteres indicando el índice(la palabra)
        System.out.println(ejemplo.charAt(0));   // es la letra que esta enn la posision 0

        System.out.println(ejemplo.charAt(10));   // es la letra qye está en la décima posición

        // quiero saber la longitud del string
        System.out.println("**********      METODOS CON STRING      **********");
        System.out.println("**************************************************");
        System.out.println(ejemplo.length());
        System.out.println("longitud: " + ejemplo.length());
        System.out.println("esta vacia " + ejemplo.isEmpty());
        String vacia= "";
        System.out.println("¿esta vacia?" + vacia.isEmpty());
        System.out.println("Todo en mayusculas:" + ejemplo.toUpperCase());
        System.out.println("Todo en minusculas:" + ejemplo.toLowerCase());
        System.out.println("¿Termina con \"toideo\"? " + ejemplo.endsWith("toideo"));
        System.out.println("¿Empieza con \"pla\"? " + ejemplo.startsWith("pla"));
        System.out.println("¿contiene \"cleido\"?" + ejemplo.contains("cleido"));
        System.out.println("Subcadena: " + ejemplo.substring(3, 8));
        System.out.println("Sustituye e por i " + ejemplo.replace("e", "i"));
        String conEspacios = "                titititi          ";
        System.out.println("Longitud: " + conEspacios.length());

        String sinEspacios = conEspacios.trim();
        System.out.println("Longitud: " + sinEspacios.length() + "String:" + sinEspacios);
        System.out.println("Comparar con equalsIgnoreCase: ");
        String minusculas = "segunda";
        String mayusculas = "SEGUNDA";
        System.out.println("con equals: " + minusculas.equals(mayusculas));
        System.out.println("con equalsIgnoreCase: " + minusculas.equalsIgnoreCase(mayusculas));


        //tamaño de un String
        String str = "hola";
        System.out.println("tamaño = " + str.length());
        System.out.println(" = " + str.charAt(str.length() -1));

        // eliminar espacios en blanco
        String frase = "El examen es el lunes";
        frase = frase.replace(" ", "");
        System.out.println(frase);



    }
}

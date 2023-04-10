package Examen22;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio01CodSwift {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //
        String salir = "";
        do {
            String códigoSwift = pedirCódigo();
            System.out.println("CÓDIGO SWIFT " + códigoSwift +":");
            System.out.println("======================");
            // comprobamos si el código es correcto
            if (códigoSwift.length() != 8 && códigoSwift.length() != 11){
                System.out.println("El numero de caracteres introducidos (" +códigoSwift.length() + ") no es correcto el número de caracteres debe tener 8 u 11 caracteres");
            }else {
                String pais = códigoSwift.substring(4,6);
                System.out.println("Pais: " + pais);
                String localidad = códigoSwift.substring(6,8);
                //System.out.println(localidad);

                if (localidad.equals("MM")){
                    if (pais.equals("ES")){
                        System.out.println("Localidad: Madrid");
                    }else {
                        System.out.println("Localidad: Moscú");
                    }
                }
            }
            System.out.println("Quieres seleccionar otra prenda ? s/n");
            salir = sc.nextLine().substring(0,1);

        }while (salir.equalsIgnoreCase("n"));

    }
    public static String pedirCódigo() {

        System.out.println("Introduce un código: ");
        String código = sc.nextLine();
        return código;
    }
}

package PracticandoEnCasa;

import java.sql.SQLOutput;

public class EjemplosTipoBoolean {
    public static void main(String[] args) {
        boolean apto = true;
        System.out.println("Es apto? " + apto);

        // Vamos a poder trabajar con operadores logicos:
        // Ninarios y NOT
        System.out.println(!apto);
        apto = !apto;
        //operadores binarios
        //* "AND" y "&&"
        System.out.println("AND");
        System.out.println("====");
        boolean v1 = true;
        boolean v2 = false;
        boolean and = v1 && v2;
        System.out.println(and);

        //* "OR", o "||"
        System.out.println("OR");
        System.out.println("====");
        boolean v4 = v1;
        boolean or = v1 || v2; // true + true = true
        System.out.println(or);

        //"XOR" or exclusivo ^
        boolean xor = v1 ^ v2; // true + true = false
        System.out.println(xor);

        boolean frio = false;
        boolean seco = false;
        boolean verano = false;
        boolean trekking = seco && (!frio || verano);
        System.out.println(trekking);






    }
}

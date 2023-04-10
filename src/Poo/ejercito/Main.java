package Poo.ejercito;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Unidad.unidades);
        Unidad u1 = new Unidad("Daw1");
        System.out.println(Unidad.unidades);
        Unidad u2 = new Unidad("Daw2");
        System.out.println(Unidad.unidades);
        Unidad u3 = new Unidad("SMR1");
        System.out.println(Unidad.unidades);
        Unidad u4 = new Unidad("SMR2");
        System.out.println(Unidad.unidades);

        //vamos a crear una serie de caballeros y lo vamos metiendo en el for según se vayan creando
        ArrayList<Caballero> caballeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("nuevo caballero");
            caballeros.add(new Caballero(sc.nextLine()));  // en vez de poner un String
        }
        // queremos saber cuantos objetos de tipo caballeros hemos creado
        // en vez del .size() vamos a leer el contador
        System.out.println("he creado" + Caballero.caballeros);
        System.out.println("sus nombres son: ");
        for (int i = 0; i < caballeros.size(); i++) {
            System.out.println(caballeros.get(i).nombre);
        }
        // creamos al general
        General general = new General("pollito");

        // creamos medicos
        Medico medico = new Medico("House");
        System.out.println("Mi ejercito tiene: ");
        System.out.println(" * " + Unidad.unidades + " unidades");
        System.out.println(" * " + Caballero.caballeros + " Caballeros");
        System.out.println(" * " + General.generales + " General");
        System.out.println(" * " + Medico.medicos + " Medicos");
    }
}

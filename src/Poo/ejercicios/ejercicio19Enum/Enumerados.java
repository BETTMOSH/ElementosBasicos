package Poo.ejercicios.ejercicio19Enum;

import java.util.Arrays;

public class Enumerados {
    //Crea un paquete "enumerados" y dentro de él una clase Enumerados, y en esta clase
    //crea estos enumerados:
    //a. Las estaciones del año
    enum Estaciones {
        PRIMAVERA, VERANO, OTOÑO, INVIERNO
    }
    //b. Las partes del día (mañana, mediodía, tarde, noche)
    enum PartesDelDia {
        MAÑANA, MEDIODIA, TARDE, NOCHE
    }
    //c. Las comidas del día (desayuno, almuerzo, merienda, cena)
    enum Comidas {
        DESAYUNO, ALMUERZO, MERIENDA, CENA
    }
    //Añade un método main donde
    public static void main(String[] args) {
        // creas una variable de cada uno de estos tipos y le asignas
        //un valor determinado
        Estaciones e = Estaciones.INVIERNO;
        System.out.println(e);
        PartesDelDia p = PartesDelDia.TARDE;
        System.out.println(p);
        Comidas c = Comidas.MERIENDA;
        System.out.println(c);

        // y luego guardas en un array todas las constantes que contiene
        //cada uno de los enumerados, y muestras su contenido
        Estaciones[] estaciones = Estaciones.values();  // con el método values puedo coger de golpe todos los métodos enumerados y guardarlo
        System.out.println(Arrays.toString(estaciones));

        PartesDelDia[] partesDelDias = PartesDelDia.values();
        System.out.println(Arrays.toString(partesDelDias));
        Comidas[]comidas = Comidas.values();
        System.out.println(Arrays.toString(comidas));
    }

}

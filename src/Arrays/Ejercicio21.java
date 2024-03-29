package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio21 {
    public static void main(String[] args) {
        //Haz lo mismo que el ejercicio anterior, pero suponiendo que son dos jugadores los que
        //extraen alternativamente 10 carta. Averigua cuál de los dos jugadores gana.

        String[] baraja = new String[40];
        String[] palo = {"oros", "copas", "espadas", "bastos"};
        String[] numero = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
        int indiceB = 0;
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < numero.length; j++) {
                String carta = numero[j] + " de " + palo[i];
                //System.out.println(carta);
                // añadimos la carta a la baraja
                baraja[indiceB] = carta;
                indiceB++;
            }
        }
        ArrayList<String> mazo = new ArrayList<>();
        // ahora lo rellenamos
        for (int i = 0; i < baraja.length; i++) {
            mazo.add(baraja[i]);
        }
        Collections.shuffle(mazo);
        // hasta aqui el ejercicio 20 ahora pondremos dos jugadores
        String[] jugador1 = new String[10];
        String[] jugador2 = new String[10];
        int indice1 = 0;
        int indice2 = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
                jugador1[indice1] = mazo.get(i);
                indice1 ++;
        }else {
                jugador2[indice2] = mazo.get(i);
                indice2++;
            }
    }
        System.out.println(Arrays.toString(jugador1));
        System.out.println(Arrays.toString(jugador2));

        int puntos1 = 0;
        for (int i = 0; i < jugador1.length; i++) {
            if (jugador1[i].startsWith("as")){
                puntos1 += 1;
            } else if (jugador1[i].startsWith("dos")) {
                puntos1+= 2;
            }else if (jugador1[i].startsWith("tres")) {
                puntos1 += 3;
            }else if (jugador1[i].startsWith("cuatro")) {
                puntos1 += 4;
            }else if (jugador1[i].startsWith("cinco")) {
                puntos1 += 5;
            }else if (jugador1[i].startsWith("seis")) {
                puntos1 += 6;
            }else if (jugador1[i].startsWith("siete")) {
                puntos1 += 7;
            }else if (jugador1[i].startsWith("sota")) {
                puntos1 += 10;
            }else if (jugador1[i].startsWith("caballo")) {
                puntos1 += 11;
            }else if (jugador1[i].startsWith("rey")) {
                puntos1 += 12;
            }
        }
        System.out.println("total de puntos jugador 1: " + puntos1);

        // sumamos loos puntos del jugador 2
        int puntos2 = 0;
        for (int i = 0; i < jugador2.length; i++) {
            if (jugador2[i].startsWith("as")) {
                puntos2 = puntos2 + 1;
            } else if (jugador2[i].startsWith("dos")) {
                puntos2 = puntos2 + 2;
            } else if (jugador2[i].startsWith("tres")) {
                puntos2 = puntos2 + 3;
            } else if (jugador2[i].startsWith("cuatro")) {
                puntos2 = puntos2 + 4;
            } else if (jugador2[i].startsWith("cinco")) {
                puntos2 = puntos2 + 5;
            } else if (jugador2[i].startsWith("seis")) {
                puntos2 = puntos2 + 6;
            } else if (jugador2[i].startsWith("siete")) {
                puntos2 = puntos2 + 7;
            } else if (jugador2[i].startsWith("sota")) {
                puntos2 = puntos2 + 10;
            } else if (jugador2[i].startsWith("caballo")) {
                puntos2 = puntos2 + 11;
            } else {
                puntos2 = puntos2 + 12;
            }
        }
        System.out.println("total de puntos del jugador 2: " + puntos2);
        if (puntos1 > puntos2){
            System.out.println("gana jugador 1");
        } else if (puntos1 < puntos2) {
            System.out.println("gana jugador 2");
        }else {
            System.out.println("empate");
        }
    }
}

package PracticandoEnCasa;

import java.util.ArrayList;
import java.util.Arrays;

public class CartasAzar {
    public static void main(String[] args) {

        ArrayList<Carta> c = new ArrayList<Carta>();
        Carta cartaAux = new Carta();
        c.add(cartaAux);

        for (int i = 0; i < 9; i++) {
            do {
                cartaAux = new Carta();
            }while (c.contains(cartaAux));

            c.add(cartaAux);
        }
        for (Carta miCarta : c) {
            System.out.println(miCarta);
        }
    }
}

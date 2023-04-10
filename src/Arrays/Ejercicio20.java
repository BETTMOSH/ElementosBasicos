package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio20 {
    public static void main(String[] args) {
        //Haz un programa que simule el siguiente juego de cartas: tenemos una baraja española.
        //La barajamos y sacamos 10 cartas. Suma los puntos obtenidos.
        String[] palo ={"oros","copas","espadas","bastos"};
        String[] numero = {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
        String[] baraja = new String[40];
        // lo rellenamos
        int indiceBaraja = 0; // este será el índice en el array cada vez que ingrese una carta.
        //while (indiceBaraja < 40){
            // mientras no llenemos la baraja creamos una carta y se la añadimos
             for (int i = 0; i < palo.length; i++) {
                  for (int j = 0; j < numero.length; j++) {
             String cartas = numero[j] + " de " + palo[i];
             baraja[indiceBaraja] = cartas;
             indiceBaraja++;
            }
        }
        System.out.println(Arrays.toString( baraja));
             // ahora la barajamos
        ArrayList<String> mazo = new ArrayList<>();
        // ahora lo relleno con las cartas que tengo en el array baraja
        for (int i = 0; i < baraja.length; i++) {
            mazo.add(baraja[i]);  // metemos en el arraylist los elementos de uno en uno.
        }
        Collections.shuffle(mazo);
        //Collections.addAll(mazo, baraja);
        //Collections.shuffle(mazo);

        //System.out.println(mazo);

        // sacamos las 10 primeras cartas
        String[] mano = new String[10];
        for (int i = 0; i < mano.length; i++) {
            mano[i] = mazo.get(i);
        }
        //imprimimos
        System.out.println(Arrays.toString(mano));
        // tenemos que sumar con un sumador
        int puntos = 0;
        for (int i = 0; i < mano.length; i++) {
            if (mano[i].startsWith("as")){
                puntos += 1;
            } else if (mano[i].startsWith("dos")) {
                puntos+= 2;
            }else if (mano[i].startsWith("tres")) {
                puntos += 3;
            }else if (mano[i].startsWith("cuatro")) {
                puntos += 4;
            }else if (mano[i].startsWith("cinco")) {
                puntos += 5;
            }else if (mano[i].startsWith("seis")) {
                puntos += 6;
            }else if (mano[i].startsWith("siete")) {
                puntos += 7;
            }else if (mano[i].startsWith("sota")) {
                puntos += 10;
            }else if (mano[i].startsWith("caballo")) {
                puntos += 11;
            }else if (mano[i].startsWith("rey")) {
                puntos += 12;
            }
        }
        System.out.println("total de puntos: " + puntos);
    }
}

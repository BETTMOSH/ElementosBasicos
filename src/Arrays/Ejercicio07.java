package Arrays;

import java.util.Arrays;

public class Ejercicio07 {
    public static void main(String[] args) {
        // realizar un programa que genere aleatoriamente 12 notas de practicas de una
        // asignatura entre(0 y 10) a continuacion debe mostrar todas las notas
        // la nota media, la nota mas alta que ha sacado.
        double[] notas = new double[12];
        double notaMedia=0, notaAlata=0;
        int contador=0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (Math.random() * 10);
            if (notas[i] > 0){
                notaMedia = notaMedia/notas.length;
                contador++;
            }
        }
        System.out.printf("%.2f", notaMedia);
    }
}

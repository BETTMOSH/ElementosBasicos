package ForAnidados;

import java.util.Arrays;

public class Ejercicio22Anidado {
    public static void main(String[] args) {
        //Haz un programa que realice lo siguiente:
        //• Crea una tabla de 5x5 enteros.
        //• Carga la tabla con valores numéricos enteros.
        //• Suma todos los elementos de cada fila y todos los elementos de cada columna
        //visualizando los resultados en pantalla.
        int [][] tabla = new int[5][5];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int)(Math.random() * 11);
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
        // a sumar las filas
        int[] sumaFila = new int[5];
        for (int i = 0; i < tabla.length; i++) {
            int suma = 0;
            for (int j = 0; j < tabla[i].length; j++) {
                suma +=tabla[i][j];
            }
            // cada vez que termaniamos de recorrer una fila guardo el resultado en el array sumaFila en la posicion de esa fila.
            sumaFila[i] = suma;
        }
        System.out.println(Arrays.toString(sumaFila));
    }
}

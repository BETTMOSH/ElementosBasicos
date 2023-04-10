package Arrays;

import java.util.Arrays;

public class Ejercicio06 {
    public static void main(String[] args) {
        //Realizar un programa en el se se inicialice un array de longitud 20 con números
        //aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los
        //números positivos,la media de los negativos y contar el número de ceros.
        int[] array = new int[20];
// con los numero negativos el random max 10 y min -10 tiene que ser = -11
        for (int i = 0; i < array.length; i++) {
            // arrays[i] = (int) (Math.random() * (max - min + 1) + (min));
            // arrays[i] = (int) (Math.random() * (10 - (-11) + 1) + (-11);
            array[i] = (int) (Math.random() * 22 - 11);
        }
        System.out.println(Arrays.toString(array));
        int contaPositivo = 0;
        int contaNegativo = 0;
        int contaCeros = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                sumaNegativos += array[i];
                contaNegativo++;
            } else if (array[i] > 0) {
                sumaPositivos += array[i];
                contaPositivo++;
            }else{
                contaCeros++;
            }
        }
        double mediaPositivos = sumaPositivos/contaPositivo;
        double mediaNegativos = sumaNegativos/contaNegativo;

        System.out.println("La media de positivos es: " + mediaPositivos);
        System.out.println("La media de negativos es: " + mediaNegativos);
        System.out.println("\n positivos: " + contaPositivo + "\n negativos: " + contaNegativo + "\n numero de ceros: " + contaCeros);
    }
}

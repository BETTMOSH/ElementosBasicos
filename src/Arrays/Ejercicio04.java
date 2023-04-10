package Arrays;

import java.util.Arrays;


public class Ejercicio04 {
    public static void main(String[] args) {
        //Haz un programa en el que se cree un array que lea por teclado la longitud que tiene
        //que tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y
        //10. Mostrar la suma de todos los números que se guardan en el array.
        // controla que el numero introducido para el tamaño ni sea cero ni negativo con while o do while
        // a continuacion inicializamos con numeros aleatorios entre el 1 y el 10
        //mostrar la suma de todos los numeros que se guardan en el array

        double[] notas = new double[12];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (Math.random() * 10);// no hacemos castinh explicito porque el metodo math random ya genera un double.

        }
        for (double elemento: notas) {
            System.out.printf("%2.f", elemento);
        }
        double suma = 0;
        for (double elemento: notas){
            suma=suma + elemento;
        }
        System.out.println("\n Media = "+ (suma/notas.length));
        //para sacar las notas mas altas y la mas baja
        //Arrays.sort(notas);
        //System.out.printf("\n Nota mas alta = %2.f", notas[notas.length -1]);
       // System.out.printf("\n Nota mas baja = %2.f", notas[0]);
    }
}

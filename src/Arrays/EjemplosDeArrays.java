package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjemplosDeArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double[] elementos;

        //inicializar => instanciar = cerar un objeto de tipo array
        elementos=new double[5]; // aqui lo guardamos el espacio en memoria

        //lo rellenamos
        elementos[0] = 10.8;
        elementos[1] = 14.3;
        elementos[2] = 13.5;
        elementos[3] = 12.1;
        elementos[4] = 9.7;

        String[] diasLaborables = new String[5];
        diasLaborables[0] = "Lunes";
        diasLaborables[1] = "Martes";
        diasLaborables[2] = "Miercoles";
        diasLaborables[3] = "Jueves";
        diasLaborables[4] = "Viernes";
        //diasLaborables[5] = "Sábado";
        //diasLaborables[6] = "Domingo";

        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};// en vez de new.... ponemos llaves y los valores separados por comas

        //para imprimir
        //System.out.println(elementos[6]);// Dara error por que el array va solo hasta el numero 5.
        // con for
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println(Arrays.toString(diasLaborables));
        //no funciona ==> System.out.print(elementos);
        //no funciona ==> System.out.print(diasLaborables);
        //no funciona ==> System.out.print(meses);

        // Una forma simplificada del bucle for "foreach"
        for (String A: meses) {
            System.out.print(A + ", ");
        }
    }
}

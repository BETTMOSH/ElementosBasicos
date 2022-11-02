package EstructurasDeControl;

public class WhileEjemplos {
    public static void main(String[] args) {
        //vamos a hacer un bucle while, que imprima los numeros del 0 al 4
        int i = 0;
        while (i<5){   //Mientras que i <5 sea tru... entramoos al bucle e imprimimos i.
            System.out.println(i);
            // es importante que dedntro de while haya alguna condicion que haga que el bucle pare en algun momento.
            //normalmentye es una variable qu va cambiando de de valor hasta que toma un valor que hace que la condicion sea falasa
            i++;
        }
        System.out.println("fuera del bucle");
    }
}

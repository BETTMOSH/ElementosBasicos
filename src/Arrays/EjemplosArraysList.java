package Arrays;

import java.util.ArrayList;

public class EjemplosArraysList {
    public static void main(String[] args) {
        // un arraylist es como un tren poniendo vagones y quitándolos no se pueden usar números primitivos
        ArrayList<String> nombres = new ArrayList<>();
        System.out.println(nombres.size());
        // añado elementos en la ultima posicion
        nombres.add("valentin"); // index 0
        nombres.add("JavierA");  // index 1
        nombres.add("Claudia");  // index 2
        System.out.println(nombres.size());
        // podemos añadir un elemento en una posición determinada
        nombres.add(1, "Rebeca");
        System.out.println(nombres);

        // quiero imprimir el ultimo nombre
        System.out.println("el ultimo nombre es: " + nombres.get(nombres.size() -1));

        //quiero imprimir el primer nombre
        System.out.println("el primer nombre es: " + nombres.get(0));

        // quiero reemplazar un nombre de la lista
        nombres.set(2,"JavierA");
        System.out.println(nombres);
        System.out.println(nombres.size());

        // quiero quitar un elemento.
        nombres.remove("valentin");
        System.out.println(nombres.size());
        System.out.println(nombres);

        // recorremos el arraylist
        for (int i = 0; i < nombres.size(); i++) {
            nombres.set(i, nombres.get(i) + "s");
        }
        System.out.println(nombres);



    }
}

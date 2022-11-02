package EstructurasDeControl;

public class ForAnidados {
    public static void main(String[] args) {
        // un for anidado es un for que se utiliza dentro de otro for
        //entonves tendremos un fro ecxterno cuya variable seuele llamarse i
        //y metemos dentro de un for interno, cuya variablesuele llamarse jota
        //la logica que sigue es: por cada vuelta del bucle externo
        //el bucle interno ejecuta todas sus repeticiones.
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("     j = " + j);

            }

        }
    }
}

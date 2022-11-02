package EstructurasDeControl;

public class ForEjercicio23 {
    public static void main(String[] args) {
            //Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive)
        //usando el bucle for.
        // cuando tienes que ir acumulando es usar un sumador o acumulador que es una variable que ciomienza en 0 y
        // le vas añadiendo los resultados.
        int suma= 0; // esta variable se va guaradando parcialemnte.
        for( int i = 1; i <=11; i++){
            suma = suma + i;
            System.out.println("suma = " + suma + " i = " + i);
        }
    }
}

package EstructurasDeControl;

public class EjemplosFor {
    public static void main(String[] args) {
        //Escribamos un bucle para imprimir números enteros del 0 al 10(ambas inclusive) en la misma línea.
        for(int i = 0; i <=10;i++) { // desde que i=0 y mientras que i<=10 vamos incrrementando la i de 1 en 1
                                     //dentro del bloque escribimos lo que teiene que hacer con cada repeticion.
          //  System.out.println(i);
        }
        // queremos imprimir numeros del 1 al 10 ambos inclusive
        for(int i = 1; i<11; i +=2){
            //System.out.println(i);
        }
        // queremos imprimir de 10 a 1 decrementando de 1 en 1.
        for(int i=10; i>=0; i--){
            System.out.println(i);
    }
    }
}

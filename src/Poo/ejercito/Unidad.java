package Poo.ejercito;

public class Unidad {

    String nombre;
    static int unidades;

    public Unidad(String nombre) {
        this.nombre = nombre;
        // cada vez que creamos una unidad incrementamos el contador
        unidades++;  // la principal utilidad de los atributos se incrementará.

    }
}

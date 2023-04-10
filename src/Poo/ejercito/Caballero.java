package Poo.ejercito;

public class Caballero {

    String nombre;
    static int caballeros;  // cuenta los caballeros que sevan creando

    public Caballero(String nombre) {
        this.nombre = nombre;
        caballeros++; // cada vez que se crea el constructor caballero se incrementa
    }
}

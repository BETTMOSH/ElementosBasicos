package Poo.ejemplos.Herencia2;

import java.util.ArrayList;

public class Programador extends Empleado {
    private ArrayList<String> lenguajes;

    public ArrayList<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(ArrayList<String> lenguajes) {
        this.lenguajes = lenguajes;
    }
}

package Poo.ejercito;

public class Medico {
    String nombre;
    static int medicos;

    public Medico(String nombre) {
        this.nombre = nombre;
        medicos++;
    }
}

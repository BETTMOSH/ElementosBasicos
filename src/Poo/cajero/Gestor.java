package Poo.cajero;

public class Gestor {
    String nombre;
    private String teléfono; // como no se puede cambiar se pone privado
    double importeMaxAutorizado;

    public Gestor(String nombre, String teléfono, double importeMaxAutorizado) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.importeMaxAutorizado = importeMaxAutorizado;
    }

    public Gestor(String nombre, String teléfono) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.importeMaxAutorizado = 10000;
    }

    public String getTeléfono() {
        return teléfono;
    }

}

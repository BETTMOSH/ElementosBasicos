package Poo.ejercicios.ejercicio14Robot;

public class Robot {
    // atributos
    private String nombre;
    private String modelo;
    private int duración;

    // constructor sin parámetros
    public Robot() {
        this.nombre = "anónimo";
        this.modelo = "desconocido";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    // un constructor con 3 parámetros

    public Robot(String nombre, String modelo, int duración) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.duración = duración;
    }

    // constructor con dos parámetros
    public Robot(String nombre, String modelo) {
        this(nombre,modelo,20); // de esta manera se llama a otro constructor concretamente al de 3 parámetros

    }
}

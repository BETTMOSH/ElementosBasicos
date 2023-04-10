package Examen22.Ejercicio03;

public class Vehiculo {
    private String matrícula;
    int velocidad;

    public Vehiculo(String matrícula) {
        this.matrícula = matrícula;
    }

    public String getMatrícula() {
        return matrícula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matrícula='" + matrícula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}

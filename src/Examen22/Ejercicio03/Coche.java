package Examen22.Ejercicio03;

public class Coche extends Vehiculo {
    private int numPuertas;



    public Coche(String matrícula) {
        super(matrícula);
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numPuertas=" + numPuertas +
                ", velocidad=" + velocidad + ", matricula " + getMatrícula();
    }
}

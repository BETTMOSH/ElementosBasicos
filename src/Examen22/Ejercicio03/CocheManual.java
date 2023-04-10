package Examen22.Ejercicio03;

public class CocheManual extends Coche{
    private int marcha;

    public CocheManual(String matrícula) {
        super(matrícula);
    }
    void cambiarMarcha(int marcha){

    }

    @Override
    public String toString() {
        return "CocheManual{" +
                "marcha=" + marcha +
                ", velocidad=" + velocidad +
                '}';
    }

}

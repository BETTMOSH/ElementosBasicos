package Examen22.Ejercicio03;

public class CocheAutomático extends Coche {


    public CocheAutomático(String matrícula) {
        super(matrícula);
    }

    public void frenar(){

    }
    public void acelerar(){


    }

    @Override
    public String toString() {
        return "CocheAutomático{" +
                "velocidad=" + velocidad +
                '}';
    }
}

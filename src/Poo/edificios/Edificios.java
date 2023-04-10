package Poo.edificios;

public class Edificios {
    //las características son atributos que quiero guardar en una variable
    // no se inicializan --> eso se hace con el método constructor(main)
    int numPlantas;
    double area;
    int añoConstruccion;

    // Los métodos que pongamos aquí serán las funcionalidades que va a tener un objeto de esa clase
    // Hay un método que siempre, siempre existe. Es el método CONSTRUCTOR.
    // Aunque no lo escribas se va a crear implícitamente (constructor por defecto)
    // Nosotros normalmente lo declararemos por que.
    // El constructor sirve para crear objetos de la clase e inicializar los valores de
    // Es un método que se llama igual que la clase, incluidas las mayúsculas que tenga.
    public Edificios(int numPlantas, double area, int añoConstruccion) {
        this.añoConstruccion = añoConstruccion; // este objeto que estoy creando va a tener el ao que vamos a crear en la llamada
        this.area = area;
        this.numPlantas = numPlantas;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getAñoConstruccion() {
        return añoConstruccion;
    }

    public void setAñoConstruccion(int añoConstruccion) {
        this.añoConstruccion = añoConstruccion;
    }
}
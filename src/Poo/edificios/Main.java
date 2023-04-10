package Poo.edificios;

/**
 * A partir de ahora el método main lo vamos a meter en una clase
 */
public class Main {
    public static void main(String[] args) {
        // En el método main es donde vamos a crear los objetos de la clase edificio
        // para crear un objeto hacemos lo mismo para las clase de java SE: tipo nombre de la clase y el nombre que queremos dar al objeto
        // la palabra new y a continuación la llamada al constructor y los argumentos del objeto que estamos creando
        Edificios edificio1 = new Edificios(4,2400.16,1966);
        // tengo un edificio creado con esos valores. Si quiero ver cuáles son
        System.out.println("Plantas: " + edificio1.numPlantas + "; Area " + edificio1.area + "; Año de construcción " + edificio1.añoConstruccion);
        // edificio2 número de plantas = 6, área 3200,54, año de construcción 2001.

        Edificios edificio2 = new Edificios(6,3200.54,2001);
        System.out.println("Plantas: " + edificio2.numPlantas + "; Area " + edificio2.area + "; Año de construcción " + edificio2.añoConstruccion);
        // objeto que llama al constructor por defecto
        Edificios edificio3 = new Edificios(7, 2500.40,2015);
        System.out.println("Plantas: " + edificio3.numPlantas + "; Area " + edificio3.area + "; Año de construccion " + edificio3.añoConstruccion);
    }
}

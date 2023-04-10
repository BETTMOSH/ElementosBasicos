package Poo.ejercicios.ejercicio14Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot();

        //imprimimos los valores de robot1
        System.out.println("robot1: " + robot1.nombre + " - " + robot1.modelo + " - " + robot1.duración);

        // imprimimos los valores del robot 2
        Robot robot2 = new Robot("Terminator 1 ","T800",120);
        System.out.println("robot2: " + robot2.nombre + " - " + robot2.modelo + " - " + robot2.duración);

        // imprimimos los valores del robot 3
        Robot robot3 = new Robot("Terminator 2 ", "modelo T1000");
        System.out.println("robot 3: " + robot3.nombre + " - " + robot3.modelo + " - " + robot3.duración);
    }

}

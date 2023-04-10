package PracticandoEnCasa;

import java.util.Scanner;

public class RepartoDeDonaciones {
    public static void main(String[] args) {
        //Una institución social tiene un centro de salud, un comedor infantil,
        //una escuela infantil y un asilo de ancianos. La institución recibe anualmente
        // una donación que la reparte de la siguiente forma: 25% para la implementación del centro de salud,
        //35% para el comedor infantil, 25% para la escuela infantil y el resto para el asilo de ancianos.
        //Diseñe un algoritmo para efectuar el reparto de la donación.
        Scanner sc = new Scanner(System.in);
        double donacion;
        double centroSalud;
        double comedorInf;
        double escuelaInf;
        double asilo;
        System.out.println("Ingrese una donación: ");
        donacion =sc.nextDouble();
        centroSalud=donacion*0.25;
        comedorInf = donacion*0.35;
        escuelaInf = donacion * 0.25;
        asilo = donacion * 0.15;
        System.out.printf("\n el centro de salud recibe:  %.2f" , centroSalud);
        System.out.printf("\n el comedor infantil recibe:  %.2f" , comedorInf);
        System.out.printf("\n La escuela infantil recibe:  %.2f" , escuelaInf);
        System.out.printf("\n el asilo recibe: %.2f" , asilo);
    }
}

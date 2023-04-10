package Poo.aviones;

import Poo.edificios.Edificios;

public class Main {
    public static void main(String[] args) {
        Avion avion1 = new Avion("Airbus A320", 509, 890, new double[]{41.402338, 2.17403});
        avion1.imprimir();
        Avion avion2 = new Avion("Boing 777", 515, 905, new double[]{41.38879, 2.15899});
        avion2.imprimir();

        // llevamos los pasajeros a su destino
        avion1.llevarPasajeros("Barcelona", new double[]{41.38879, 2.15899});
    // para probar la `proteccion de paquete por defecto sin modificar el acceso
    // intentaremos crear un edificio desde el main de aviones

        Edificios edificio = new Edificios(3,4.5, 2022) ;
        System.out.println();
    }
}

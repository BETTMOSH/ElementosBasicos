package Poo.aviones;

import java.util.Arrays;

public class Avion {
    // atributos
    String nombre;
    int aforo;
    int velocidadMedia;
    double[] coordenadas;
    //constructor que inicializa los valores en los objetos que creamos
    public Avion(String nombre,int aforo, int velocidadMedia, double[] coordenadas){
        this.nombre = nombre;
        this.aforo = aforo;
        this.velocidadMedia = velocidadMedia;
        this.coordenadas = coordenadas;
    }
    //metodo que sirva para llevar pasajeros de un punto geográfico

    public String toString(){
        return "Nombre" + nombre + ": aforo= " + aforo + ", velocidadMedia= " + velocidadMedia + ", coodenadas= " + Arrays.toString(coordenadas);
    }
    public void imprimir(){
        System.out.println(this.toString());
    }
    public void llevarPasajeros(String destino, double[] coordenadas){
        System.out.println("Nos vamos a " + destino + " ! ");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getVelocidadMedia() {
        return velocidadMedia;
    }

    public void setVelocidadMedia(int velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }

    public double[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(double[] coordenadas) {
        this.coordenadas = coordenadas;
    }
}

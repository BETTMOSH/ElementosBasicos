package PooDePractica.figurasSuperHeroes;

public class Figura {
    private String código;
    private double precio;
    private SuperHéroe superheroe;
    private Dimensión dimensiones;

    public Figura(String código, double precio, SuperHéroe superheroe, Dimensión dimensiones) {
        this.código = código;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimensiones = dimensiones;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public SuperHéroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(SuperHéroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimensión getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimensión dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Override
    public String toString() {
        return "Figura{" + "código=" + código + ", precio=" + precio + ", superheroe=" + superheroe + ", dimensiones=" + dimensiones +'}';
    }

    public void subirPrecio(double cantidad){
        precio += cantidad;
    }
}

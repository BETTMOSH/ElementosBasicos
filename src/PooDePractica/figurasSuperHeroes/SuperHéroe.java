package PooDePractica.figurasSuperHeroes;

public class SuperHéroe {
    private String nombre;
    private String descripción;
    private Boolean capa;


    public SuperHéroe(String nombre) {
        this.nombre = nombre;
        this.descripción = "";
        this.capa = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Boolean isCapa() {
        return capa;
    }

    public void setCapa(Boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "SuperHéroe{" + "nombre=" + nombre + ", descripción='" + descripción + ", capa=" + capa +'}';
    }
}

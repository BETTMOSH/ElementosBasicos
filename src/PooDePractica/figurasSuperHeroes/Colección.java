package PooDePractica.figurasSuperHeroes;

import java.util.ArrayList;

public class Colección {
    private String nombreColección;
    private ArrayList<Figura> listaFiguras;


    public Colección(String nombreColección) {
        this.nombreColección = nombreColección;
        listaFiguras = new ArrayList<>();
    }

    public String getNombreColección() {
        return nombreColección;
    }

    public void setNombreColección(String nombreColección) {
        this.nombreColección = nombreColección;
    }

    public void añadirFigura(Figura fig){
        listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id) {
        for (Figura f : listaFiguras) {
            if (f.getCódigo().equals(id)) {
                f.subirPrecio(cantidad);
            }
        }
        /*for (int i = 0; i < listaFiguras.size(); i++) {
            Figura f = listaFiguras.get(i);
            if (f.getCódigo().equalsIgnoreCase(id)) {
                f.subirPrecio(cantidad);
            }
        }*/
    }

    @Override
    public String toString() {
        String cadena = "Colección" + nombreColección + "\n---------------\n";
        for (Figura f:listaFiguras){
            cadena += f+"\n";
        }
        return cadena;
    }

    public String conCapa() {
        String cadena = "Figuras de superheroes con capa\n--------------\n";
        for (Figura f : listaFiguras) {
            if (f.getSuperheroe().isCapa() == true) {
                cadena += f.toString() + "\n";
            }
        }
        return cadena;
    }

    public double masValioso(){
        double cantidad = 0;
        /*for (int i = 0; i < listaFiguras.size(); i++) {
            Figura f = listaFiguras.get(i);
            if (f.getPrecio() > cantidad){
                cantidad = f.getPrecio();
            }
        }*/
        for (Figura f : listaFiguras){
            if (f.getPrecio() > cantidad){
                cantidad = f.getPrecio();
            }
        }
        return cantidad;
    }
    public double getValorColección(){
        double valor = 0;
        for (int i = 0; i < valor; i++) {
            valor += getValorColección();
        }
        return valor;
    }
    public double getVolumenColección(){
        double volumen = 0;
        return volumen;
    }
}

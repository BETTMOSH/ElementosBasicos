package Poo.banco;

import java.util.Arrays;

public class Cuenta {
    private String iban;
    private double saldo;
    private boolean activa;
    private String[] idTitulares;

    public Cuenta(String iban, double saldo, boolean activa, String[] idTitulares) {
        this.iban = iban;
        this.saldo = saldo;
        this.activa = activa;
        this.idTitulares = idTitulares;
    }
    // si los atributos son private solamnte `pueden ser leidos desde la misma clase
    //para ello se utiliza n dos metodos    get--> para leer     set -->


    public String getIban() {return iban;}
    public double getSaldo() {return saldo;}

    public boolean isActiva() {return activa;}

    public String[] getDniTitulares() {return idTitulares;}


    // setters
    public void setIban(String iban) {this.iban = iban;}

    public void setSaldo(double saldo) {this.saldo = saldo;}

    public void setActiva(boolean activa) {this.activa = activa;}

    public void setDniTitulares(String[] dniTitulares) {this.idTitulares = dniTitulares;}


    @Override
    public String toString() {
        String atributosObjeto;
        if (this.activa == true) {
             atributosObjeto = iban + " - " + saldo + " € - activa" + Arrays.toString(idTitulares);
        }else {
            atributosObjeto = iban + " - " + saldo + " € - No activa" + Arrays.toString(idTitulares);
        }
        return atributosObjeto;
    }
    public void imprimirCuenta(){
        System.out.println(this.toString());
    }
}

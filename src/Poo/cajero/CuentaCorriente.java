package Poo.cajero;

import java.util.Scanner;

public class CuentaCorriente {

    String DNI;
    public String nombreTitular;
    private double saldo;
    static String banco;
    private Gestor gestor;

    // para crear cuenta: se necesita dos parámetros, dni y nombre - saldo inicial = 0
    public CuentaCorriente(String DNI, String nombre){
        this.DNI = DNI;
        this.nombreTitular = nombre;
        this.saldo = 0;
    }
    public void sacarDinero(double cantidad) {
        if (this.saldo >= cantidad){
            this.saldo = this.saldo - cantidad;
            System.out.println("La operación se ha realizado correctamente. Saldo actual: " + this.saldo + "€");
        }else {
            System.out.println("saldo insuficiente");
        }
    }
    public void  ingresarDinero(double cantidad){
        //sumamos el dinero que vamos a ingresar
        this.saldo = this.saldo + cantidad;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "DNI='" + DNI + '\'' +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    public void mostrarInformación() {
        System.out.println(this.toString()); // esto se`puede hacer de muchas formas
    }

    public CuentaCorriente(String DNI, double saldo) {
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public CuentaCorriente(String DNI, String nombreTitular, double saldo) {
        this.DNI = DNI;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }
    // añadimos los getters and setters

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
}

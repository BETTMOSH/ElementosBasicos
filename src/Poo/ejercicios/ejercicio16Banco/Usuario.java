package Poo.ejercicios.ejercicio16Banco;

import java.util.Arrays;

public class Usuario {
    private String login;
    private String nombre;
    private String apellido;
    private String[] cuentas;
    private String idUsuario;

    public Usuario(String login, String nombre, String apellido, String[] cuentas, String idUsuario) {
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentas = cuentas;
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(String[] cuentas) {
        this.cuentas = cuentas;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuentas=" + Arrays.toString(cuentas) +
                ", idUsuario='" + idUsuario + '\'' +
                '}';
    }

}

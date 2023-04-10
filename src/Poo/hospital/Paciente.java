package Poo.hospital;

import java.util.Arrays;
import java.util.Scanner;

public class Paciente {
    //atributos caracteristicas que queremos guardar de los pacientes

    private String nombre;
    private String apellidos;
    private String fechaNacimiento;   // formato "dd/mm/aaaa"
    private int numeroHistorial; // codigo del paciente historial: > 0
    private boolean alergias;
    private String descripcionAlergias;  // es un string con cada tipo de alergias
    private String[] sintomas;
    // constructor con todos los paramettros


    public Paciente(String nombre, String apellidos, String fechaNacimiento, int numeroHistorial, boolean alergias, String descripcionAlergias, String[] sintomas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;

        // si el numero de historial es <=0 decimos que es incorrecto y asignamos el valor 999999999
        if (numeroHistorial <= 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("el historial no puede ser negativo o 0");
            numeroHistorial = sc.nextInt();
        }else {
            this.numeroHistorial = numeroHistorial;
        }
        this.alergias = alergias;
        this.descripcionAlergias = descripcionAlergias;
        this.sintomas = sintomas;

    }
    // para que siga funcionando el constructor una vez declarado en la clase tenemos que hacerlo explicito

    public Paciente() {
    }

    public String toString() {
        if (alergias){
        return "\nDatos del Paciente{" +
                "nombre='" + nombre + "\n============" +
                "\nApellidos='" + apellidos + '\'' +
                "\nFechaNacimiento='" + fechaNacimiento +
                "\nHistorial clinico=" + numeroHistorial +
                "\nAlergias=" + alergias +
                " (" + descripcionAlergias + ")" +
                ", sintomas=" + Arrays.toString(sintomas) +
                '}';
        }else {
            return "\nDatos del Paciente{" +
                    "nombre='" + nombre + "\n============" +
                    "\nApellidos='" + apellidos + '\'' +
                    "\nFechaNacimiento='" + fechaNacimiento +
                    "\nHistorial clinico=" + numeroHistorial +
                    "\nAlergias=" + alergias +
                    " (" + descripcionAlergias + ")" +
                    ", sintomas=" + Arrays.toString(sintomas) +
                    '}';

        }
    }
    // si no ponemos ningun constructor crea una invisible

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroHistorial() {
        return numeroHistorial;
    }

    public void setNumeroHistorial(int numeroHistorial) {
        this.numeroHistorial = numeroHistorial;
    }

    public boolean isAlergias() {
        return alergias;
    }

    public void setAlergias(boolean alergias) {
        this.alergias = alergias;
    }

    public String getDescripcionAlergias() {
        return descripcionAlergias;
    }

    public void setDescripcionAlergias(String descripcionAlergias) {
        this.descripcionAlergias = descripcionAlergias;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }
}

package Poo.ejercicios.Ejercicio20Aplicación;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //En el paquete aplicación crea también una clase Main con un método main
        //• Crea un usuario con datos que pedimos por teclado
        String[] datos = pedirDatos(); //llamo al método pedirDatos
        Usuario usuario1 = new Usuario(datos[0],datos[1],datos[2]);

        //• Imprime los datos del usuario creado
        imprimirDatos(usuario1);

        usuario1.mensajeEstado();

        usuario1.setEstado(Estado.ACTIVO);

        usuario1.mensajeEstado();
    }
    public static String[] pedirDatos(){
        Scanner sc =new Scanner(System.in);
        String[] datos = new String[3];
        System.out.println("Nombre: ");
        datos[0] = sc.nextLine();
        System.out.println("Email");
        datos[1] = sc.nextLine();
        System.out.println("Password");
        datos[2] = sc.nextLine();
        return datos;
    }
    public static void imprimirDatos(Usuario usuario){
        System.out.println("Username: " + usuario.getUsername());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Password: " + usuario.getPassword());
    }
}

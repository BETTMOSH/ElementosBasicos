package Poo.ejercicios.Ejercicio20Aplicación;

import java.sql.SQLOutput;

public class Usuario {
    //Crea un paquete aplicacion y dentro de él una clase Usuario
    //La clase Usuario debe contener:
    //• Atributos: username, email, password
    private String username;
    private String email;
    private String password;

    private Estado estado;

    //• Constructor con tres parámetros para inicializar las instancias de la clase
    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.estado = Estado.PENDIENTE;
    }

    //• Getters y setters para los atributos, teniendo en cuenta que una vez creado un
    //  usuario no podemos cambiar su nombre

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //• Añade un método toString para visualizar las propiedades de los usuarios.


    //En la clase Usuario:
    //• Añade un tipo enumerado de nombre Estado con los siguientes valores:
    //pendiente, activo, bloqueado


    //• Añade a la clase Usuario un atributo estado de tipo Estado;
    //• Haz lo necesario para que cuando se crea un usuario se le asigne por defecto el
    //estado pendiente.
    //• Añade métodos para poder ver y cambiar el estado de un usuario.

    public void mensajeEstado(){
        if (this.estado.equals(Estado.PENDIENTE)){
            System.out.println("tienes que esperar un poco");
        } else if (this.estado.equals(Estado.ACTIVO)) {
            System.out.println("todo ok via libre");
        } else if (this.estado.equals(Estado.BLOQUEADO)) {
            System.out.println("lo siento estas bloqueado");

        }
    }

}

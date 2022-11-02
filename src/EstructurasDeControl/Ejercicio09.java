package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        //Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se
        //comparan con dos valores guardados previamente. Si coinciden, se indica “Has
        //entrado al sistema”, en caso contrario se da un error.
        String user = "pablo";
        String passwrd = "pablo";

        Scanner sc = new Scanner(System.in);
        System.out.println("Usuaio: ");
        String usuario = sc.nextLine();
        System.out.println("Contraseña");
        String password = sc.nextLine();
        if (usuario.equals(user) && password.equals(passwrd)){
            System.out.println("has entrado al sistema");
        }else{
            System.out.println("error");
        }
    }
}

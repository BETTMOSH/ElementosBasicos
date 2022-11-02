package EstructurasDeControl;


import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Dentro de una clase Joven tenemos las variables enteras edad, nivelDeEstudios e
        //ingresos. Necesitamos almacenar en la variable boolean jasp el valor:
        //a. true, si la edad es menor o igual a 28 y el nivelDeEstudios es mayor que tres, o
        //bien la edad es menor de 30 y los ingresos superan los 28.000 euros.
        //b. false, en caso contrario.
        //Escribe el código necesario.
        Scanner sc = new Scanner(System.in);
        int edad,nivelDeEstudios,ingresos;
        System.out.println("ingrese la edad: ");
        edad = sc.nextInt();
        System.out.println("nivel de estudios:\n0 - Sin estudios\n1 - educacion primaria\n2 - Eso\n3 - Grado medio\n4 - Estudios Superiores");
        nivelDeEstudios = sc.nextInt();
        System.out.println("Ingrese los ingresos: ");
        ingresos = sc.nextInt();

        boolean jasp;
        if(edad <= 28 && nivelDeEstudios > 3 || edad < 30 && ingresos >28000){
            jasp = true;
        }else { // en caso contrario.
            jasp = false;
        }
        if (jasp) { // es igual que jasp == true
            System.out.println("eres muy joven");
        }
    }
}

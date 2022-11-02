package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        //Tenemos un programa que pregunta a los estudiantes qué lenguaje de
        //programación están estudiando. Hay cuatro opciones, una de las cuales es correcta:
        //Java, Kotlin, Scala o Python
        //Tu tarea consiste en leer el número de respuesta de la entrada estándar y generar
        //el resultado de la prueba: " ¡Sí! ", " ¡No! " u "Opción desconocida". La respuesta
        //correcta es Java (obviamente).
        Scanner sc = new Scanner(System.in);
        System.out.println("Que lenguaje estas estudiando?\n1. Java\n2.kotlin\n3. scala\n4. pyton");
        int opcion = sc.nextInt();
        /*int java = 1;
        int kotlin = 2;
        int scala = 3;
        int phyton = 4;
        if (){*/
        switch (opcion){
            case 1:
                System.out.println("si");
            break;
            case 2:
            case 3:
            case 4:
                System.out.println("no");
                break;
            default:
                System.out.println("Ese numero no es una opcion correcta.");
        }
        System.out.println("fin");

    }
}

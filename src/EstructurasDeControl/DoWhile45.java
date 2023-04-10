package EstructurasDeControl;

import java.util.Scanner;

public class DoWhile45 {
    public static void main(String[] args) {
        // Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta
        //que seleccionamos la opción de “Salir”.
        // PREGUNTA DE EXAMEN:
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
           //mostrar el menu
            System.out.println("menu:\n1. Derecha:\n2. Izquierda:\n3. Arriba:\n4. Abajo:\n5. Salir: ");
            menu= sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("-->");
                    break;
                case 2:
                    System.out.print("<-- ");
                    break;
                case 3:
                    System.out.print(" ^ ");
                    break;
                case 4 :
                    System.out.print(" v ");
                    break;
                case 5:
                    break;
                default:
                    System.out.print("opcion incorrecta");

            }
        }while (menu!=5);
    }
}

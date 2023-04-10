package ForAnidados;

import java.util.Scanner;

/**
 * estos ejercicios estan en la hoja de ejercicios de estructuras de control de la primera evaluación
 */
public class EjerciciosForAnidados {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // vamos a hacer ejercicios hasta que nos cansemos
        String seguir ="";
        do {
            int ejercicio = menu();
            // con un swith según indica el ejercicio, ejecuto uno u otro ejercicio
            switch (ejercicio){
                case 27:
                    ejercicio27();
                    break;
                case 28:
                    ejercicio28();
                    break;
                case 29:
                    ejercicio29();
                    break;
                case 35:
                    ejercicio35();
                    break;
                default:
                    System.out.println("este ejercicio no entra aqui");
        }
            System.out.println("quieres hacer otro ejercicio? (S/N)");
            sc.nextLine();
            seguir= sc.nextLine().substring(0,1); // asi cogemos solo la primera letra
            seguir = seguir.substring(0,1);
        }while (seguir.equalsIgnoreCase("S"));
    }

    private static void ejercicio27() {

        String enunciado = "Escribe un programa que, dado un número n introducido por teclado, dibuje un\n" +
                "    cuadrado de dimensiones n * n, con un carácter también introducido por teclado.";
        System.out.println(enunciado);
        //resolvemos el ejercicio
        System.out.println("introduce un numero: ");
        int n = sc.nextInt();
        sc.nextLine(); // por precaución poner sc.nextline;
        System.out.println("Introducir un caracter: ");
        char c = sc.nextLine().charAt(0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }

    }
    public static void ejercicio28(){
        String enunciado = "Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un\n" +
                "rectángulo en que la base sea el número mayor y la altura el número menor, con un\n" +
                "carácter también introducido por teclado.";
        System.out.println(enunciado);
        System.out.println("a: ");
        int a = sc.nextInt();
        System.out.println("b: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("introduce un caracter: ");
        char c = sc.nextLine().charAt(0);
        // ahora hay que ver cuál es la base (el número mayor) y cual la altura (el menor)
        int base , altura = 0;
        if (a > b){
            base = a;
            altura = b;
        }else {
            base = b;
            altura = a;
        }
        // en la base tengo el número mayor y en altura el menor
        // ahora pinto el rectángulo: tantas filas como sea altura
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
    public static void ejercicio29(){
        String enunciado = "hacer un programa que introduzca un numero entero positivo y clacule se tabla de multiplicar hasta llegar a el.(nota: para que los numeros  queden alineados en columnas puedes usar tu tabulador";
        System.out.println(enunciado);
        System.out.print("introducir un numero:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <=n; i++) { // empiezo en 1 porque la tabla de multiplicar empieza por 1
            for (int j = 0; j <=10; j++) {
                System.out.print(i + " X " + j + " = " + (i*j) +"\t");
            }
            System.out.println();
        }

    }
    public static void ejercicio35(){
        String enunciado ="Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado,\n" +
                "        siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo,\n" +
                "        para n = 5:\n" +
                "         *****\n" +
                "         ****\n" +
                "         ***\n" +
                "         **" +
                "         *";
        System.out.println(enunciado);
        System.out.print("introudcir un numero: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*\t");
            }
            System.out.println();

        }

    }

    //vamos a hcer un metodo menú que pregunta que ejercicio quieres hacer y devuelve que quieres hacer 27,28,29,35
    public static int menu(){
        System.out.println("que ejercicio quieres hacer? \n27\n28\n29\n35");
        int ejercicio= sc.nextInt();
        sc.nextLine();
        return ejercicio;
    }
}

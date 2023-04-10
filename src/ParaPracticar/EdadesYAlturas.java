package ParaPracticar;

import java.util.Scanner;

public class EdadesYAlturas {
    public static void main(String[] args) {
        // Dadas las edades y alturas de 5 alumnos, mostrar
        // la edad y la estatura media, la cantidad de alumnos
        // mayores de 18 años, y la cantidad de alumnos que miden mas de 1,75.
        Scanner sc = new Scanner(System.in);
        int edad, sumaEdad=0, contadorMayor18=0, contadorMayor175=0;
        float estatura, sumaEstatura=0,mediaEdad, mediaEstatura;
        for (int i = 1; i <=5; i++) {
            System.out.print("ingrese la edad del alumno "+ i +":");
            edad= sc.nextInt();
            System.out.println("ingrese la estatura: "+ i + ":");
            estatura= sc.nextFloat();
            sumaEdad+=edad;
            sumaEstatura+=estatura;
            if (edad > 18){
                contadorMayor18++;
            }if (estatura > 1.75){
                contadorMayor175++;
            }
        }
        mediaEdad=sumaEdad/5;
        mediaEstatura=sumaEstatura/5;
        System.out.println("la suma edad promedio es: " + sumaEdad);
        System.out.println("la estatura promedio es: " + sumaEstatura);
        System.out.println("la cantidad de alumnos mayores de 18 es: " + contadorMayor18);
        System.out.println("la cantidad de alumnos mayores de 1,75 es: " + contadorMayor175);
    }
}

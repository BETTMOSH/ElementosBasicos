package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        //El director de una escuela está organizando un viaje de estudios, y requiere
        //determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía
        //de viajes por el servicio. La forma de cobrar es la siguiente:
        //a. Si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
        //b. de 50 a 99 alumnos, el costo es de 70 euros,
        //c. de 30 a 49, de 95 euros,
        //d. y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin
        //importar el número de alumnos.
        //Escribe un programa que, introduciendo el número de alumnos que van de viaje,
        //permita determinar el pago a la compañía de autobuses y lo que debe pagar
        //cada alumno.
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de alumnos: ");
        int alumnos = sc.nextInt();
        double costeAlumno = 0;
        double costeTotal=0;
        if (alumnos>=100){
            costeAlumno=65;
            costeTotal=costeAlumno*alumnos;
        } else if (alumnos>=50 && alumnos<=99) {
            costeAlumno=70;
            costeTotal=costeAlumno*alumnos;
        } else if (alumnos>=30 && alumnos<=49) {
            costeAlumno=95;
            costeTotal=costeAlumno*alumnos;
        }else{
            costeTotal=4000;
            costeAlumno=costeTotal/alumnos;
        }
        System.out.println("El coste totales: "+ costeTotal + "€");
        System.out.println("Cada alumno pagara: " + costeAlumno);


    }
}

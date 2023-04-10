package EstructurasDeControl;

import java.util.Scanner;

public class ForEjercicio36 {
    public static void main(String[] args) {
        //Vuelve a completar los ejercicios que vimos en la UT2, pero utilizando estructuras de
        //control para mejorarlos. Las mejoras que realizar son las siguientes:
        //a) Ejercicios 20, 21, 22, 27 hacerlos con for.
        //b) Ejercicio 26: en vez de 3 ventas pedir por teclado el número de ventas realizadas y el
        //importe de cada venta.

        //22. realiza un programa que pida las notas finalesde todos los modulos de
        // 10 y sume la nota final es la media de las notas de todos los modulos

        Scanner sc = new Scanner(System.in);
        //22.
        /*System.out.println("introducir las notas: ");
        double nota;
        double suma=0;
        double media;
        for (int i = 0; i < 6; i++) {
            System.out.print("nota modulo " + (i + 1) +  ":");
            nota=sc.nextDouble();
            suma = suma + nota;
        }
        media= suma/6;
        media=Math.round(media);
        System.out.println("media :" + media);*/
        //27.un alumno desea saber cual sera su calificaion final en la materia de
        // algoritmos su calificacion se compone de los siguientes :
        // a) 55% de la calificaion parcial
        // b) 30% califica final
        // c) 15% calificaion de un trabajo final
        /*System.out.print("Parcial: 1");
        double parcial1 = sc.nextDouble();
        System.out.print("Parcial 2: ");
        double parcial2 = sc.nextDouble();
        System.out.print("Parcial 3: ");
        double parcial3 = sc.nextDouble();*/
        double suma=0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Parcial: " + (i+1) + ":");
            double parcial1 = sc.nextDouble();
            suma = suma +parcial1;
        }
        double promedioParciales = suma / 3;
        System.out.print("Examen final: ");
        double exmaneFinal = sc.nextDouble();
        System.out.print("Trabajo final: ");
        double trabajoFinal = sc.nextDouble();


        //System.out.println(promedioParciales);

        double  porcentajeParciales = promedioParciales*55/100;
        System.out.println(porcentajeParciales);
        double porcentajeExamenFinal = exmaneFinal*30/100;
        System.out.println(porcentajeExamenFinal);
        double porcentajeTrabajoFinal = trabajoFinal*15/100;
        System.out.println(porcentajeTrabajoFinal);

        double calificacionFinal = porcentajeParciales+porcentajeExamenFinal+porcentajeTrabajoFinal;
        System.out.printf("la calificacion final sera %.2f " , calificacionFinal);


    }
}

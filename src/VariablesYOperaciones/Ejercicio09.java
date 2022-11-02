package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {

//Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han
//transcurrido entre dos momentos del mismo día. Para ello, el programa ha de pedir
//por teclado seis números enteros: las horas, minutos y segundos para el momento
//inicial
        Scanner sc = new Scanner(System.in);

        System.out.println("MOMENTO INICIAL");
        System.out.println("===============");
        System.out.println("Intruduce la hora: ");
        int hora1 = sc.nextInt();
        System.out.println("Introdcue los minutos: ");
        int minutos1 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundos1 = sc.nextInt();
        // Y los del final.
// De momento vamos a considerar que los
//números introducidos van a estar en el rango adecuado y que el momento inicial
//introducido es menor (o igual) que el momento final.

        System.out.println("MOMENTO FINAL");
        System.out.println("=============");
        System.out.println("Introduce la hora: ");
        int hora2 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int minutos2 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundos2 = sc.nextInt();

        System.out.printf("Datos introducidos: Momento inical = " + hora1 + ":" + minutos1+":" + segundos1 + "\t" + " Momento final: " + hora2 + ":" + minutos2 + ":" + segundos2 );
// EL TRUCO; PASAR A SEGUNDOS EL MOMENTO INICIAL Y EL MOMENTO FINAL
        // HALLAR LA DIFERENCIAENTRE AMBOS
        // DE ESA DIFERENCIA    qUE SERA EN SEGUNDOS EXTRAER HORAS

        int hora1EnSegundos = hora1 * 60 * 60 ;
        int minutos1EnSegundos = minutos1 * 60;
        int momentoInicialEnSegundos = hora1EnSegundos + minutos1EnSegundos + segundos1;

        int hora2EnSegundos = hora2 * 60 * 60;
        int minutos2EnSegundos = minutos2 * 60;
        int momentoFinalEnSegundos = hora2EnSegundos + minutos2EnSegundos + segundos2;

        int diferenciaEnSegundos = momentoFinalEnSegundos - momentoInicialEnSegundos;
        //System.out.println(diferenciaEnSegundos * 60);
        //System.out.println(diferenciaEnSegundos / 60);
        //System.out.println(diferenciaEnSegundos % 60);

        // de esa diferencia que será en segundos extraer horas, minutos y segundos
        // extraigo los segundos


        // extraigo minutos totales que tengo en esos segundos
        int segundosDiferencia = diferenciaEnSegundos % 60;
        int minutosTotalesDiferencia = diferenciaEnSegundos / 60;

        //de esos minutos extraigo las horas
        int horasDiferencia = minutosTotalesDiferencia / 60;
        int minutosDiferencia = minutosTotalesDiferencia % 60;

// Por ejemplo, si se introducen
//los números 1, 2, 30,15, 21, 1 entenderemos que el momento inicial es 1:02:30 am y
//el momento final es 15:21:1. El programa debe mostrar por pantalla la diferencia en
//el formato: hh:mm:ss.
        System.out.println(" Y la diferencia entre ambos momentos es: " + horasDiferencia + ":" + minutosDiferencia + ":" + segundosDiferencia);



    }
}

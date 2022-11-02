package VariablesYOperaciones;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //Escribe un programa que, dado un importe en euros, indique el número mínimo de
        //billetes y la cantidad sobrente que se pueden utilizar para obtener dicha cantidad.
        //Por ejemplo:
        //232 euros: 1 billete de 200, 1 billete de 20, un billete de 10, y sobren 2 euros.
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca el dinero");
        /*
        int billetes = sc.nextInt();

        int b1 = billetes / 500;  // 765=1,265=1
        int b2 = billetes % 500 / 200; // 265=1,65=1
        int b3 = billetes % 500 % 200 / 100;
        int b4 = billetes % 500 % 200 % 100 / 50;
        int b5 = billetes % 500 % 200 % 100 % 50 / 20;
        int b6 = billetes % 500 % 200 % 100 % 50 % 20 / 10;
        int b7 = billetes % 500 % 200 % 100 % 50 % 20 % 10 / 5;
        int b8 = billetes % 500 % 200 % 100 % 50 % 20 % 10 % 5;

        System.out.printf("%d billetes de 500, ", b1);
        System.out.printf("%d billetes de 200, ", b2);
        System.out.printf("%d billetes de 100, ", b3);
        System.out.printf("%d billetes de 50, ", b4);
        System.out.printf("%d billetes de 20, ", b5);
        System.out.printf("%d billetes de 10, ", b6);
        System.out.printf("%d billetes de 5 ", b7);
        System.out.printf("y sobran %d euros", b8);
        */

        int euros = sc.nextInt();
        int billetes = sc.nextInt();
        int billetes500 = euros/500;
        int auxiliar = euros % 500;
        int billetes200 = auxiliar / 200;
        int billetes100 = auxiliar /100;
        auxiliar = auxiliar %100;
        int billetes50 = auxiliar /50;
        auxiliar = auxiliar %50;
        int billetes20 = auxiliar / 20;
        auxiliar = auxiliar % 20;
        int billetes10 = auxiliar / 10;
        auxiliar = auxiliar % 10;
        int billetes5 = auxiliar / 5;
        auxiliar =  auxiliar % 5;
        int monedas2 = auxiliar / 2;
        int monedas1 = auxiliar % 2;
        System.out.println(euros + " euros " + billetes500 + " billetes de 500 " + billetes200 + " billetes de 200, " + billetes100 + " billetes de 100, " + billetes50 + " billetes de 20, " + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5," + monedas2 +" monedas de 2 y" + monedas1 + "monedas de 1 €" );



    }
}

package VariablesYOperaciones;

public class Ejercicio14 {
    public static void main(String[] args) {
/*
        14. Realiza un programa que calcule la longitud de una circunferencia de radio 3 metros.
         */
        // Fórmula es: 2 * pi * r

        double radio = 3;

        // NEW: el número pi lo podemos poner directamente como Math. PI
        double circunferencia = 2 * Math.PI * radio;
        System.out.println(circunferencia);

        // NEW PARA MOSTRAR UN NÚMERO DE MUCHOS DECIMALES CON SÓLO 2
        System.out.printf(" la circunferencia es %.2f", circunferencia);

    }
}

package VariablesYOperaciones;

public class Ejercicio03 {
    public static void main(String[] args) {
        //A partir de una variable num1 con valor inicial 12 y una variable num2 con valor
        //inicial 4, crear nuevas variables que almacenen el resultado de realizar la suma, resta,
        //multiplicación, división y resto de num1 y num2. Mostrar el valor de las nuevas
        //variables por pantalla.
        int num1 = 12;
        int num2 = 4;
        int suma = num1 + num2;
        int resta = num1-num2;
        int multiplicacion = num1*num2;
        int division = num1 / num2;
        int resto = num1 % num2;
        System.out.println(suma +" " + resta + " " + multiplicacion +" " + division + " " + resto);


    }
}

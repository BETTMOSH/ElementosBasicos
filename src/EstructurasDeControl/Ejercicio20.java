package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        //20. Escribe un programa que lea dos números enteros positivos, y pida la operación que
        //quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y
        //visualizar el resultado. En caso de que el símbolo introducido no sea correcto,
        //visualizar: operación incorrecta.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("operacion a realizar");
        char operacion = sc.next().charAt(0); // para guardar una variable tipo char
        // creamos una variable entes del bloque para guardar el resultado que hagamos en los casos
        int resultado =0;
        // miro el valor de la variable operacion en funcion de eso hago una operacion u otra.
        switch (operacion){
            case '+':
                resultado = n1+n2;
                break;
            case '-':
                resultado = n1-n2;
                break;
            case '*':
                resultado = n1*n2;
                break;
            case '/':
                resultado = n1/n2;
                break;
            default:
                System.out.println("resultado: " + resultado);
        }

    }
}

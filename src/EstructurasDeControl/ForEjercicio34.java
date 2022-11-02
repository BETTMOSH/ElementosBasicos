package EstructurasDeControl;

import java.util.Scanner;

public class ForEjercicio34 {
    public static void main(String[] args) {
        //Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
        //números a introducir). El programa debe informar de cuantos números introducidos
        //son mayores que 0, menores que 0 e iguales a 0.
        Scanner sc=new Scanner(System.in);
        System.out.println("numero a introducir: ");
        int numerosAIntroducir=sc.nextInt();
        int contadorPositivo=0;  // la variable contador sirve para que vaya contando los numeros a introducir
        int contadorNegativo=0;  // la variable contador sirve para que vaya contando los numeros a introducir
        int contadorDeCeros=0;  // la variable contador sirve para que vaya contando los numeros a introducir

        //*pedimos numeros
        for (int i = 0; i < numerosAIntroducir ; i++) {
            System.out.print("introducir los numero: ");
            int n = sc.nextInt();
            if (n > 0){
                contadorPositivo++;
                System.out.println("contador positivo " + contadorPositivo);
            }else if (n<0){
                contadorNegativo--;
                System.out.println("contador negativo " + contadorNegativo);
            }else {
                contadorDeCeros++;
                System.out.println("total de negativos" + contadorDeCeros);
            }

            }
        System.out.println("Total de positivos: " + contadorPositivo);
        System.out.println("Total de negaticos: " + contadorNegativo);
        System.out.println("Total de ceros: " + contadorDeCeros);

    }
}

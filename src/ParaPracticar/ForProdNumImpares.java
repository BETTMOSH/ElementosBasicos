package ParaPracticar;

import java.util.Scanner;

public class ForProdNumImpares {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Diseñar un programa que muestre el producto de los 10
        // primeros numeros impares
        int producto=1;
        for (int i = 1; i <=20; i+=2) {
            producto*=i;
                System.out.println("el producto es: "+ producto);

        }
    }

}

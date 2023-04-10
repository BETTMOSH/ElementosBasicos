package Arrays;

import java.util.Arrays;

public class EjemploApiJava {
    public static void main(String[] args) {
        byte[] nums = { 0, 1, 2, 4, 8, 16, 32, 64 };
        String cadena = Arrays.toString(nums); // [0, 1, 2, 4, 8, 16, 32, 64]
        System.out.println(cadena);

        // Arrays.sort[] nombre
        int[] enteros = {5, -23, 22, 182, 31456, - 4};

        // para ordenarlos
        Arrays.sort(enteros);

        // lo imprimimos
        System.out.println(Arrays.toString(enteros));

        int[] num1 = {1,2,3,4};
        int[] num2 = {1,2,3};
        int[] num3 = {1,2,5,6};
        System.out.println(Arrays.equals(num1,num2));
        System.out.println(Arrays.equals(num1,num3));
    }
}

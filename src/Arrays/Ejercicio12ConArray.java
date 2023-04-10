package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio12ConArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numA = (int) (Math.random() * 10 +1);
            A.add(numA);
            int numB = (int) (Math.random() * 10 +1);
            B.add(numB);
        }
        System.out.println(A);
        System.out.println(B);
        for (int i = 0; i < 10; i++) {
            C.add(A.get(i)); // con get cogemos todo lo que hay en la posición A.
            C.add(B.get(i));
        }
        System.out.println(C);
    }
}

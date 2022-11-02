package VariablesYOperaciones;

public class EjemploIncrementoDecremento {
    public static void main(String[] args) {
        // De momento no le vamos a ver ultilidad
        //Pero es super util cuando evamos bucles: for while do while

        int n= 10;
        System.out.println("1. " + n);
        // quiero aumentar una unidad
        n = n +1;
        System.out.println("2. " +n);
        //
        n++; // incrementa el valor de n en 1  -  es lo mismo que  n = n + 1
        System.out.println("3. " + n);
        //otra forma de escribir eso mismo es
        n+= 1; // en esta nomenclatura vale tambien para el producto (n *= 1) etc....
        System.out.println("4. " + n);
        ++n; // otra forma de escribir mismo pero no es exactamente igual.

        n = n - 1;
        n--;
        n -= 1;
        --n;
        System.out.println("Decremento tras decremento " + n);

        // diferencia ntre prefijos
        int a = 4;
        int b = a++;
        System.out.println(b);





    }
}

package VariablesYOperaciones;

public class EjemploCasting {
    public static void main(String[] args) {
        int num = 100; // ocupa memoria de 32bits
        long numGrande = num;// puedo asignar un int a long sin mas

        // y a reves?
        long numGrande2 = 101; // ocupa 64 bits
        int entero = (int) numGrande2; // casting explicito dandole al foco rojo

        // de int a short
        short numeroCorto = (short) num; //no se puede por que int son 32bits y short son 16 bits

        // de char a int
        char letra = 'a'; // char es solo para declarar varia les tipo "caracteres"
        int letraAscii = letra;
        System.out.println(letraAscii);

        // de float a souble
        float decimal = 3.1416f;
        double  decimalDoble = decimal;

        double decimalDoble2 = 300000000000.1234567;
        float decimalF = (float) decimalDoble2;

        // de double a long
        int entero32bits = (int) decimalDoble2;
        System.out.println(entero32bits); // resultado impredesible

        // de double a short
        short entero16bits = (short) decimalDoble2;
        System.out.println(entero16bits);


    }
}

package Metodos;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        System.out.println("segundo: ");
        imprimir("hola",5);
        System.out.println("cuarto: ");
        imprimir(5);
        System.out.println("primero: ");
        imprimir("hola");
        System.out.println("tercero: ");
        imprimir(3, "lo que sea");
    }
    public static void imprimir(String s){
        System.out.println(s);
    }
    public static void imprimir(String s,int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(s);
        }
    }
    public static void imprimir(int veces,String s) {
        for (int i = 0; i < veces; i++) {
            System.out.println(s);
        }
    }
    public static void imprimir(int val){
        System.out.println(val);
    }
}

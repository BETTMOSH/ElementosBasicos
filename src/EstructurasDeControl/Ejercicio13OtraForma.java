package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio13OtraForma {
    public static void main(String[] args) {
        //La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
        //la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la
        //venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto
        //recibirá un productor por la uva que entrega en un embarque, considerando lo
        //siguiente:
        //a. Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño
        //1; y 30 céntimos si es de tamaño 2.
        //b. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
        //cuando es de tamaño 2.
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce Precio Inicial: ");
        double precioIni = sc.nextDouble();
        System.out.println("Introduce el tipo A o B: ");
        char tipo =sc.next().charAt(0);
        double precio=0;
        System.out.println("Tamaño 1 o 2: ");
        int tamaño = sc.nextInt();
        System.out.println("Klos a vender: ");
        int kilos= sc.nextInt();

        if (tipo == 'A'){
            if (tamaño==1){
                precio=precioIni+0.2;
            }else{
                if (tamaño==1){
                    precio=precioIni+0.3;
                }else{
                    precio=precioIni+0.5;
                }
            }
            double precioTotal;
            System.out.println();
        }
    }
}

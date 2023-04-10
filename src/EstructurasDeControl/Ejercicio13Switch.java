package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio13Switch {
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
        System.out.print("Introduce Precio Inicial: ");
        double precioIni = sc.nextDouble();
        System.out.print("Introduce el tipo A o B: ");
        char tipo =sc.next().charAt(0);
        double precio=0;
        System.out.print("Tamaño 1 o 2: ");
        int tamaño = sc.nextInt();
        System.out.print("Klos a vender: ");
        int kilos= sc.nextInt();
        switch (tipo) {
            case 'A':
                switch (tamaño) {
                    case 1:
                        precio = precioIni + 0.2;
                        break;
                    case 2:
                        precio = precioIni + 0.3;
                        break;
                    default:
                        System.out.println("datos incorrectos");
                }
                break;
            case 'B':
                switch (tamaño) {
                    case 1:
                        precio = precioIni - 0.3;
                        break;
                    case 2:
                        precio = precioIni - 0.5;
                        break;
                    default:
                        System.out.println("datos incorrectos");
                }
                break;
            default:
                System.out.println("datos incorrectos");
        }
        double precioTotal= precio*kilos;
        System.out.println("A pagar: " + precioTotal + "€");

    }
}

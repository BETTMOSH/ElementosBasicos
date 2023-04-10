package ParaPracticar;

import java.util.Scanner;

public class FacturasLitroPrecio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Una empresa se dedica a la venta de desinfectantes necesita
        // un programa para gestionar las facturas, en cada
        // factura figura el codigo del articulo, la cantidad
        // vendida en litros y el precio por litro. Se pide de 5 facturas
        //introducidas la Facturacion total, cantidad en litros vendidos del aticulo
        // 1 y cuantas facturas se emitieron de mas de 600€
        int codigo,litros,facturas,litrosArticulo1=0,conteoMas600=0;
        float cantidadLitros, precioPorLitro,facturacionTotal=0, importeFactura;
        for (int i = 1; i <=5; i++) {
            System.out.print("articulo numero "+ i + "\ndigite el codigo: ");
            codigo= sc.nextInt();
            System.out.print("digite la cantidad en litros: ");
            litros= sc.nextInt();
            System.out.print("digite el precio por litro: ");
            precioPorLitro= sc.nextFloat();
            importeFactura= litros*precioPorLitro;
            facturacionTotal+=importeFactura; // suma iterativa de las facturas

            if (codigo==1){
                litrosArticulo1+=litros;
            }
            if (importeFactura>600){
                conteoMas600++;
            }
        }
        System.out.println("Resumen de ventas");
        System.out.println("facturacion total: " + facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo 1: " + litrosArticulo1);
        System.out.println("Cantidad en facturas mayores a 600: " + conteoMas600);
    }
}

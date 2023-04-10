package Poo.cajero;

public class Main {

    public static void main(String[] args) {
        CuentaCorriente cCorriente1 = new CuentaCorriente("445567876x","tio pato");
        // tratamos de sacar dinero
        cCorriente1.sacarDinero(100);
        cCorriente1.ingresarDinero(50000);
        cCorriente1.mostrarInformación();


        CuentaCorriente cCorriente2 = new CuentaCorriente("5555555P", 30000);
        cCorriente2.mostrarInformación();

        CuentaCorriente cuentaCorriente3 = new CuentaCorriente("44444444M", "pato donald",400000);
        cuentaCorriente3.mostrarInformación();
        System.out.println(cCorriente1.DNI); // ok por que dni esta en el mismo paquete
        System.out.println(cCorriente1.nombreTitular); // ok por que dni esta en el mismo paquete
        //System.out.println(cCorriente1.saldo); // Si no sale una opcion que queremos tenemos que hacer getter and setersdesde otra clase
    }
}

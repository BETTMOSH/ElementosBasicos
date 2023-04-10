package ForAnidados;

import java.util.Scanner;

public class EjercicioExamen {
    public static void main(String[] args) {
        //Realizar un programa que asigne una entrada en una sala de cine. El programa debe cumplir los siguientes requisitos:
        //Pedir un día y un mes, y comprobar que es correcto. Consideramos que febrero tiene siempre 28 días.
        Scanner sc = new Scanner(System.in);
        int dia=0;
        int mes = 1;
        // vamos a crear con los dias de  cada mes
        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        boolean fechaCorrecta = false;

        do {
            System.out.println("dia");
            int dias = sc.nextInt(); sc.nextLine();
            System.out.println("mes");
            int mes1 = sc.nextInt(); sc.nextLine();
            if (mes1 >= 1 && mes1 <= 12 && dias >= 1 && dias <= diasMes[mes1-1]){
                System.out.println("fecha correcta !!!");
                // System.out.println(diasMes[mes-1]); también se puede pintar asi
                // cambiamos la fecha correcta para salir del bucle
                fechaCorrecta= true;
            }else {
                System.out.println("fecha incorrecta !!!, vuelva a introducir fecha ");
                fechaCorrecta=false;
            }
            String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
            System.out.println("Asientos disponibles para el dia " + dias + " de " + meses[mes1-1]);
        }while (!fechaCorrecta);

        System.out.println("==========================================================");
        char[][] asientos = new char[4][4];
        // ponemos todos los asientos libres
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = 'L';
            }
        }

        // ponemos algunos acupados
        asientos[0][1] = 'X';
        asientos[1][1] = 'X';
        asientos[1][2] = 'X';
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + "\t");
            }
            System.out.println();

        }
        int fila = 0;
        do {
            System.out.print("elige una fila entre el 0-4: ");
            fila = sc.nextInt();
            if (fila < 0 || fila >3){
                System.out.println("fuera de rango");
            }
        }while (fila<=0 || fila>3);

        int asiento = 0;
        do {
            System.out.print("elige una columna entre el 0-4: ");
            asiento = sc.nextInt();
            if (asiento < 0 || asiento >3){
                System.out.println("fuera de rango");
            }
        }while (asiento<=0 || asiento>3);

        if (asientos[fila][asiento] == 'L'){
            asientos[fila][asiento] = 'A';
            System.out.println("Se te ha a signado el asiento solicitado.");
            for (int i = 0; i < asientos.length; i++) {
                for (int j = 0; j < asientos[i].length; j++) {
                    System.out.print(asientos[i][j] + "\t");
                }
                System.out.println();
            }
        }else {
            System.out.println("Asiento ocupado. Tendrás que buscar otro.");
        }
    }
}

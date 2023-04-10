package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta.
        Scanner sc = new Scanner(System.in);
        System.out.print("introduzca el dia: ");
        int dia = sc.nextInt();
        System.out.print("introduzca el mes: ");
        int mes = sc.nextInt();
        System.out.print("Indique el año: ");
        int año = sc.nextInt();
        if (año !=0){
            if (mes>=1 && mes <=12){
                if (mes >= 1 || mes ==3 || mes ==5|| mes ==7 || mes ==8 || mes ==10 || mes ==12) {
                    if (dia >= 1 && dia <= 31) {
                        System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + año);
                    } else {
                        System.out.println("fecha incorrecta.");
                    }
                }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia >= 1 && dia <= 30) {
                        System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);
                    } else {
                        System.out.println("fecha incorrecta");
                    }
                }else if (mes == 2){
                        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
                            if (dia >= 1 && dia <= 29) {
                                System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);
                            } else {
                                System.out.println("Fecha incorrecta");
                            }
                            }else {
                                if (dia >= 1 && dia <= 28) {
                                    System.out.println("Fecha correcta: "+ dia + "/" +mes+ "/" +año);
                                }else {
                                    System.out.println("fecha incorrecta.");
                                }
                            }
                        }
                    }else{
                    System.out.println("mes incorrecto");
                }
            }else {
            System.out.println("año incorrecto.");
        }
    }
}


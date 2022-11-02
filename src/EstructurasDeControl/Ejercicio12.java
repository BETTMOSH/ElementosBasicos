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
        System.out.printf("Indique el año: ");
        double año = sc.nextDouble();

        /*if(dia >= 1 && dia <=30 || dia <= 31){
        System.out.println("el dia es correcto");
        }else{
        System.out.println("dia no es valido");
        }if (mes >=1 && mes <=12){
            System.out.println("el mes es correcto");
        }else if (mes ==2 && == 4 && == 6,){
            System.out.println("mes no es valido");
        }if (año >=1000 && año <=3000){
            System.out.println("el año es correcto");
        }else {
            System.out.println("el año no es valido");
        }*/
        if (año !=0){
            if (mes>=1 && mes <=12){
                if (mes == 1 || mes ==3 || mes ==5 || mes ==7 || mes ==8 || mes ==10 || mes ==12){
                    if (dia >= 1 && dia <=31){
                        System.out.println("La fecha es correcta: "+dia+ "/" +mes+ "/" +año);
                    }
                } else if (mes==4 || mes==6 || mes==9 || mes==11 ) {
                    if (dia>=1 && dia<=30){
                        System.out.println("Fecha correcta: "+ dia+ "/" + mes+ "/" +año);
                    }else{
                        System.out.println("fecha incorrecta");
                    } if (mes==2){
                        if (año%4==0 && año%100 !=0 || año%400==0){
                            if (dia>=1 && dia<=28){
                                System.out.println("Fecha correcta: "+ dia + "/" +mes+ "/" +año);
                            }else{
                                System.out.println("Fecha incorrecta");
                            }
                        }
                    }


                }
            }
        }

        }

    }


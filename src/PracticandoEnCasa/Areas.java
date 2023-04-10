package PracticandoEnCasa;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        /*Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de
        multiplicar, hasta llegar a él. (Nota: para que los números queden alineados en columnas
        puedes usar el tabulador \t). Ejemplo:*/
        /*System.out.println("introducir el numero: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.print("tabla del " + i + ": ");
            for (int j = 1; j <=10 ; j++) {
                System.out.print("\t" + i*j);
            }
            System.out.println("");*/


        /* int numero;
        System.out.print("digite el numero: ");
        numero = sc.nextInt();
        System.out.println(numero%2==0 ? "es par" : "es impar");*/
       /* System.out.print("ingrese el primero: ");
        int n1 = sc.nextInt();
        System.out.print("ingrese el segundo: ");
        int n2 = sc.nextInt();
        if (n1>n2){
            System.out.println("el " + n1 + " es mayor que el: " + n2);
        } else if (n2>n1) {
            System.out.println("el " + n2 + " es mayor que el: " + n1);
        }else {
            System.out.println("los numeros son iguales");
        }*/
        //hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula
        /*System.out.print("digite un caracter: ");
        char caracter = sc.nextLine().charAt(0);
        if (caracter>='A' && caracter <='Z'){
            System.out.print("el caracter es mayucula: ");
        } else {
            System.out.print("el caracter no es mayuscula ");

        }*/
        //En una tienda se hace un 20% de descuento a los clientes cuya
        // compra supere los 300€ ¿cual sera la cantidad que  pagara
        // una persona por su compra?

        /*System.out.println("total de su compra: ");
        double compra=sc.nextDouble();
        double descuento;
        if (compra>=300){
            descuento=compra*0.2;
            compra -= descuento;
            System.out.println("el total es: " + compra + " con el descuento aplicado");
        }else{
            System.out.println("el total es: " + compra );
        }*/
        //un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
        // si trabaja 40 horas o menos se le paga 16 € por hora.
        // Si trabaja más de 40 horas se le paga 16 € por cada una de las primeras 40 horas y 20 por cada hora extra.
        /*System.out.println("Ingrese el total de horas: ");
        double horas=sc.nextDouble();
        double salarioMensual;

        if (horas<=40){
            salarioMensual=horas*16;
            System.out.println(salarioMensual);
        } else {
            salarioMensual = (40 * 16) + (horas - 40) * 20;

            System.out.println(salarioMensual);
        }*/
        // hacer un programa que tome dos numeros y diga si
        // son pares o impares.
        /*System.out.println("ingrese el primer digito: ");
        int n1, n2;
        n1= sc.nextInt();
        System.out.println("ingrese el segundo digito");
        n2= sc.nextInt();
        if ((n1%2==0) && (n2%2==0)){
            System.out.println(" son pares");
        } else if ((n1%2!=0) && (n2%2!=0)) {
            System.out.println(" son impares");
        }else{
            System.out.println("un numero es par y el otro es impar" );
        }
*/
        //Pedir tres numeros y mostrarlos ordenados de mayor a menor.
    /*int num1, num2, num3;
        System.out.print("digite el primer numero: ");
        num1=sc.nextInt();
        System.out.print("digite el segundo numero: ");
        num2= sc.nextInt();
        System.out.print("digite el tercer numero");
        num3= sc.nextInt();
        if (num1>num2 && num2>num3){
            System.out.println("el orden es: " + num1 + "-" + num2 + "-" + num3);
        } else if (num1>num3 && num3>num2) {
            System.out.println("el orden es: " + num1 + "-" + num3 + "-" + num2);
        } else if (num2>num1 && num1>num3) {
            System.out.println("el orden es: " + num2 + "-" + num1 + "-" +num3);
        }else if (num2>num3 && num3>num1){
            System.out.println("el orden es: " + num2 + "-" + num3 + "-" + num1);
        } else if (num3>num1 && num1>num2) {
            System.out.println("el ordenes: " + num3 + "-" + num1 + "-" + num2);
        }else if (num3>num2 && num2>num1) {
            System.out.println("el ordenes: " + num3 + "-" + num2 + "-" + num1);
        }*/
        // pedir un numero entre 0 y 99.999 y decir cuantas cifras tiene
        /* System.out.println("ingrese un digito: ");
        int numero = sc.nextInt();
        if (numero<10){
            System.out.println("el numero"  + numero + " tiene una  sifras");
        } else if (numero<100) {
            System.out.println("el numero " + numero + " tiene dos sifras");
        }else if (numero<1000) {
            System.out.println("el numero " + numero + " tiene tres sifras");
        }else if (numero<10000) {
            System.out.println("el numero " + numero + " tiene cuatro sifras");
        }else if (numero<100000) {
            System.out.println("el numero " + numero + " tiene cinco sifras");
        }*/
//IF ELSE-IF
        //pedir el dia, mes y año de una fecha e indicar si la fecha es correcta.
        // Suponiendo qu etodos los meses son de 30 dias.
        /*System.out.println("digite el dia: ");
        int dia = sc.nextInt();
        System.out.println("digite el mes: ");
        int mes = sc.nextInt();
        System.out.println("digite el año: ");
        int año= sc.nextInt();
        if ((mes==2) && (dia>=1 && dia<=28)){
            System.out.println("correcto");
        }else if ((mes==4 || mes==6 || mes==9 || mes ==11) && (dia>=1 && dia<=30)){
            System.out.println("correcto");
        } else if ((mes ==1 || mes==3 || mes==5 || mes ==7 || mes==8 || mes==10 ||mes == 12) && (dia>=1 && dia <=31)) {
            System.out.println("correcto");
        }else {
            System.out.println("incorrecto");
        }*/
//SWITCH
        // construir un programa que simule el funcionamiento de una
        // calculadora que puede realizar las 4 operaciones (suma.rest.
        // multi. y division) con numeros enteros. El usuario debe especificar
        // la operacion con el primer caracter del primer paramertro de
        // la linea de comandos S o s para la suma, R o r para la resta, p, p
        //o M, m para el producto y D o d para la division.

        /*int n1,n2,suma,resta,multiplicacion,division;
        char oper;
        System.out.print("digite un numero: ");
        n1= sc.nextInt();
        System.out.print("digite otro numero: ");
        n2= sc.nextInt();
        System.out.print("digite la operacion: ");
        oper=sc.next().charAt(0);
        switch (oper){
            case'S':
            case's': suma=n1+n2;
                System.out.println("la suma es " + suma);
                break;
            case 'R':
            case 'r': resta = n1-n2;
                System.out.println("la resta es : " + resta);
                break;
            case 'P':
            case 'p':
            case 'M':
            case 'm': multiplicacion=n1*n2;
                System.out.println("la multiplicacion es : " + multiplicacion);
                break;
            case 'D':
            case 'd': division=n1/n2;
                System.out.println("la division es : " + division);
                break;
            default:
                System.out.println("error se equivoco.");
        }
*/
//SWITCH
        //pedir una nota de 0 a 10 y mostrarla de forma:
        // Insuficiente, Suficiente, Bien, Notable, Sobresaliente.

        /*System.out.println("ingrese la nota: ");
        int nota=sc.nextInt();
        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("insuficiente"); break;
            case 5:
                System.out.println("suficiente"); break;
            case 6:
                System.out.println("bien"); break;
            case 7:
            case 8:
                System.out.println("notable"); break;
            case 9:
            case 10:
                System.out.println("Sobresaliente"); break;
            default:
                System.out.println("error"); break;
        }*/
//SWITCH
        //hacer un programa que simule un cajero automatico con un
        // saldo inicial de 1000 € con el siguiente menu de opciones.
        // Ingresar dinero a la cuenta
        // retirar dinero de la cuenta
        // salir

        /*final int saldoIni=1000;
        int opcion;
        double ingreso,saldoActual,retirar;
        System.out.print("Bienvenido su cajero automatico: "+"\n1. ingresar\n2. retirar\n3. salir\ndijite la opcion:");
        opcion= sc.nextInt();
        switch (opcion){
            case 1:
                opcion= Integer.parseInt(JOptionPane.showInputDialog("cantidad a ingresar: "));

                saldoActual=saldoIni+opcion;
                System.out.println("dinero en cuenta: " + saldoActual);
                break;
            case 2:
                System.out.println("dijite la cantidad a retirar: ");
                retirar= sc.nextDouble();
                if (retirar > saldoIni){
                System.out.println("no cuenta con saldo suficiente");
            }else {
                    saldoActual = saldoIni-retirar;
                    System.out.println("saldo e cuenta: " + saldoActual);
                }
                break;
            case 3:
            default:
                System.out.println("hasta pronto!!!");*/


        //SWITCH
        //hace un programa que pase de kg a otra unidad de medida de masa
        // mostrar en pantalla un menu con las opciones posibles

//SWITCH
        /*float medida;
        int opcion;
        System.out.print("dijite la cantidad: ");
        medida=sc.nextFloat();
            System.out.print("n1. hectogramo"
            + "\n2. decagramos"
            + "\n3. gramos"
            + "\n4. decigramos"
            + "\n5. centigramos"
            +"\n6. miligramos"
            + "\n. menu:");
        opcion= sc.nextInt();
            switch (opcion){
                case 1:
                    medida *= 10;
                    System.out.println("la medida en hectogramos es: " + medida);
                    break;
                case 2:
                    medida += 100;
                    System.out.println("la medida en decagramos es: " + medida);
                    break;
                case 3:
                    medida *=1000;
                    System.out.println("la medida en gramos es: " + medida);
                    break;
                case 4:
                    medida *= 10000;
                    System.out.println("la medida en decigramos es: " + medida);
                    break;
                case 5:
                    medida *= 100000;
                    System.out.println("la medida en centigramos es: " + medida);
                    break;
                case 6:
                    medida *= 1000000;
                    System.out.println("la medida en miligramos es: " + medida);
                    break;
                default:
                    System.out.printf("error se ha equivocado de opcion");
            }*/

 //FOR WHILE DO WHILE BUCLES

            // pedir numeros hasta que se introduzca uno
        // negativo y calcule la media.
        /*int numero;
        int contador=0;
        int suma = 0;
        float media;
        System.out.println("introduzca un numero: ");
        numero=sc.nextInt();
        while (numero>=0){
        suma+=numero;
        contador++;
        numero= sc.nextInt();
        }
        if (contador == 0){
            System.out.println("error");
        }
        else {
            media=(float)suma/contador;
            System.out.println("la media es " + media);
        }*/

//WHILE
             // pedir un numero N y mostrar todos los numero del 1 a la N.
        /*int numero;
        int i=1;
        System.out.println("introducir numero: ");
        numero= sc.nextInt();
        while (i<=numero){
            System.out.println(i);
            i++;
        }*/
 //FOR       // ESCRIBIR TODOS NUMEROS DEL 100 AL 0 DE 7 EN 7.

        /*for (int i = 100; i >=0 ; i-=7) {
            System.out.println(i);

        }*/
        //PEDIR 10 NUMERO Y ESCRIBIR LA SUMA TOTAL.
        /*int suma=0;
        int numero=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Introduzca números");
            numero=sc.nextInt();
            suma+=numero;
        }
        System.out.println(suma);*/

        /*int i = 0;
        while (1 < 10){
            i++;
            if (i % 2 == 0){
                System.out.println(i + " ");
            }
        }*/
        /*int x,y, resultado;
        char operador;
        System.out.print("ingresar un digito: ");
        x= sc.nextInt();
        System.out.print("ingresar el segundo digito: ");
        y= sc.nextInt();
        System.out.println("ingrese un operador(+,-,*,/): ");
        operador=sc.next().charAt(0);
        switch (operador){
            case '+':
                resultado=x+y;
                System.out.println("la suma de ambos es: " + resultado);
                break;
            case '-':
                resultado=x-y;
                System.out.println("la resta de ambos es: " + resultado);
                break;
            case '*':
                resultado=x*y;
                System.out.println("el producto de ambos es: " + resultado);
                    break;
            case '/':
                if (y!=0){
                    resultado=x/y;
                    System.out.println("la division entre ambos es: " + resultado);
                }else {
                    System.out.println("no se puede dividir.");
                    break;
                }
                default:
                    System.out.println("resultado no valido");
        }*/
        // asignacion po hijo de un trabajador familiar
        // si no tiene  hijo no le corresponde asignacion,si tiene un hijo le toca 50€,
        // si tiene dos hijos le toca 75€, y si tiene mas de dos hijos le corresponde 100€
        //ingresar el numero de hijo y reportar la asignacion que le corresponda
        /*int hijos;
        int asignacion=0;
        System.out.println("ingrese el numero de hijos si corresponde: ");
        hijos= sc.nextInt();
        switch (hijos){
            case 0:
                System.out.println("no le corresponde asignacion");
                break;
            case 1:
                asignacion=50;
                System.out.println("le corresponde: " +asignacion+ " por un hijo.");
                break;
            case 2:
                asignacion=75;
                System.out.println("le corresponde: " +asignacion+ " por dos hijo.");
                break;
            case 3: case 4: case 5: case 6: case 7: case 8:
                    asignacion=100;
                    System.out.println("le corresponde: " +asignacion+ " por mas de dos hijo.");
        }*/
        //Elaborar un programa que realice la opción seleccionada de acuerdo a lo siguiente:
        //a.- Área del triángulo (Solicitar base y altura)
        //b.- Área del Cuadrado (Solicitar lado)
        //c.- Área del Círculo (Solicitar radio)
        //d.- Área del Rectángulo (Solicitar base y altura)
        char opcion;
        double base, altura, lado, radio, operacion;
        System.out.println("selecciona una opcion: \n a.- triangulo \n b.- cuadrado \n c.- circulo \n d.- rectangulo ");
        opcion= sc.next().charAt(0);
        switch (opcion){
            case 'a': case 'A':
                System.out.println("Area del triangulo");
                System.out.print("ingrese la base: ");
                base= sc.nextDouble();
                System.out.print("ingrese la altura:");
                altura=sc.nextDouble();
                operacion= (base*altura)/2;
                System.out.println("el area del triangulo es: " + operacion);
                break;
            case 'b': case 'B':
                System.out.println("area del cuadrado: ");
                System.out.println("ingrese el lado de cuadrado: ");
                lado= sc.nextDouble();
                operacion=Math.pow(lado,2);
                System.out.print("el lado del cuadrado es: "+ operacion);
                break;
            case 'c': case 'C':
                System.out.println("area del circulo: ");
                System.out.print("ingrese el radio del circulo: ");
                radio= sc.nextDouble();
                operacion= Math.PI*Math.pow(radio,2);
                System.out.println("el radio de la circunferencia es: " + operacion);
                break;
            case 'd': case 'D':


        }

    }
}





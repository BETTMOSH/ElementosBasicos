package String;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        String cadena1 = pideCadena();
        String cadena2 = pideCadena();
        if (contieneSubadena(cadena1, cadena2)){
            System.out.println("Si");
        }else {
            System.out.println("No");
        }
    }
    public static String pideCadena(){
        Scanner sc = new Scanner(System.in);
        String cadena1 = sc.nextLine();
        String cadena2 = sc.nextLine();
        return cadena1;
    }
    public static boolean contieneSubadena(String cadena1,String cadena2){
        if (cadena1.contains(cadena2)) {
            return true;
        }
        return false;
    }
}

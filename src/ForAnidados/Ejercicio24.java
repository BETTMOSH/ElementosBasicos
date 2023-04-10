package ForAnidados;

public class Ejercicio24 {
    public static void main(String[] args) {
        int[][] marco = new int[5][15];
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 14){ // en la fila 0 y 4 y en la columna 0 -14 meto un 1
                    marco[i][j] = 0;
                }else if ( i == 1 || i == 3 || j == 1 || j == 13){
                    marco[i][j] = 1;
                } else if (i == 2 || j == 2) {
                    marco[i][j] = 2;
                }
            }
        }


        for (int i = 0; i < 5; i++) {  // tambien puede ser de < tabla.lenght
            for (int j = 0; j < 15; j++) { // tambien puede ser < tabal[i].lenght
                System.out.print(marco[i][j]+ "\t");

            }
            System.out.println();
        }
    }
}

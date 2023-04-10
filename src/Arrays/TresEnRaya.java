package Arrays;

import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
    }
}
        /*Scanner sc = new Scanner(System.in);

        char[][] tablero = new char[3][3];
        char jugadorActual = 'X';
        boolean juegoTerminado= false;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
        while (!juegoTerminado){
            mostrarTablero(tablero);
            System.out.print("jugador " + jugadorActual + ", ingrese la fila (0-2): ");
            int fila = sc.nextInt();
            System.out.print("jugador " + jugadorActual + ", ingrese la columna (0-2): ");
            int columna = sc.nextInt();
            if (tablero[fila][columna]=='-'){
                (tablero[fila][columna] == jugadorActual;
            }else {
                System.out.println("esa casilla ya esta ocupada.Intentalo de nuevo.");
                continue;
            }
            if (hayGanador(tablero, jugadorActual)){
                mostrarTablero(tablero);
                System.out.println("Jugador " + jugadorActual + " ha ganado!!");
                juegoTerminado = true;
            } else if (hayEmpate(tablero)) {
                mostrarTablero(tablero);
                System.out.println("Empate!");
                juegoTerminado = true;
            }else {
                jugadorActual = (jugadorActual == 'X') ? '0' : 'X';
            }
        }

    } */
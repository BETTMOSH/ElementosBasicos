package Poo.ejercicios.ejercicio16Banco;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("ES2114659450230459",223,"isss");
        Usuario usuario1 = new Usuario("popeye", "Perico","de los Palotes", new String[]{"ES2114659450230459"},"2673891D");
        //acabamos de construir el metodo mostrar cuenta y utilizarlo
mostrarCuenta(cuenta1);
    }
    public static void mostrarCuenta(Cuenta cuenta){
        // aprvechamos que tenemos un metodo de instancia en la clase cuenta
        //que imprime los valores de los atributos.

    }
}

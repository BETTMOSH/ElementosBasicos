package Poo.banco;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("ES2114659450230459",100000, true, new String[]{"222222222X", "4343434343W"});
        cuenta1.imprimirCuenta();
        // queremos cambiar algunos atributos

        //para poder leerlo desde el main necesitamos invocar al metodo public getsaldo
        System.out.println(cuenta1.getSaldo());
        //queremos ver el saldo de esta cuentapor ejemplo el saldo a 5000000
        cuenta1.setSaldo(5000000);
        cuenta1.imprimirCuenta();

    }

}

package Poo.hospital;

public class main {
    public static void main(String[] args) {
        // creamos un paciente llamando al constructor sin parámetros
        Paciente paciente1 = new Paciente();
        // imprimimos los datos del paciente

        // para imprimir todos los atributos
        // podemos dar los valores a mano
        paciente1.setNombre("paciente1, Danut");
        paciente1.setApellidos("Preutesei");
        paciente1.setFechaNacimiento ("08/02/2001");
        paciente1.setNumeroHistorial (1);
        //paciente1.alergias = false;
        paciente1.setAlergias(false);
        String[] sintomasV = {"Cefalea"};
        //paciente1.sintomas = sintomasV;
        paciente1.getSintomas();
        System.out.println(paciente1);

        // ahora creamos otro paciene llamando al construxgr parametrizado
        Paciente paciente2 = new Paciente("Daniel", "Marin Corpa", "14/03/1976", 2, true, "pelode animales; Olivo; Graminias, Aspirina", null);
        System.out.println(paciente2);

        Paciente paciente3 = new Paciente("Victor","Alarcon Lezaum","10/05/1991",1,false,null,null);
        System.out.println(paciente3);
    }
}

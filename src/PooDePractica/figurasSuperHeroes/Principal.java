package PooDePractica.figurasSuperHeroes;

public class Principal {
    public static void main(String[] args) {
        SuperHéroe sup1 = new SuperHéroe("Spiderman");
        sup1.setNombre("Hombre Araña");

        sup1.setDescripción("Lanza tela araña y viste de rojo");
        SuperHéroe sup2 = new SuperHéroe("Superman");
        sup2.setCapa(true);

        Dimensión d1 = new Dimensión();

        Figura f1 = new Figura("1", 100, sup1, d1);
        Figura f2 = new Figura("2", 10, sup2, d1);

        Colección c = new Colección("Pepe");
        c.añadirFigura(f2);
        c.añadirFigura(f1);



       // c.subirPrecio(150, "2");
       // double masvaliosi = c.masValioso();
        //System.out.println(masvaliosi);
        //System.out.println(c.masValioso() + " " + f1.getSuperheroe().getNombre());
        System.out.println(c.conCapa());


        //System.out.println(c);

    }
}

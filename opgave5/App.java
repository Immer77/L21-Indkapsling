package opgave5;

import opgave4.Ellipse;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ElArtikler elArtikler = new ElArtikler(200,"Prut","Kan skide",200);
        Fødevare fødevare = new Fødevare(213, "DSA","Mælk",4);
        Spiritus spiritus = new Spiritus(2131,"Vodka", "Gør dig fuld", 38);
        ArrayList<Vare> varer = new ArrayList<>();
        varer.add(elArtikler);
        varer.add(fødevare);
        varer.add(spiritus);
        Indkøbsvogn indkøbsvogn = new Indkøbsvogn();



        System.out.println(indkøbsvogn.beregnSamletPris(varer));


    }
}

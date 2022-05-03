package opgave3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Værkfører værkfører = new Værkfører("Sønderhøj 30","Bent",2019,120,200);
        Mekaniker mekaniker = new Mekaniker("Kaj", "Peter",2019,120);
        Synsmand synsmand = new Synsmand("Sønderhøj 31", "Katja",2019,120,15);
        ArbejdsDreng arbejdsDreng = new ArbejdsDreng("Villerup", "Prutter", 100);

        ArrayList<Ansat> ansatte = new ArrayList<>();
        ansatte.add(værkfører);
        ansatte.add(mekaniker);
        ansatte.add(synsmand);

        System.out.println(samletUgeLoen(ansatte));

    }

    public static double samletUgeLoen(ArrayList<Ansat> ansatte){
        double result = 0;
        for (Ansat a : ansatte){
            result += a.beregnLoen(a.getTimeLønSats());
        }
        return result;
    }
}

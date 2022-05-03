package opgave5;

import java.util.ArrayList;

public class Indkøbsvogn {
    private int antal;
    private final ArrayList<Vare> varer = new ArrayList<>();

    public Indkøbsvogn(){

    }

    public double beregnSamletPris(ArrayList<Vare> list){
        double result = 0.0;
        for(Vare v : list){
            result += v.beregnSalgsPris();
        }
        return result;
    }

    public void addVarer(Vare vare){
        varer.add(vare);
    }
}

package opgave3;

public class Værkfører extends Ansat{
    private int tillægPrUge;
    private int år;

    public Værkfører(String adresse, String navn, int år , int timeLønSats, int tillægPrUge) {
        super(adresse, navn, timeLønSats);
        this.år = år;
        this.tillægPrUge = tillægPrUge;
    }


    @Override
    public double beregnLoen(int timelønsats){
        return super.beregnLoen(timelønsats) + tillægPrUge;
    }
}

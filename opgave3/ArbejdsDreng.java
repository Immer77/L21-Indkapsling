package opgave3;

public class ArbejdsDreng extends Ansat{
    public ArbejdsDreng(String adresse, String navn, int timeLønSats) {
        super(adresse, navn, timeLønSats);
    }

    @Override
    public double beregnLoen(int timeLønSats){
        return 25 * timeLønSats;
    }

}

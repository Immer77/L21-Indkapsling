package opgave3;

public abstract class Ansat extends Person{
    private int timeLønSats;

    public Ansat(String adresse, String navn, int timeLønSats) {
        super(adresse, navn);
        this.timeLønSats = timeLønSats;
    }


    public int getTimeLønSats() {
        return timeLønSats;
    }

    public double beregnLoen(int timelønSats){
        return 37 * timelønSats;
    }
}

package opgave3;

public class Mekaniker extends Ansat {
    private int år;
    private int timelønSats;

    public Mekaniker(String navn, String adresse,int timelønSats, int år) {
        super(navn, adresse, timelønSats);
        this.timelønSats = timelønSats;
        this.år = år;
    }

    public int getÅr() {
        return år;
    }

    public void setÅr(int år) {
        this.år = år;
    }

    public int getTimelønSats() {
        return timelønSats;
    }

    public void setTimelønSats(int timelønSats) {
        this.timelønSats = timelønSats;
    }


}

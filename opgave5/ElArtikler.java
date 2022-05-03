package opgave5;

public class ElArtikler extends Vare{

    private int gnsEnergiForbrug;

    private final double moms = 1.30;
    public ElArtikler(double pris, String navn, String beskrivelse, int gnsEnergiForbrug) {
        super(pris, navn, beskrivelse);
        this.gnsEnergiForbrug = gnsEnergiForbrug;
    }

    @Override
    public double beregnSalgsPris() {
        double result = this.getPris() * moms;
        if(result - this.getPris() < 3){
            return this.getPris() + 3.0;
        }else{
            return this.getPris() * moms;
        }
    }
}

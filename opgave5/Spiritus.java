package opgave5;

public class Spiritus extends Vare{

    private int alkoholprocent;
    private final double moms = 1.80;

    public Spiritus(double pris, String navn, String beskrivelse, int alkoholprocent) {
        super(pris, navn, beskrivelse);
        this.alkoholprocent = alkoholprocent;
    }

    @Override
    public double beregnSalgsPris() {
        double result = 0.0;
        if(this.getPris() > 90){
            result = this.getPris()*moms;
        }else{
            result = this.getPris() * 2.10;
        }
        return result;
    }
}

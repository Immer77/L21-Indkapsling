package opgave5;

import java.lang.management.ThreadInfo;
import java.time.LocalDate;

public class Fødevare extends Vare{
    private int holdbarhedsTid;
    private final double moms = 1.05;

    public Fødevare(double pris, String navn, String beskrivelse, int holdbarhedsTid) {
        super(pris, navn, beskrivelse);
        this.holdbarhedsTid = holdbarhedsTid;
    }

    @Override
    public double beregnSalgsPris() {
        double result = this.getPris() * moms;
        if(result - this.getPris() < 3){
            return this.getPris() + 3;
        }else{
            return this.getPris() * moms;
        }
    }
}

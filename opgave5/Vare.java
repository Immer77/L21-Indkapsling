package opgave5;

public abstract class Vare {
    private double pris;
    private String navn;
    private String beskrivelse;


    public Vare(double pris, String navn, String beskrivelse){
        this.pris = pris;
        this.navn = navn;
        this.beskrivelse = beskrivelse;

    }

    public abstract double beregnSalgsPris();

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

}

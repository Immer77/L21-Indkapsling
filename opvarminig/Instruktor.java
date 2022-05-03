package opvarminig;

public class Instruktor extends Person{
    private int månedsløn;

    public Instruktor(String navn, int fødselsår, int månedsløn) {
        super(navn, fødselsår);
        this.månedsløn = månedsløn;
    }

    public int getMånedsløn() {
        return månedsløn;
    }

    public void setMånedsløn(int månedsløn) {
        this.månedsløn = månedsløn;
    }

    @Override
    public String toString(){
        return super.toString() + " Månedsløn: " +månedsløn;
    }
}

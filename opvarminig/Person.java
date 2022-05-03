package opvarminig;

public class Person {
    private String navn;
    private int fødselsår;

    public Person(String navn, int fødselsår){
        this.navn = navn;
        this.fødselsår = fødselsår;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getFødselsår() {
        return fødselsår;
    }

    public void setFødselsår(int fødselsår) {
        this.fødselsår = fødselsår;
    }

    @Override
    public String toString(){
        return navn + " Fødselsdag: " + fødselsår;
    }
}

package opgave4;

public class Kvadrat extends Figur{
    private double side1;

    public Kvadrat(double xKordinat, double yKordinat, double side1) {
        super(xKordinat, yKordinat);
        this.side1 = side1;
    }

    @Override
    public double beregnAreal() {
        return Math.pow(side1,2);
    }
}

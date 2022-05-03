package opgave4;

public class Cirkel extends Figur{
    private double radius;

    public Cirkel(double xKordinat, double yKordinat, double radius) {
        super(xKordinat, yKordinat);
        this.radius = radius;
    }

    @Override
    public double beregnAreal() {
        return Math.PI * Math.pow(radius,2);
    }
}

package opgave4;

public class Ellipse extends Figur{
    private double radius1;
    private double radius2;

    public Ellipse(double xKordinat, double yKordinat, double radius1, double radius2) {
        super(xKordinat, yKordinat);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public double beregnAreal(){
        return Math.PI * radius1 * radius2;
    }
}

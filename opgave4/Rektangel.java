package opgave4;

public class Rektangel extends Figur{
    private double side1;
    private double side2;
    public Rektangel(double xKordinat, double yKordinat, double side1, double side2) {
        super(xKordinat, yKordinat);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double beregnAreal(){
        return side1 * side2;
    }

}

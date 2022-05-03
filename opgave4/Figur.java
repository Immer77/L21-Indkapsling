package opgave4;

public abstract class Figur {
    double xKordinat;
    double yKordinat;

    public Figur(double xKordinat, double yKordinat){
        this.xKordinat = xKordinat;
        this.yKordinat = yKordinat;
    }

    public abstract double beregnAreal();

    public double getxKordinat() {
        return xKordinat;
    }

    public void setxKordinat(double xKordinat) {
        this.xKordinat = xKordinat;
    }

    public double getyKordinat() {
        return yKordinat;
    }

    public void setyKordinat(double yKordinat) {
        this.yKordinat = yKordinat;
    }
}

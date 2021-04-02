package homework3.task3;

public class Plane extends Vehicle{
    private double height;
    private int passquantity;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPassquantity() {
        return passquantity;
    }

    public void setPassquantity(int passquantity) {
        this.passquantity = passquantity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", passquantity=" + passquantity +
                '}';
    }
}

package homework3.task3;

public class Ship extends Vehicle{
    int passquantity;
    String harbor;

    public int getPassquantity() {
        return passquantity;
    }

    public void setPassquantity(int passquantity) {
        this.passquantity = passquantity;
    }

    public String getHarbor() {
        return harbor;
    }

    public void setHarbor(String harbor) {
        this.harbor = harbor;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "passquantity:" + passquantity +
                ", harbor:" + harbor + '\'' +
                '}';
    }
}

package homework7.addtask;

public class addtask {
    public enum Vehicles{
        MERCEDES(200000);
        public int price;
        Vehicles(int price){
            this.price=price;
        }

        @Override
        public String toString() {
            return "Vehicles{" + "model "+Vehicles.super.name()+
                    " price=" + price +
                    '}';
        }

        public void getColor(String color){
            System.out.println("Color of car is "+ color);

        }
    }
}

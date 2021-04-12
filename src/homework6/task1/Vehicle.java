package homework6.task1;

public class Vehicle {
    private static class Wheel{
        static String colour = "red";
    }
    private static class Door{
        static String colour = "black";
    }
    public void printWheelColor(){
        System.out.println(Wheel.colour);
    }
    public void printDoorColor(){
        System.out.println(Door.colour);
    }
}

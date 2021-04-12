package homework6;

import homework6.addtask.Calculator;
import homework6.task1.Vehicle;
import homework6.task2.Distance;

public class Main {
    public static void main(String[] args) {
        //------task1-------
        Vehicle door = new Vehicle();
        door.printDoorColor();
        Vehicle wheel = new Vehicle();
        wheel.printWheelColor();
        //--------task2---------
        Distance conv = new Distance();
        conv.print();
        //--------add task--------
        Calculator calc = new Calculator();
        calc.print();
    }
}

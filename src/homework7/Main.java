package homework7;

import homework7.addtask.addtask;
import homework7.task1.ErrorPrinter;
import homework7.task2.task2;


public class Main {

    public static void main(String[] args) {
        //----------task1----------
        ErrorPrinter print = new ErrorPrinter() {
            @Override
            public void printError(String error) {
                System.out.println(error);
            }

        };
        print.printError("\033[31m ERROR");
        //---------task2-----------
        task2.Animals dog = task2.Animals.DOG;
        System.out.println(dog.toString());
        //----------addtask--------------
        addtask.Vehicles car = addtask.Vehicles.MERCEDES;
        car.getColor("Black");
        System.out.println(car.toString());
    }
    }


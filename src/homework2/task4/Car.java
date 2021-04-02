package homework2.task4;

public class Car {
    int year;
    double speed;
    int weight;
    String colour;

    Car(){ }

    Car (int year){
        this.year=year;
    }

    Car(int year, double speed){
        this(year);
        this.speed=speed;
    }

    Car(int year, double speed, int weight){
        this(year, speed);
        this.weight=weight;
    }

    Car(int year, double speed, int weight, String colour){
        this(year, speed, weight);
        this.colour=colour;
    }

}


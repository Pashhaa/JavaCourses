package homework1;

import homework1.add_task.Address;
import homework1.task2.Rectangle;
import homework1.task4.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*----------ADDITIONAL TASK---------*/
        Address adress = new Address();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your country");
        adress.setCountry(sc.nextLine());
        System.out.println("enter your city");
        adress.setCity(sc.nextLine());
        System.out.println("enter your street");
        adress.setStreet(sc.nextLine());
        System.out.println("enter your house");
        adress.setHouse(sc.nextLine());
        System.out.println("enter your apartment");
        adress.setApartment(sc.nextLine());
        System.out.println("enter your index");
        adress.setIndex(sc.nextLine());
        System.out.println(adress.getCountry());
        System.out.println(adress.getCity());
        System.out.println(adress.getStreet());
        System.out.println(adress.getHouse());
        System.out.println(adress.getApartment());
        System.out.println(adress.getIndex());

        /*----------TASK 2---------*/
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону");
        double side1 = scanner.nextDouble();
        System.out.println("Введите первую сторону");
        double side2 = scanner.nextDouble();
        rectangle = new Rectangle();
        System.out.println(rectangle.areaCalculator(side1, side2));
        System.out.println(rectangle.perimeterCalculator(side1, side2));


        /*----------TASK 3---------*/
        Computer[] computers = new Computer[5];
        for (int i = 0; i < 5; i++) {
            computers[i] = new Computer();
        }
    }
}
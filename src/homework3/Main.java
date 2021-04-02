package homework3;

import homework3.add_task.Printer;
import homework3.task2.*;
import homework3.task3.Car;
import homework3.task3.Plane;
import homework3.task3.Ship;
import homework3.task4.DocumentWorker;
import homework3.task4.ExpertDocumentWorker;
import homework3.task4.ProDocumentWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();


        main.startTask2();
        main.startTask3();
        main.startTask4();
        main.startAddTask();
    }

    void startTask2() {

        Pupil goodPupil = new GoodPupil();
        Pupil badPupil = new BadPupil();
        Pupil excellentPupil = new ExcellentPupil();
        Pupil pupil = new Pupil();
        ClassRoom room = new ClassRoom(goodPupil,badPupil,excellentPupil,pupil);
        room.pupil1.relax();
        room.pupil2.read();
        room.pupil3.study();
        room.pupil4.write();

    };




    void startTask3() {
        Plane an148= new Plane();
        an148.setHeight(1.488);
        System.out.println(an148.getHeight());
        System.out.println(an148.toString());
        Ship lodka = new Ship();
        lodka.setHarbor("Pearl harbor");
        System.out.println(lodka.getHarbor());
        System.out.println(lodka.toString());
        Car bmwx5 = new Car();
        bmwx5.setPrice(5);
        System.out.println(bmwx5.getPrice());
        System.out.println(bmwx5.toString());

    }

    void startTask4() {
        DocumentWorker doc;
        Scanner sc = new Scanner(System.in);
        int key1 = sc.nextInt();


        if (key1 == 1337) {
            doc = new ProDocumentWorker();
        }


        else if (key1 == 228) {
            doc = new ExpertDocumentWorker();

        }

        else{
            doc = new DocumentWorker();
        }
        doc.openDocument();
        doc.editDocument();
        doc.saveDocument();
    }
    void startAddTask() {
        Printer printer = new Printer();
        printer.print(" ");
    }
}

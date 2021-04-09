package homework5;

import homework5.task1.Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zoo zoolist = new Zoo("dog", "bull","wolf","tiger", "shark","lion","giraffe","elephant");
        ArrayList<Object> list = new ArrayList<>();
        list.add(zoolist.wolf);
        list.add(zoolist.bull);
        list.add(zoolist.lion);
        list.add(zoolist.tiger);
        list.add(zoolist.shark);
        list.add(zoolist.elephant);
        list.add(zoolist.giraffe);
        list.add(zoolist.dog);
        System.out.println(list);


    }
}

package homework5;

import homework5.task1.Zoo;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //--------task1-------------
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
        //---------task2-----------
        list.remove(2);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        System.out.println(list.size());
        //--------task3-------------
        ArrayList<Integer> newlist = new ArrayList<>();
        Random rand = new Random();
        for(int i=0; i<10;i++){
            newlist.add(rand.nextInt(20));

        }
        System.out.println(newlist);
        int maxValue = newlist.get(0);
        int maxIndex = 0;
        int minValue = newlist.get(0);
        int minIndex = 0;
        for(int i=0; i<newlist.size();i++){
            if (newlist.get(i)< minValue){
                minValue= newlist.get(i);
                minIndex=i;
            }
        }
        System.out.println("min= "+minIndex);
        System.out.println(newlist);
        for(int i=0; i<newlist.size();i++){
            if (newlist.get(i)> maxValue){
                maxValue= newlist.get(i);
                maxIndex=i;
            }
        }
        System.out.println("max= "+maxIndex);







    }
}

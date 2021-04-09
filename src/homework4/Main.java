package homework4;

import homework4.task1.AbstractHandler;
import homework4.task1.DOCHandler;
import homework4.task1.TXTHandler;
import homework4.task1.XMLHandler;
import homework4.task2.Playable;
import homework4.task2.Player;
import homework4.task2.Recodable;


public class Main {
    public static void main(String[] args) {
        //--------------task1--------------

        System.out.println("homework5/task1");
        AbstractHandler[] handlers = {new TXTHandler(), new DOCHandler(), new XMLHandler()};
        for (AbstractHandler handler : handlers) {
            handler.open();
            handler.change();
            handler.create();
            handler.save();
        }
        //--------------task2-----------
        System.out.println("homework4/task2");
        Playable player = new Player();
        player.play();
        player.pause();
        player.stop();
        Recodable player2 = new Player();
        player2.record();
        //------------task3------------

    }
}

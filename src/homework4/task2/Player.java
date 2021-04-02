package homework4.task2;

public class Player implements Playable, Recodable{
    @Override
    public void play() {
        System.out.println("играет");
    }

    @Override
    public void record() {
        System.out.println("записано");
    }

    @Override
    public void pause() {
        System.out.println("остановлено");
    }

    @Override
    public void stop() {
        System.out.println("остановленооооо");

    }
}

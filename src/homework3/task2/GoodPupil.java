package homework3.task2;

public class GoodPupil extends Pupil{
    @Override
    public void read() {
        super.read();
        System.out.println("good");
    }

    @Override
    public void write() {
        super.write();
        System.out.println("good");
    }

    @Override
    public void study() {
        super.study();
        System.out.println("good");
    }

    @Override
    public void relax() {
        super.relax();
        System.out.println("good");
    }
}

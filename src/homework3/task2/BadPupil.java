package homework3.task2;

public class BadPupil extends Pupil {
    @Override
   public void study() {
        super.study();
        System.out.println("bad");
    }

    @Override
    public void relax() {
        super.relax();
        System.out.println("excellent");
    }

    @Override
    public void write() {
        super.write();
        System.out.println("bad");
    }

    @Override
    public void read() {
        super.read();
        System.out.println("bad");
    }
}

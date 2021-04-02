package homework3.task2;

public class ExcellentPupil extends Pupil {
    @Override
    public void study() {
        super.study();
        System.out.println("excellent");
    }

    @Override
   public void read() {
        super.read();
        System.out.println("excellent");

    }

    @Override
    public void write() {
        super.write();
        System.out.println("excellent");
    }

    @Override
    public void relax() {
        super.relax();
        System.out.println("bad");
    }
}

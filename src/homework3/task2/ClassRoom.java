package homework3.task2;

public class ClassRoom {
    public Pupil pupil1, pupil2, pupil3, pupil4;


    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
    }
}

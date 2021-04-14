package homework7.task2;

public class task2 {
    public enum Animals {
        DOG(3 );
        public int age;

        Animals(int age){
            this.age=age;

        }



        @Override
        public String toString() {
            return "Animals{"
                    + "name= " + Animals.super.name()+
                    " age= " + age +
                    '}';
        }
    }
}

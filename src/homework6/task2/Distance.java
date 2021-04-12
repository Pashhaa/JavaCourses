package homework6.task2;

public class Distance {
    public double distance=5;
    public void print(){
        System.out.println("meters = "+Converter.m_km(distance));
        System.out.println("kilometers = "+Converter.km_m(distance));
    }
    private static class Converter{
        static double km_m(double distance){

            return distance/1000;
        }
        static double m_km(double distance){
            return distance*1000;
        }

    }

}

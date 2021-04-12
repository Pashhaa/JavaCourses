package homework6.addtask;

public class Calculator {
    public double num1=2, num2=3;
    public void print(){
        System.out.println("num1 = "+num1 + " num2 = " +num2);
        System.out.println("num1 + num2 = "+ ArithOps.plus(num1,num2));
        System.out.println("num1 - num2 = "+ ArithOps.minus(num1,num2));
        System.out.println("num1 * num2 = "+ ArithOps.mult(num1,num2));
        System.out.println("num1 / num2 = "+ ArithOps.div(num1,num2));
    }
    private static class ArithOps{
        static double plus(double num1, double num2){
            return num1+num2;
        }
        static double minus(double num1, double num2){
            return num1-num2;
        }
        static double mult(double num1, double num2){
            return num1*num2;
        }
        static double div(double num1, double num2){
            return num1/num2;
        }
    }

}

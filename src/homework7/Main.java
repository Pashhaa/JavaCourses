package homework7;

import homework7.task1.ErrorPrinter;

public class Main {
    public static void main(String[] args) {
        //----------task1----------
        ErrorPrinter print = new ErrorPrinter() {
            @Override
            public void printError(String error) {
                System.out.println(error);
            }

        };
        print.printError("\033[31m ERROR");
        //---------task2-----------

    }
}

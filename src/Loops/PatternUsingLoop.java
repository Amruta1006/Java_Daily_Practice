package Loops;

public class PatternUsingLoop {
    public static void main(String[] args) {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");

            //second loop
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }

            System.out.println();
            rows++;
        }
    }
}


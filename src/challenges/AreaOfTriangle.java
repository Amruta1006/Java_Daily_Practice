package challenges;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height: ");
        double height = input.nextDouble();

        System.out.println("Enter base: ");
        double base = input.nextDouble();

        System.out.println("Area of Triangle: ");
        double Area = 0.5*height*base;
        System.out.println(Area);

    }
}

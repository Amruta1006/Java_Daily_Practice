package challenges;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        double A = input.nextDouble();

        System.out.println("Enter value of B: ");
        double B = input.nextDouble();

        System.out.println("Enter value of C: ");
        double C = input.nextDouble();

        System.out.println("Enter value of D: ");
        double D = input.nextDouble();

        System.out.println("Perimeter of Rectangle is: ");
        double perimeter = A+B+C+D;
        System.out.println(perimeter);
    }
}

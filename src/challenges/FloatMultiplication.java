package challenges;

import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first decimal number: ");
        double first = input.nextDouble();
        System.out.println("Enter second decimal number: ");
        double second = input.nextDouble();
        System.out.println("The multiplication of two float numbers is: ");
        double mul = first*second;
        System.out.println(mul);


    }
}

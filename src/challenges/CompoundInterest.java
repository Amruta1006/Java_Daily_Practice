package challenges;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of P: ");
        float P = sc.nextFloat();
        System.out.println("Enter value of R: ");
        float R = sc.nextFloat();
        System.out.println("Enter value of t: ");
        float t = sc.nextFloat();

        System.out.println("Compound Interest is: ");
        double CI =  P * Math.pow((1+R/100), t);
        System.out.println(CI);
    }
}

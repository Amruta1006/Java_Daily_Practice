package challenges;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr value of P, R, N: ");
        double P = input.nextDouble();
        double R = input.nextDouble();
        double N = input.nextDouble();

        System.out.println("Simple Interest is: ");
        double SimpleInterest = (P*R*N)/100;
        System.out.println(SimpleInterest);
    }
}

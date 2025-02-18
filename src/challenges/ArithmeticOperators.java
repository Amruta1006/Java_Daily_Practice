package challenges;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = input.nextInt();

        System.out.println("enter second number: ");
        int b = input.nextInt();

        int add = a+b;
        System.out.println(a+b);
        int sub = a-b;
        System.out.println(a-b);
        int mul = a*b;
        System.out.println(a*b);
        int div = a/b;
        System.out.println(a/b);
        int mod = a%b;
        System.out.println(a%b);


    }
}

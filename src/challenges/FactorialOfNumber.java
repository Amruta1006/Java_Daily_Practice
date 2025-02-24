package challenges;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of given number is: " + fact);

    }

    public static long factorial(int num){
        if( num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}

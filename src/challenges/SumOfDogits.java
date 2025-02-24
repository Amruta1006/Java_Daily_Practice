package challenges;

import java.util.Scanner;

public class SumOfDogits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter the number for multiplication: ");
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits is: " + sum);
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0){
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}

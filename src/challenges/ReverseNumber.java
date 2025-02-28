package challenges;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Reverse number code");
        System.out.println("Enter the number which you want to reverse: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of your number is: " +reverse);
    }
    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}

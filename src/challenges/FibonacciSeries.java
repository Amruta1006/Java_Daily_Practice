package challenges;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for fibonacci: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci: ");
        printFibo(num);
    }

    public static void printFibo(int num){
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int num1 = 0 , num2 = 1;
        while(num1 + num2 <= num){
            int num3 = num1+num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}

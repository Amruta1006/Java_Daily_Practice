package challenges;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num%2 == 1){
            System.out.println("Number is odd");
        }else if(num%2 == 0){
            System.out.println("Number is even");
        }
    }
}

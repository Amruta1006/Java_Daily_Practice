package challenges;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int num1 = sc.nextInt();

    System.out.println("Enter second number: ");
    int num2 = sc.nextInt();

    System.out.println("Enter third number: ");
    int num3 = sc.nextInt();

    //greatest number
        if(num1>=num2 && num1>=num3){
            System.out.println(num1 + " Num is greater");
        }else if(num2>=num3){
            System.out.println(num2 + " Num2 is greater");
        }else{
            System.out.println(num3 + " Num3 is greater");
        }
}
}

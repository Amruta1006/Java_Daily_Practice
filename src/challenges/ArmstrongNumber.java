package challenges;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Armstrong: ");
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
            if(isArmstrong){
                System.out.println("Your number is Armstrong");
            }else{
                System.out.println("Your number is not Armstrong");
            }
        }

    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNum=0;
        while(num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNum += pow(lastDigit, noOfDigits);
        }
        return finalNum == numCopy;
    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *= num1;
            i++;
        }

        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }
}

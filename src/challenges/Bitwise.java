package challenges;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if((num & 1) == 1){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even");
        }
    }
}

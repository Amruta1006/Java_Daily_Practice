package Normal_Codes;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = input.nextInt();

        if(age>=21){
            System.out.println("You are eligible for the voting");
        }else{
            System.out.println("You are not eligible for voting");
        }
    }
}

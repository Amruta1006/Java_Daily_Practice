package Normal_Codes;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        //use of scanner class
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Your Name :");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        //take age
        System.out.print(name + ",Tell me your age");
        int age = input.nextInt();
        System.out.println("Your age is :" + age);
    }
}

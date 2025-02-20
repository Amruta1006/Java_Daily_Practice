package Normal_Codes;
import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to ticket discount calculator");
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Are you female? (T/F): ");
        String gender = sc.next();
        boolean isFemale = gender.equalsIgnoreCase("T");
       if(age<5 ){
           System.out.println("You got discount of 75%");
       }else if(isFemale){
           System.out.println("You got discount of 75%");
       }else if(age>60 && !isFemale){
           System.out.println("You got 25% discout");
       }else{
           System.out.println("You got no discount");
       }

    }
}

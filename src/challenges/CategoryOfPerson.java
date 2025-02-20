package challenges;

import java.util.Scanner;

public class CategoryOfPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 65){
            System.out.println("You are senior");
        }else if(age >= 20){
            System.out.println("You are adult");
        }else if(age >= 13){
            System.out.println("You are teen");
        }else{
            System.out.println("You are child");
        }
    }
}

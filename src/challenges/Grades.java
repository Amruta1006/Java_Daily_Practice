package challenges;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        float marks = input.nextFloat();

        if(marks>=90){
            System.out.println("A grade");
        }else if(marks>=75){
            System.out.println("B grade");
        }else if(marks>=60) {
            System.out.println("C grade");
        } else if(marks>=30) {
            System.out.println("D grade");
        }else{
            System.out.println("Fail");
        }
    }
}

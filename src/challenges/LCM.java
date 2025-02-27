package challenges;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to LCM");
        System.out.print("Please enter the number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter the number: ");
        int num2 = sc.nextInt();
        int lcm = lcm(num1,num2);
        System.out.println("LCM is" +lcm);
    }
    public static int lcm (int num1, int num2){
        int i = 1;
        while(i <= num2){
            int factor = num1 * i;
            if (factor % num2 == 0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}

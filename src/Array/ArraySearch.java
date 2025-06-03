package Array;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3,6,8,9,14,96};
        System.out.println("Welcome to Array");
        System.out.println("enter the no you want to search");
        int num = input.nextInt();
        boolean isFound = isFound(arr,num);
        if(isFound){
            System.out.println("number found in array");
        }else{
            System.out.println("number not found in array");
        }
    }
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}

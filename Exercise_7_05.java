package project_1.All;

import java.util.Scanner;

public class Exercise_7_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] distinct_number = new int[10];
        int num ;
        int count = 0;
        for(int i = 0; i < 10; i++){
            num = input.nextInt();
            if(isDistinct(distinct_number, num)){
                distinct_number[count] = num;
                count++;
            }
        }
        System.out.println("Number of distinct numbers: " + count);
        System.out.print("Distinct numbers: ");
        for(int j = 0; j < count; j++)
            System.out.print(distinct_number[j] + " ");
    }
    public static boolean isDistinct(int[] array, int number){
        boolean isdistinct = true;
        for(int i = 0; i < array.length; i++){
            if(number == array[i])
                isdistinct = false;
        }
        return  isdistinct;
    }
}

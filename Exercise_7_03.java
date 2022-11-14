
//program: Count occurrence of numbers

package project_1.All;

import java.util.Scanner;

public class Exercise_7_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers between 1 and 100:");
        int number = input.nextInt();
        int[] numbers = new int[100];
        while (number != 0) {
            numbers[number-1]++;
            number = input.nextInt();
        }

        for (int i=0;i<100;i++){
            if(numbers[i] != 0){
                if(numbers[i] == 1)
                    System.out.println((i+1)+"  occurs  "+numbers[i] + " time");
                else
                    System.out.println((i+1)+"  occurs  "+numbers[i] + " times");

            }

        }
    }
}

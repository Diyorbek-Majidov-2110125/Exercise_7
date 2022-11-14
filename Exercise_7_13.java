
/* program: Write the following method that returns a random number between start and end, excluding the numbers. */

package project_1.All;
import java.util.Scanner;

public class Exercise_7_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers should be excluded in limits:"); int n_number = input.nextInt();
        System.out.println("\nEnter two numbers for limit and numbers excluded: ");
        int start = input.nextInt();
        int end = input.nextInt();
        int[] excluded_numbers = new int[n_number];
        for(int i = 0; i < n_number; i ++){
            excluded_numbers[i] = input.nextInt();
        }
        int[] method_numbers = getRandom(start, end, excluded_numbers);
        for(int j = 0; j < 45; j++){
            if(j % 15 == 0)
                System.out.println();
            else
                System.out.printf("%4d",method_numbers[j]);
        }

    }
    public static int[] getRandom(int start, int end, int... numbers){
        int[] nums = new int[45];
        for(int i = 0; i < 45; i ++){
            int a = (int)(Math.random() * 100 + 1);
            for(int j = 0; j < numbers.length; j++){
                if(a != numbers[j])
                    nums[i] = a;
            }
        }
        return nums;
    }
}

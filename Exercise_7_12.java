
//program: Reverse an array

package project_1.All;

import java.util.Scanner;

public class Exercise_7_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        double[] reversed_numbers = reverse(numbers);
        for(int i = 0; i < reversed_numbers.length; i++){
            System.out.print(reversed_numbers[i] + " ");
        }
    }
    public static double[] reverse(double[] a){
        double[] array = new double[a.length];
        for(int i = 0; i < a.length; i++){
            array[a.length - 1 - i] = a[i];
        }
        return array;
    }
}

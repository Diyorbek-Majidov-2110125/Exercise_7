
//program: Statistics: compute deviation

package project_1.All;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        double mean_value = mean(numbers);
        System.out.printf("The mean value is %.2f" ,mean_value);
        System.out.printf("\nThe standard deviation is %.4f" ,deviation(numbers));
    }
    public static double mean(double[] x){
        double sum = 0;
        for(Double n: x){
            sum += n;
        }
        return sum/x.length;
    }
    public static double deviation(double[] a){
        double sum = 0;
        double mean_value = mean(a);
        for(int j = 0; j < a.length; j++){
            sum += Math.pow(a[j] - mean_value, 2);
        }
        double deviation_value = Math.sqrt(sum/(a.length - 1));
        return deviation_value;
    }

}

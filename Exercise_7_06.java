package project_1.All;

import java.util.Scanner;

public class Exercise_7_06 {
    public static void main(String[] args) {

        int[] prime_numbers = new int[50];
        int count = 0;
        int num = 1;
        while(count < 50){
            if(isPrime(num)){
                prime_numbers[count] = num;
                count++;
            }
            num++;
        }
        for(int i = 0; i < 50; i++){
            if(i % 10 == 0)
               System.out.println();
            else
                System.out.printf("%-5d",prime_numbers[i]);
        }
    }
    public static boolean isPrime(int n){
        boolean isprime = true;
        for(int divisor = 2; divisor <= (int)Math.sqrt(n); divisor++){
            if(n % divisor == 0)
                isprime = false;
        }
        return  isprime;
    }
}

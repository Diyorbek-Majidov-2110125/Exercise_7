/*
    Write a program that prompts the user to enter the number of students, the students’ names, and their scores and prints student names in decreasing
order of their scores

 */


package project_1.All;

import java.util.Scanner;

public class Exercise_7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("how many are students there? "); int n = input.nextInt();
        String[] names = new String[n];
        double[] scores = new double[n];
        System.out.println("Enter student names: ");
        for(int i = 0; i < n; i++){
            names[i] = input.next();
        }
        System.out.println("Enter student scores: ");
        for(int i = 0; i < n; i++){
            scores[i] = input.nextDouble();
        }
        for(int j = 0; j < n; j++){
            for (int i = j + 1; i < n; i++){
                if(scores[i] > scores[j]){
                    double temp = scores[j];
                    String s_temp = names[j];
                    scores[j] = scores[i];
                    names[j] = names[i];
                    scores[i] = temp;
                    names[i] = s_temp;
                }
            }

        }
        for(int i = 0; i < n; i++){
            System.out.printf("%d. %-10s  %.2f",i + 1,names[i],scores[i]);
            System.out.println();
        }
    }
}

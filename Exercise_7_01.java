package project_1.All;

import java.util.Scanner;

public class Exercise_7_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        double[] scores = new double[number];
        System.out.println("Enter the scores: ");
        for(int i = 0; i < number; i++){
            scores[i] = input.nextDouble();
        }

        for(int j = 0; j < scores.length; j++){
            System.out.printf("Student %d is %f and grade is %c", j + 1, scores[j], getGrade(scores, scores[j]));
            System.out.println();
        }


    }

    public static char getGrade(double[] scores, double score){
        double best = getMax(scores);
        char ch = ' ';
        for(int a = 0; a < scores.length; a++){
            if(score >= best - 10)
                ch = 'A';
            else if(score >= best - 20)
                ch = 'B';
            else if(score >= best - 30)
                ch = 'C';
            else if(score >= best - 40)
                ch = 'D';
            else
                ch = 'F';
        }
        return ch;
    }
    public static double getMax(double[] scores){
        double max = scores[0];
        for(int j = 1; j < scores.length; j++){
            if(max < scores[j])
                max = scores[j];
        }
        return  max;
    }
}


//program: Count single digits

package project_1.All;

public class Exercise_7_07 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int number = 0;
        for(int j = 0; j < 10; j++){
            for(int i = 0; i < 10; i++){
                number = (int)(Math.random() * 10);
                numbers[number]++;
            }
        }
        for(int k = 0; k < numbers.length; k++){
            if(numbers[k] == 1)
                System.out.println((k) + " occurs " + numbers[k] + " time");
            else if(numbers[k] == 0)
                System.out.println(k + " doesn't occur...");
            else
                System.out.println((k) + " occurs " + numbers[k] + " times");
        }

    }
}

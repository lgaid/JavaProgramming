package day19_array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumberDouble {
   
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to add");
        double total = input.nextDouble();

        int[] numbers = new int[(int) total];
        int sum = 0;

        for (int i = 0; i < total; i++) {
            System.out.println("Enter a number");
            numbers[i] = input.nextInt();
            sum += numbers[i];

        }

        double average = sum / (double)total;
        System.out.println(average);

      //  System.out.println("Numbers: " +Arrays.toString(numbers));
      //  System.out.println("sum: " + sum);




        // System.out.println("Numbers: " + Arrays.toString(numbers));
        //  System.out.println("sum: " + sum);
        // System.out.println("average: " + average);


    }
    
}

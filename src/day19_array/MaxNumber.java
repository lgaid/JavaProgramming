package day19_array;

public class MaxNumber {


    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        int max = numbers[0]; // assume that first element is the maximum number

        for (int i = 1; i < numbers.length; i++) { // i: 1, 2, 3, 4...

            if(numbers[i] > max){ // compares the element of the array with current maximum number
                max = numbers[i]; // replace the current maximum number
            }

        }


        System.out.println("max = " + max);
// replit max array
//  int max = nums[0];
//    int i = 0;
//
//    for (nums [i] = 1; i < nums.length; i++) {
//     if (nums[i] > max) {
//       max = nums[i];
//}
//}
//     System.out.println(max)

    }


}

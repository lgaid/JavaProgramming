package day12_customMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

        System.out.println(isOdd(100));






    }

    public static boolean isOdd(int num){
        return (num % 2 != 0) ? true : false; // or can use return (num%2==0); (there are different ways)

    }

    public static boolean isEven(int num) {
      return !isOdd(num);

    }

    public static int max(int num1, int num2){
        return num1 > num2 ? num1 : num2;



    }
    public static int min(int num1, int num2) {
        return  num2 > num1 ? num2 :num1;

    }

}
/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */
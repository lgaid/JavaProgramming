package day13_customMethods;

import java.util.Scanner;

public class CubeMethodWithScanner {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter number");
        int n = cube (input.nextInt());



        System.out.println(n);

    }
    public static int cube(int n){

        int cube = n * n * n;
        return cube;

    }


}

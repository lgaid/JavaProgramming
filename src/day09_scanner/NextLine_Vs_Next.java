package day09_scanner;

import java.util.Scanner;

public class NextLine_Vs_Next {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine(); // will take out the memory on the scanner

        System.out.println("Enter your full name");
        String full_name = input.nextLine();

        System.out.println("Age= " + age);
        System.out.println("full name =" + full_name);



    }


}

package day09_scanner;

import java.util.Scanner;   // imports the scanner

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // for reading user input

        System.out.println("Enter your first number: ");

        byte num1 = input.nextByte();   // -128 ~ 127

        System.out.println("Enter your second number");

        short num2 = input.nextShort();

        System.out.println("Enter your third number");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number");

        long num4 = input.nextLong();

        input.close();  // closes the scanner and stops reading any user inputs




        /*
        System.out.println("Enter your fifth number");
        int num5 = input.nextInt();
        Scanner is closed at line 27, once closed it can't read inputs
         */

        System.out.println("First number " +num1);
        System.out.println("Second number " + num2);
        System.out.println("Third number " + num3);
        System.out.println("Fourth number " + num4);
    //    System.out.println("Fifth number " + num5);








    }


}

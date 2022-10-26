package day16_nestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String u, p;
        int attempt = 3;

        do {

            System.out.println("Enter your name: ");
            u = input.nextLine();

            System.out.println("Enter your password");
            p = input.nextLine();

            attempt--;

        }while (  !(u.equals("Cydeo") && p.equals("WoodenSpoon")));




    }


}

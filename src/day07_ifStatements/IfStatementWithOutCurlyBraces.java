package day07_ifStatements;

public class IfStatementWithOutCurlyBraces {


    public static void main(String[] args) {


        int age = 32;

        if (age >= 21) {
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");

            System.out.println("--------------------------------------------------");

            if (age >= 21) System.out.println("Eligible"); // optionally no curly braces are needed if
            else System.out.println("Not eligible");                // only if it is 1 statement


            System.out.println("-----------------------------------------------------");

           // int day = 2; // 1 - 7

           // if (day == 1) System.out.println("Monday");
            //else if (day == 2) System.out.println("Tuesday"); // etc... Not good practice


        }




    }



}

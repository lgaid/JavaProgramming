package day08_ternary_switch;

public class SwitchIntro {


    public static void main(String[] args) {

        char grade = 'A';


        /*
        String result = "";

            if (grade == 'A'){
            result = "Excellent";

        } else if (grade == 'B') {
            result = "Great Job";

        } else if (grade == 'C') {
            result = "Good";

        } else if (grade == 'D') {
            result = "Passed";

        } else {
            System.out.println("Failed");


        }


       System.out.println(result);

     */



        System.out.println("-----------------------------------------");


        switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;


        }







    }


}

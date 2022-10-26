package day04_concatenation;

public class Concatenation_vs_Addition {


    public static void main(String[] args) {


        System.out.println("32" + 1);  // 321

        System.out.println(7 + "1");  // 71

        System.out.println("-------------------------------");

        System.out.println( 12 + 2.5 );  //14.5

        System.out.println("----------------------------------------");

        System.out.println(" The value is " + true );



    }



}
/*

Correct:
Employee Information
We have Noah Smith joining Apple
Noah will start on 1/10/2022 as full time: true
Noah here is some information about your employment
Your email is Noah10@Apple.com
Your base salary is $200000 and after 2 years it will be $230000
Welcome aboard, see you at One Apple Park Way, Cupertino, CA 95014


Employee Information
We have Noah Smith joining Apple
Noah will start on 1/10/2022
as full time:true
Noah here is some information about your employment
Your email is Noah10@Apple.com
Your base salary is $200000and after 2 years it will be3000000
Welcome aboard, see you atOne Apple Park, Cupertino, CA 95014


 */
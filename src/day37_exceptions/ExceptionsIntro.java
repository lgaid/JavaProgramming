package day37_exceptions;

public class ExceptionsIntro {

    public static void main(String[] args) {


        String str = "Java";
       char ch = str.charAt(250); //un-checked exception


        Pizza pizza = null;
       // pizza.calcCost();  un-checked exception

    System.out.println("Hello World");


        System.out.println("-----------------------------------------");

        int score = 100;

        if (score > 59) {
            System.out.println(" Your grade is D");
        }else if(score > 70 ){
            System.out.println(" Your grade is C");
        }

        System.out.println("---------------------------------------------------");


        //FileInputStream file = new FileInputStream(""); // checked exception, WILL NOT EVEN COMPILE THE CODE


        //Thread.sleep(3000); // // checked exceptions do not compile (or run your codes)





    }


}

package day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try{
            System.out.println(9/0);  // Arithmetic exception
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch block");
        }


        System.out.println("Program ended");

        System.out.println("-----------------------------------------------");


        System.out.println("Program2 started");

        String str = null;



        try{
            System.out.println(str.toLowerCase());
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch block");
        }



        System.out.println("Program2 ended");


        System.out.println("---------------------------------------------------------------");


        System.out.println("Program3 started");


        try {
            Thread.sleep(3000);
            System.out.println("Try block");

        } catch (InterruptedException e) {
            System.out.println("Catch block");
        }


        System.out.println("Program3 ended");



    }


}

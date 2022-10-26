package day37_exceptions;

import day35_polymorphism.transportation.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {


        System.out.println("Program1 started");

        Car car = null;

        try {
            car.drive();

        } catch (ArithmeticException e) {
            System.out.println("First Catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second Catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third Catch block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Forth Catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth Catch block");
            e.printStackTrace();
        }

        System.out.println("Program1 ended");





    }



}
 /*
        try{
        }catch (RuntimeException e){
        }try{
        }try{
        }try{
        }
   */

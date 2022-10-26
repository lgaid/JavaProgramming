package day38_exceptions;

import java.lang.reflect.Array;

public class FifthElement {


    public static void main(String[] args) {



        String[] arr = new String[4];

        try {
            System.out.println(Array.get(arr,4));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }


    }


}
/*
1. Write a program that can return the fifth element from an array

        note: avoid getting any exceptions


 */
package day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        int sum = 0;

        for(Integer each : list ){
            sum += each;
        }


        double average = sum / (double)list.size();

        System.out.println("average = " + average);





    }

}
/*
1. Go to url: https://login.cydeo.com/
        1.1 Sign in to the dashboard app by using your my.cydeo.com account
        1.2 Click the Github JDB Organization App on the dashboard

        2. Write a program that can find the average number from an arrayList of integers


        3. Write a program that can return the first unique elements from an array list
        Ex:
        ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

        output:
        2


 */
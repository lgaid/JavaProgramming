package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeya");
        names.add("Sumeya");
        names.add("Ali");
        names.add("Sumeya");


        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {

            if(nonDup.contains(each)){
                continue;
            }

            nonDup.add(each);

        }

        // [Vasyl, Sumeye, Ali]

        names = nonDup;

        System.out.println(names);
        System.out.println(nonDup);












    }


}

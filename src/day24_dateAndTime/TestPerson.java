package day24_dateAndTime;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPerson {

    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Alina",'F',LocalDate.of(1978, 2, 22 ));
        people[2].setInfo("Coco",'F', LocalDate.of(1998,05,12));
        people[3].setInfo("Brian", 'M',LocalDate.of(1976, 12, 12));
        people[4].setInfo("Lisa",'F', LocalDate.of(1983, 06, 05));

        ArrayList<Person> studentlist = new ArrayList<>();
        studentlist.addAll(Arrays.asList(people));

        /*
        for (int i = 0; i < studentlist.size(); i++) {
            System.out.println( studentlist.get(i).name + " " + studentlist.get(i).dateOfbirth);
        }


        for (int i = 0; i < studentlist.size(); i++) {
            if (studentlist.get(i).age > 55){
             studentlist.remove(i);


            }


        }
        System.out.println(studentlist);


         */


       // or shorter way:

        // print name and DOB of each person object

        for (Person each : studentlist) {
            System.out.println(each.name + " : " + each.dateOfbirth);
        }

        // remove all the person object that has the age >55 (removeIf method)
        studentlist.removeIf(p ->p.age>55);

        System.out.println(studentlist);






    }

}

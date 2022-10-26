package day25_constructors;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {


        Person[] people = {new Person(),new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Lucy",'F', LocalDate.of(1978,5,20));
        people[1].setInfo("Fawzy", 'M', LocalDate.of(1971,12,12));
        people[2].setInfo("Cody Saintgnue", 'M', LocalDate.of(1993,6,15));
        people[3].setInfo("Froy Gutieerrez", 'M', LocalDate.of(1998, 4,27));
        people[4].setInfo("Holland Roden",'F',LocalDate.of(1986,10,7));

        ArrayList<Person> StudentList = new ArrayList<>();
        StudentList.addAll(Arrays.asList(people));
        System.out.println(StudentList);
        StudentList.removeIf(p-> p.age > 55);
        System.out.println(StudentList);

    }




}

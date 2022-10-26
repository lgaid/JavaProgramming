package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoStudentObject {


    public static void main(String[] args) {

        CydeoDevStudent cydeoDevStudent = new CydeoDevStudent("Daniel",'M', LocalDate.of(1978,06,20),"A1","zero to hero",2);


        System.out.println(cydeoDevStudent);


        cydeoDevStudent.sleep();
        cydeoDevStudent.drink();
        cydeoDevStudent.eat();
        cydeoDevStudent.breath();




    }

}

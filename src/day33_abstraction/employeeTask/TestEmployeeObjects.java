package day33_abstraction.employeeTask;

public class TestEmployeeObjects {


    public static void main(String[] args) {

        // Employee employee = new Employee("lala",36,'F',"A1","SDET",100000) {
        // We cannot create objects from an abstract class, Objects MUST be created from a concrete class


        Teacher teacher = new Teacher("James",36,'M',"A1","Math teacher",30000);

        Developer developer = new Developer("Lucy",44,'F',"A54","Java Developer",120000,"Java" );

        Driver driver = new Driver("Haley",26,'F',"Ad554","truck driver",65000);

        Tester tester = new Tester("Carl",50,'M',"B54","Java tester",120000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);



        teacher.work();
        developer.work();
        teacher.work();
        tester.work();


    }


}

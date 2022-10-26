package day24_dateAndTime;


import java.time.LocalDate;

public class Person {


    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfbirth;





    public void setInfo(String name, char gender, LocalDate dateOfbirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfbirth = dateOfbirth;
        age = LocalDate.now().getYear() - dateOfbirth.getYear();



    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfbirth=" + dateOfbirth +
                '}';
    }





}

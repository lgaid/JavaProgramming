package day11_string;

import javax.lang.model.SourceVersion;
import java.util.Locale;

public class StringMethods3 {


    public static void main(String[] args) {


        String word = "Wooden Spoon";

        boolean r1 = word.isEmpty();

        System.out.println(r1);


        // Is empty method
    //--------------------------------------------

        String str = "        ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isEmpty();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //-------------------------------------------------------


        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str1.equals(str2));

        String str3 = new String("cydeo");

        System.out.println(str1.equals(str3));

        //-----------------------------------------------------

        String s1 = "Java";
        String s2 = "java";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2));

        //--------------------------------------------

        // yes, Yes, yES, YeS  ======= yes

        String students = "Hasan Naran Sumeya Natalia";

        boolean hasAhmed = students.contains("Ahmed");

        System.out.println("hasAhmed = " + hasAhmed);


        String sentences =  "My favorite programming language is Java";

        boolean hasJava = sentences.toLowerCase().contains("java");

        System.out.println("hasJava = " + hasJava);

        //--------------------------------------------------

        String name = "Michael";

        boolean l = name.startsWith("Da");

        System.out.println(l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println(isValid);

        boolean t = url.endsWith(".com");

        System.out.println(t);

        //------------------------------------------------------


        String email = "CydeoSchool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isHotmail = " + isHotmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isGmail = " + isGmail);



    }


}

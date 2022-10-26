package day08_ternary_switch;

public class Levels {

    public static void main(String[] args) {


        int readingLevel = 80;

        String result = "";

        if (readingLevel >= 1 && readingLevel <= 50) {

            result = (readingLevel <= 10) ? "If your score is 10 = Level 1 in Reading" :
                    (readingLevel <= 20) ? "If your score is 20 = Level 2 in Reading" :
                            (readingLevel <= 30) ? "If your score is 30 = Level 3 in Reading" :
                                    (readingLevel <= 40) ? "If your score is 40 = Level 4 in Reading" :
                                            "If your score is 50 = Level 5 in Reading";
        }else{
            result = "Invalid level";



            System.out.println(result);
        }






    }


}

/*


5 levels of reading:
"Level 1" -  1-10
Level 2 - 11-20
Level 3 - 21-30
Level 4 - 31-40
Level 5 - 41-50


 */
package day17_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // 0 is the index number of the string which is a
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { // checks how many times ch appears in string
                if (str.charAt(i) == ch){ // if the ch appeared in the string
                    frequency++;// increase frequency by 1

                }
            }

            if (frequency == 1){ // if the frequency is 1
                unique += ch;

            }

        }

        System.out.println(unique);



    }


}
/*
Warmup Tasks:
	1. Write a program that can find the unique characters from a String
			Ex:
				str = Warmup Tasks:
	1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd

				output:
					bd
 */
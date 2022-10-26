package day17_customClass;

public class UniqueCharacters {


    public static void main(String[] args) {


        String str = "aabcccd";
        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);
            if (str.indexOf(each) == str.lastIndexOf(each)){ // will tell us if a where is the first and last it is seen
                unique += each;
            }


        }

        System.out.println(unique);

    }


}
/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd

 */
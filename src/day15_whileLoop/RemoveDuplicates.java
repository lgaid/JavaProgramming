package day15_whileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbcccc";
        String result = ""; //

        for (int i = 0; i < str.length(); i++){  // i: index number of str

           char each = str.charAt(i); // each character of the String str

            if (!result.contains( "" + each)){  // if the string result does not contain the character of String str yet
                result += each;  //then we add the character to string result

            }

        }


        System.out.println(result);





    }


}
/*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */

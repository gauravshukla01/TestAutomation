package utilities;

import java.util.HashMap;

public class StringsTest {

    public static void main(String[] args) {
        String test = "geekforgeek";
        // objective is do different operations on the string and come up with substrings that might just contain the repeating characters or just the
        // the non repeating characters and so on
        // first non repeating character to be found

        System.out.println("FIRST non repeating character ="+firstNonRepeatingCharacter(test));
        System.out.println("FIRST non repeating character ="+kNonRepeatingChar(test,2));
    }

    static Character firstNonRepeatingCharacter(String str){
        String s = str;
        HashMap<Character,Integer> char_counts = new HashMap<>();
        // loop thru the given string and add the elements to the hashmap with their respective counts
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if (char_counts.containsKey(c)){
                char_counts.put(c,char_counts.get(c)+1);
            }
            else
            {
                char_counts.put(c,1);
            }
        }

        // iterate thru the hashmap
        for (int u =0; u<s.length();u++){

        }

        // iterate thru the string and compare it with the hashmap values
        // return the first character that has key =1


        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (char_counts.get(c) == 1){
                return c;}
        }
        return '-';
    }

    static Character kNonRepeatingChar(String str, int n){
        String str1= str;
        int k=0;
        for (int i = 0 ; i<str1.length();i++){
         char t= str1.charAt(i);
         for (int j=0; j <str1.length(); j ++){
             if ((str1.charAt(j) == str1.charAt(i)) && (j!=i)){
                 // character repeats
                 break;
               }
             else if((str1.charAt(j) == str1.charAt(i)) && (j==i)){
               //continue;
             }

             } // end of inner j loop

         }// end of outer loop
            // non repeating character index



    // incase of no repetiion
        return '-';
    }
}

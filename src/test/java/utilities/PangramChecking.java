package utilities;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class PangramChecking {
    // check if the given string is pangram or not

    public static void main(String[] args) {
        String str1 = "HELLO MY NAME IS K";
        String str2 = "The quick brown fox jumps over the lazy dog";
        String str3 = "3ADF";
        String str4 = "The quick brown fox jumps";
        System.out.println("THE DIGITS ARE ="+checkForPangram(str2));


    }
    static boolean checkForPangram(String str){
        boolean flag=false;
        // logic for check pangram
        boolean[] a = new boolean[26];

        int index=0;
        // iterate thru the string provided
        for (int k=0; k < str.length(); k++){
            // check if the character of the string falls in A-Z
            if ('A' <= str.charAt(k) && str.charAt(k)<='Z'){
                index = str.charAt(k)-'A';
                a[index]=true;
            }
            else if ('a' <= str.charAt(k) && str.charAt(k)<='z'){
                index = str.charAt(k)-'a';
                a[index]=true;
            }
            else {continue;}

        }
        // call to print the missing characters..
        printMissingCharacters(a);
        // iterate the boolean char aray

        for (boolean j : a){
            if (!j){
                return flag;
            }
        }

        return flag=true;
    }

    static String getDigits(String str){
        String test = str;
        String digits =      test.replaceAll("[^0-9]","");
        return digits;

    }

    static void printMissingCharacters(boolean[] inp){
        ArrayList<Character> missingChar = new ArrayList<Character>();
        for (int u=0;u<inp.length;u++){
            if(inp[u]==false){
                missingChar.add((char)(u+'a'));
            }
        }
        System.out.println("Missing characters are as below :");
        for (char t : missingChar){
            System.out.println(t);
        }

    }
}

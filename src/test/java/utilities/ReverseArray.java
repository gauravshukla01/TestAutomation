package utilities;

// Recursive Java Program to reverse an array
import java.io.*;

public class ReverseArray {

    /* Function to reverse arr[] from start to end*/
    static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rvereseArray(arr, start+1, end-1);
    }

    /* Utility that prints out an array on a line */
    static void printArray(int arr[], int size)
    {
        for (int i=0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    /*Driver function to check for above functions*/
    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int number =1234;
        printArray(arr, 6);
        rvereseArray(arr, 0, 5);
        System.out.println("Reversed array is ");
        printArray(arr, 6);
        reverseDigitsOfNumber(number);
        String test = "apple";
        int len = test.length();
        int start = 0; int end =len-1;
        reverseString(start,end,test);
        reverseString1(test);
        String sentence = "I AM ROCKY AND I WORK";
        reverseSentence(sentence);
        Float y =1.234f;
        reverseDecimalNum(y);

    }

    static void reverseDigitsOfNumber(int incNumber){
        // write to reverse the digits of a number
        int digit=0;
        while (incNumber>0){
            digit =  digit*10+(incNumber%10);
            //
            incNumber = incNumber/10;
        }
        System.out.print("REVERSE NUMBER  ==>"+digit);
    }

    // program to reverse a string
    static void reverseString(int start, int end ,String incString){
        char outString;
     // traverse the incoming string.. left to right, have a new string declared as blank,keep taking the character from the end of the incomng string and append to the new string
        String nstr = "";
        int len = incString.length();
        for (int i=0;i<len;i++){
            outString= incString.charAt(i);
            nstr = outString+nstr;

        } // end of for loop

    System.out.println("\n\nREVERSE STRING ==> "+nstr);
    }

    static  void reverseString1(String incString){
        char[] a = incString.toCharArray();

        for (int i=a.length-1;i>=0;i--){
         //   System.out.println(a[i]);
        }
    }

    // method to reverse the words of a given string
    static void reverseSentence(String incString){
        String[] s = incString.split(" ");
        String a="";
        for (int i=0;i< s.length;i++){
            a = s[i]+" "+a;
        }
        System.out.println("REVERSED SENTENCE =>\n");
        System.out.println(a);
    }


    static void reverseDecimalNum(Float incNum){
        String incNum1 = incNum.toString();
        int index = incNum1.indexOf(".");
        System.out.println(index);
        String dig = incNum1.replace(".","");
        System.out.println(dig);
        String n ="";
        for (int i =0;i<dig.length();i++){
            char c = dig.charAt(i);
            n = c +n;
        }
        System.out.println("reverse DIGIT ==>"+n);
        String op = n.substring(0,index)+"."+n.substring(index);
        System.out.println(op);



    }


   }



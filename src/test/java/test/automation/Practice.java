package test.automation;

import java.util.Arrays;

public class Practice {
    static char[] charCount = new char[256];

    public static void main(String[] args) {
        int[] arr = {21, 12, 45, 65, 23, 232};
        int digit = 2;
        int sum =44;
        String str = "geekforgeek";
        // call the method to find the first non repeating character in the given string
       // int index1 = firstNonRepeatingCharacter(str);

       // System.out.println(index1 == -1
          //      ? "none of the characters are non repeating" : "first non repeating character ==>" + str.charAt(index1));

        //findDigits(arr, digit);
        findSum(arr,sum);
        findSumPointers(arr,sum);
    }

    static void getCharCount(String incStr) {
        int len = incStr.length();
        // put the values in the CountcharArry
        for (int i = 0; i < len; i++) {
            charCount[incStr.charAt(i)]++;
        }
    }

    static int firstNonRepeatingCharacter(String incomingStr) {
        getCharCount(incomingStr);
        int index = -1;
        // iterate the incoming string and find the first element in charCount that has the value ==1
        for (int i = 0; i < incomingStr.length(); i++) {
            if (charCount[incomingStr.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }

    // wap to find all the 2's in the given int array
    static void findDigits(int[] incomingAr, int digit) {
        // logic to break a number into digits is number%10 followed by number/10 (int format)

        for (int i = 0; i < incomingAr.length; i++) {
            int countOfDigit = 0;
            int number = incomingAr[i];
            countOfDigit = breakNumber(number, digit);
            if (countOfDigit!=0)
            System.out.println("no. of target digit " + digit + "==>" + countOfDigit +"\t at index ==>"+i);
        }


    }

    static int breakNumber(int number, int target) {
        int counter = 0;
        while (number > 0) {
            int incDigit = number % 10;
            if (incDigit == target) {
                counter++;
            }
            number = number / 10;

        }
        return counter;

    }

    // method to find the sum of array elements = target
    static void findSum(int[] incArr, int sum){
        int size = incArr.length;
        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                if (incArr[i]+incArr[j]==sum){
                    System.out.println("PAIR ==>"+incArr[i] +incArr[j]);
                }
            }

        }


    }
    // method to find the pairs mathcing the sum we want with an efficient approach ..
    static void findSumPointers(int[] incArr, int Sum){
        int size = incArr.length;
        // sort the given array in ascending order
        Arrays.sort(incArr);
        int l=0, r=0;
        r = size -1;
        // traverse the array and check for the sum of the pairs as indicated by the left and right poitners
        for (int i=0;i<size;i++){

        }
        while (l<r){
            if (incArr[l]+incArr[r]==Sum){
                System.out.println("Pair ==>"+incArr[l]+"AND ==>"+incArr[r]);
                break;
            }
            else if (incArr[l]+incArr[r]>Sum){
                // decrement the right pointer
                r--;
            }else if (incArr[l]+incArr[r]<Sum){
                // increment the left pointer
                l++;
            }
        }











    }
}
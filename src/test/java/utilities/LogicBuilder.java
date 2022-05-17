package utilities;

import java.util.ArrayList;

public class LogicBuilder {
// program to count the array elements that divide the sum of all other elements

    public static void main(String[] args) {
        int sum=0;
        int aList[] = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> bList = new ArrayList<Integer>();
        for (int i : aList){
            System.out.println(" data in the array"+ i);
            // sum of all the elements =
            sum = sum + i;
        }
        System.out.println("sum = "+sum);
        // print the elements that completely divide the sum
        for (int i : aList){
            if (sum%i==0){
                System.out.println(" your value is "+ i);
            }
        }
        String date = dateFormat("15012021");
    }

    public static String dateFormat(String input){
        // write logic to convert the input string to required format
        String outPut="";


        return outPut;


    }
}// end of class
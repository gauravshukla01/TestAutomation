package test.automation;

public class ReverseArray {

    // write a program to reverse an array
    // ex: int[] input = new int[1,2,3] output shd be [3,2,1]
    public static void main(String[] args) {
        int [] input = {1,2,3,4,5,6};
        reverseArray(0,5,input);
        printArray(input);


    }
    static void reverseArray(int start, int end ,int[] inpAr){

        // break condition: till start<end
        if (start<end) {
            int temp = 0;
            temp = inpAr[start];
            inpAr[start] = inpAr[end];
            inpAr[end] = temp;

            reverseArray(start + 1, end - 1, inpAr);
        }

    }
    static void printArray(int[] incomingArr){
        // write the code to print the array:
        for (int i=0;i<incomingArr.length;i++){
            System.out.println("Reverse Array ==>"+incomingArr[i]);
        }

    }
}

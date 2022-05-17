package utilities;

public class ArrayManipulations {

   //static int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
   static int arr[] = {1,1,0,1,1,1,0,1,1,1,1};

    // write code to find all total number of consecutive 1's

    public static void main(String[] args) {
    findDigits(arr);
    }
    // method with the logic
    public static void findDigits(int[] incomingArray){
        int counter=0;
        // loop thru the array increment the counter when u find 1 and reset the counter when u en
        // encounter a 0
        for (int i=0;i<arr.length;i++) {
         if (arr[i] == 0) {
          counter = 0;
         } else {
          counter++;
         }

        } // loop for iterating the int array

     System.out.println("MAX consecutive ones = "+counter);
    }


}

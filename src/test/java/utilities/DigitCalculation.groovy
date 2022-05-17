package utilities;

public class DigitCalculation {
// code to find the total number of a certain digit that user can give in a given array
    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
    static int[] array_test =new int[] {21, 42, 55, 04, 21,22,554};

    static void main(String[] args) {
    //   System.out.println("Total number of 2's = "+ calculateDigit(array_test));
        int totalTargets=0;
        int target =4;
        for (int i =0;i<array_test.length;i++){
            System.out.println("COUNt OF digits for "+array_test[i]+ "  ==>"+countNoOfDigits(array_test[i],target));
            totalTargets = countNoOfDigits(array_test[i],target)+totalTargets;

        }
        System.out.println("TOTAL number of "+target+" =" +totalTargets);
    }
    static int calculateDigit(int[] incomingArray){
        // do the magic, iterate the int array and find the different digits in the array element
        int counter=0;
        for (int i=0; i < incomingArray.length;i++){
            int firstDigit = incomingArray[i]/10;
            int secondDigit = incomingArray[i]%10
            if (firstDigit==2){ counter++;}
            if (secondDigit==2){counter++;}
            System.out.println("first Digit ="+firstDigit + "   Second Digit = "+secondDigit);
        }
        return counter;
    }

    public static int countNoOfDigits(int number,int target){
        // write the code to find the total numbr of digits in the incoming integer value
        int counter=0;int lastDigit=0;int digit=0;

       while(number!=0){
           digit = number%10;
           number = number/10;

           if (digit==target){
               counter++;
           }

       }
        return counter;
    }

    static int breakTheNumber(int n){


    }
}

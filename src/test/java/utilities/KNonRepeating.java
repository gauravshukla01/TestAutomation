package utilities;
import java.util.Arrays;



public class KNonRepeating
{
    static int kthNonRepeating(String incomingStr,int number){
        int k=0;
        int MAX_CHARS = 256;
        // declare two arrays.. one for keeping the counts of characters and one for keeping the indexes of the string elements
        int[] count = new int[MAX_CHARS];
        int[] index = new int[MAX_CHARS];
        int len = incomingStr.length();
        for (int i =0;i<MAX_CHARS;i++){
            // initialize the count array to all 0s
          //  count[i]=0;
            index[i]= len;
        }

        // iterate thru the string and check for the character occurance
        for (int i=0;i<len;i++){
             char c = incomingStr.charAt(i);
            count[c]=count[c]+1;

            if (count[c]==1)
            index[incomingStr.charAt(i)]=i;

            if (count[c]==2)
                index[c]=len;


        }
    Arrays.sort(index);
        if (index[number-1]!=len){
            return index[number-1];
        }else return -1;

// (condition)?if part : else

    }

    // method for finding is the given string is in alphabetical order
    static boolean alphabetOrderCheckMethod(String incomingStr){
        boolean flagin = false;

        int len = incomingStr.length();
        for (int i=0;i<len-1;i++){
            if (incomingStr.charAt(i+1)<incomingStr.charAt(i)){
                return flagin;
            }
        }
        flagin = true;
        return flagin;

    }

    // driver program
    public static void main (String[] args)
    {
        String str = "geeksforgeeks";
        String str1 = "abcdefa";
        int k = 1;
        int res = kthNonRepeating(str, k);

        System.out.println(res == -1 ? "There are less than k non-repeating characters" :
                "k'th non-repeating character is  " + str.charAt(res));

       System.out.println("the input string ==> " +((alphabetOrderCheckMethod(str1))? "order is correct": "order is not correct"));
        // (condition) ? if : else
    }



}

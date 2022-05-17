package test.automation;

import io.cucumber.java.sl.In;

import java.util.*;

public class Scratch {

    public static void main(String[] args) {
        String str = "geekforgeek";
        // call the method to find the kth non repeating character
        int pos =1;
      int returnV = kNonRepeat(str,pos);
        int y = firstNonRepeating(str);
      System.out.println(returnV==-1 ? "there are less than "+pos+" repeating character"
                : "the kth repeating character ==>" +str.charAt(returnV));
    }

    static int kNonRepeat(String incomingStr,int position){

        int len = incomingStr.length();
        // count array will keep the count of times an alphabet occurs
        int[] count = new int[256];
        // index will keep the index of the character in the string
        int[] index = new int[256];

        // initialize both the abve arrays to 0
        for (int i=0;i<256;i++){
            count[i]=0;
            index[i]= len;
        }

        // iterate the incoming string and increment the counter by 1 whn the character is traverrsed
        for (int i=0;i<len;i++){
            char c = incomingStr.charAt(i);
            count[c]=count[c]+1;

            // if this is the first occurence then set the index array = char at i=c
            if (count[c]==1){
                index[c]=i;
            }

            // if the count[c] is greater than one that means that the character has been repeated more than once
            if (count[c]==2){
                index[c]=len;
            }

        }
        // sort the array in ascending order
        Arrays.sort(index);
        // read the incoming position and then return on basis of the value in the index array
       if (index[position-1]!=len){
           return index[position-1];
       }else return -1;



    }

    // method for finding the first non repeating character
    static int firstNonRepeating(String incomingStr){
        // this approch we will take using the hashmap, declare a hashmap hat has integer and character

        Map<Character,Integer> objMap = new HashMap<Character,Integer>();
        int len= incomingStr.length();
        // traverse the incoming string and insert the character and their occurance in the hashmap
        for (int i=0;i<len;i++){
            char c = incomingStr.charAt(i);
            if (!objMap.containsKey(c)){
                // if its the first occurance then enter the character with the value as 1
                objMap.put(c,1);
                }
            else {
                objMap.put(c,objMap.get(c)+1);
            }
        }
        // after this above loop the hashmap is populated with the keys and theur respective occurances
        // lets iterate the map and check out the values
        // logic for iterating a hashmap:
        Iterator itr = objMap.entrySet().iterator();
        while(itr.hasNext()) {

            Map.Entry mapElement
                    = (Map.Entry) itr.next();
            System.out.println("MAP KEYS = "+mapElement.getKey().toString());
            System.out.println("MAP VALUES = "+mapElement.getValue().toString());
        }
        // logic for finding the first

        return 0;
    }

    // static method to find the first non repeating character in a string using for loops

}

package utilities;

import com.google.errorprone.annotations.Var;

import java.util.HashMap;
import java.util.*;

public class RoughClass {

    public static void main(String[] args) {
        String test = "geekforgeeks";
        firstNonRepeatingCharacter(test);

    }
    static void firstNonRepeatingCharacter(String in){

        // write the logic to find the first non repeating character
        HashMap<Character,Integer> dataSet = new HashMap<Character,Integer>();
        // add the key as character of the given string and value as its occurence
        int counter =0;
        for (int i=0;i<in.length();i++){
            if (!dataSet.containsKey(in.charAt(i))){
                // if the character already exists then add the counter of its occurance
                dataSet.put(in.charAt(i),1);}

            else {
                //add the counter for the key
                 dataSet.put(in.charAt(i),dataSet.get(in.charAt(i))+1);
                }
            }

    firstHMIerate(dataSet);
       secondHMIterate(dataSet);
        // iterate the hashmap


        }

 static void firstHMIerate(HashMap hm){
        hm.forEach((k,v) -> System.out.println(k+":"+v));
 }


 static void secondHMIterate(HashMap hm){
        // iterate the hashmap with for loop
     Set entrySet = hm.entrySet();
     Iterator itr = entrySet.iterator();
     while ((itr.hasNext())){
         Map.Entry me =     (Map.Entry)itr.next();
         System.out.println("KEY" +me.getKey()+"VALUE = "+me.getValue());
     }


 }


    }// end of class


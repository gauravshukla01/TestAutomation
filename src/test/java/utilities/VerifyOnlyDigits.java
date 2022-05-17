package utilities;

public class VerifyOnlyDigits {

    // Write a program to check if the given string contains only digits.

    public static void main(String[] args) {
        String testString = "1234";
        boolean result;

        result = verifyStringForOnlyDigits(testString);
        System.out.println(result==false ? "String is alphanumberc" : "String contains only digit");

    }
    static boolean verifyStringForOnlyDigits(String incString){
        boolean flag = false;
        // logic to find out if the incoming string contains only digits:
        for (int i=0 ; i < incString.length();i ++){
            char t = incString.charAt(i);
            if(!(t<=57 && t>=48)){
                flag = false;
                return flag;
            }
        }
        flag = true;

        return flag;
    }
}

package test.automation;

public class ShiftingOfZeros {


    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int l = arr.length;
        shiftZerosToEnd(arr,l);
     //   reverseArray(arr,0,l-1);
     //printArray(arr);

    }

    static void shiftZerosToEnd(int[] art, int len){
        // traverse the array and if the element != 0 then let it be but if the
        // elemnt = 0 then?
        int count =0;
        for (int i=0;i<len;i++){
            if (art[i]!=0){
                art[count]=art[i];
                count++;
            }

        }
        System.out.println(count);
        while(count<len){
            art[count]=0;
            count++;
        }
        // iterate the intermediate array and print the elements
        for (int i=0;i<art.length;i++)
        {
            System.out.println("element = "+art[i]);
        }


    }

    static void reverseArray(int[] incArr, int start,int end){

        int temp=0;
        if (start>= end)
            return;
        temp = incArr[start];
        incArr[start]=incArr[end];
        incArr[end]=temp;
        reverseArray(incArr,start+1,end-1);

    }

    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

package RestAssuredAPITest;

public class OOPSConcepts {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.func();

    }
   }

class Test{
    static int a;
    static{
        a=5;
        System.out.println("I AM IN statci block");
        System.out.println("value of a = "+a);
    }

    Test(){
        System.out.println("I AM IN constructor block");
        a=10;
    }

    void func(){
        System.out.println("I AM IN method block");
        a = a+10;
        System.out.println("value of a ="+a);
    }
}
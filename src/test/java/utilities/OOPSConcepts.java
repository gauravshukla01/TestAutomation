package utilities;

public class OOPSConcepts {



}

class GFGTest {
    static int a=5;
    GFGTest(int x)
    {
        System.out.println("ONE argument constructor"+x);
    }

    GFGTest()
    {

        System.out.println("No  argument constructor"+a);
    }

    static
    {

        System.out.println("1st static init"+a);
    }

    {
        System.out.println("1st instance init");
    }

    {
        System.out.println("2nd instance init");
    }

    static
    {
    a=a+1;
        System.out.println("2nd static init" +a);
    }

    public static void main(String[] args)
    {
        new GFGTest();
        new GFGTest(a);
    }
}

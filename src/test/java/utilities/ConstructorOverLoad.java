
package utilities;

public class ConstructorOverLoad {
    public static void main(String[] args) {
        A a = new A();
        //a.iamAmethod();


        A a1 = new B();
        //a1.iamAmethod();
        B b = new B();
        b.iamAmethod();
        b.iamBmethod();
    }
} // end of public class
    class A {
        void iamAmethod(){
            System.out.println("Inside A class method");
        }
    } // end of class A

    class B extends A {

        void iamBmethod() {
            System.out.println("Inside B class method");
        }

        void iamAmethod(){
            System.out.println("Inside A method of class B");

        }
    } // end of class B


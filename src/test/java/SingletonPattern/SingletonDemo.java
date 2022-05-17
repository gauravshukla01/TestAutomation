package SingletonPattern;

public class SingletonDemo {

    public static void main(String[] args) {
        //cannot create an object of class since the constructor is private
        // SingleObject obj = new SingleObject();
        SingleObject.getInstance();

    }
}

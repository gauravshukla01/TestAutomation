package SingletonPattern;

public class SingleObject {

    private static SingleObject instance = new SingleObject();
    private SingleObject(){
        System.out.println("inside singletone constructor");
    }

    public static SingleObject getInstance(){
        return instance;
    }


}

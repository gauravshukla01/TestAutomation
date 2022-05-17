package utilities;

public class Animal {

    String name;
    Animal(String name){
        this.name = name;
        System.out.println("inside the overloaded constructor");
    }

    Animal(){
      this(randomName());
    }

    static String randomName(){
        int x = (int) (Math.random()*5);
        String t = new String[]{"gaurav","heman","gotime","raksha","titr"}[x];
        return t;

    }

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("first "+a.name);
        Animal b = new Animal("RATATA");
        System.out.println("SECOND "+b.name);
    }

}

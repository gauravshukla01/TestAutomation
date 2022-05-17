package practice;

public class Dog extends Animal{
    void makeNoise(){
        System.out.println("Make Dog noise");
    }
    void makeDogVoice(){
        System.out.println("GRRRRRRRR");
    }

    public static void main(String[] args) {
       Animal animal = new Animal();
       Animal a2 = new Dog();

       Dog d = new Dog();
       Dog d2 = (Dog)animal;

    }
}

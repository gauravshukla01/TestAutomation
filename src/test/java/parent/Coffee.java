package parent;


enum CoffeeSize{
    BIG(8),HUGE(10),OVERWHELMING(16);

    //constructor for enum

    CoffeeSize(int ounces){
        this.ounces = ounces;
    }
    private int ounces; // private instance variable
    // return method
    public int getOunces(){
        return ounces;
    }
};

public class Coffee {
    CoffeeSize cs;
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.cs = CoffeeSize.BIG;
    // iterate the values of the enum
        for (CoffeeSize f : CoffeeSize.values()){
            System.out.println("CS (NAME)= " +f.name());
            System.out.println("CS (SIZE) = " +f.getOunces());
        }



    }
}

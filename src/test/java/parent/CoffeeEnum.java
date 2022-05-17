package parent;


import java.util.function.DoubleToIntFunction;

  enum CoffeeSize1{
    BIG(8),HUGE(10),OVERWHELMING(16){
        public String getLidCode(){
            return "A";
        }
    };

    // private constructor
   private CoffeeSize1(int ounce){
        this.ounce = ounce;

    }
    private int ounce;
    private String lid;
    // return method to get the ounce
    public int getOunce(){
        return ounce;
    }
    public String getLidCode(){
        return "B";
    }
}

public class CoffeeEnum {


    public static void main(String[] t) {
        CoffeeEnum ce = new CoffeeEnum();
        for (CoffeeSize1 cs1 : CoffeeSize1.values()){

            System.out.println("COFFEE = " +cs1.name());
            System.out.println("COFFEE = " +cs1.getOunce());
            System.out.println("COFFEE = " +cs1.getLidCode());
        }
    }

}

package Ders3;

public class Volkswagen extends OOPCar {
    //Constructor methodu - YAPICI

    String sanziman ;

    public Volkswagen(String platenumber, int xlocation, int ylocation, int speed, String colour, String sanziman) {
        super(platenumber, xlocation, ylocation, speed, colour);
        this.sanziman = sanziman;
    }

    @Override
    public void park() {
        System.out.println("Volkswagen park eder");
    }
}

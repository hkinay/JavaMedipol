package Ders3;

public class Renault extends OOPCar{

    public String yil;
    public Renault(String platenumber, int xlocation, int ylocation, int speed, String colour, String yil) {
        super(platenumber, xlocation, ylocation, speed, colour);
        this.yil = yil;
    }

    public Renault() {
    }

    @Override
    public int accelerate(int acc) {
        return super.accelerate(acc);
    }
}

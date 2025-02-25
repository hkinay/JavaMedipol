package Ders3;

public abstract class OOPCar{

    public String platenumber;
    public int xlocation;
    public int ylocation;
    public int speed;
    public String colour;

    public OOPCar(String platenumber, int xlocation, int ylocation, int speed, String colour) {
        this.platenumber = platenumber;
        this.xlocation = xlocation;
        this.ylocation = ylocation;
        this.speed = speed;
        this.colour = colour;
    }

    public OOPCar(){

    }

    public void move(){
        System.out.println("Araba hareket eder");
    }


    public void park(){
        System.out.println("Araba park eder");
    }






    public int accelerate(int acc){
        int acc_ = acc;

        return acc_;


    }

}

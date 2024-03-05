package Ders3;

public abstract class OOPCar{

    public String platenumber;
    public int xlocation;
    public int ylocation;
    public int speed;



    public OOPCar(String platenumber, int xlocation, int ylocation, int speed) {
        this.platenumber = platenumber;
        this.xlocation = xlocation;
        this.ylocation = ylocation;
        this.speed = speed;
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

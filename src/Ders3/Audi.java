package Ders3;

public class Audi extends OOPCar{

private String renk;
private String lastik;

    public String getLastik() {
        return lastik;
    }

    public void setLastik(String lastik) {
        this.lastik = lastik;
    }

    public Audi(String platenumber, int xlocation, int ylocation, int speed, String renka) {
        super(platenumber, xlocation, ylocation, speed);
        this.renk = renka;


    }

    @Override
    public void move() {
        System.out.println("Audi hareket ediyor.");
    }



    @Override
    public int accelerate(int acc) {

        acc = acc * 2;

        return super.accelerate(acc);
    }

    public int accelerate(int acc, int bcc){
        return acc * bcc ;
    }


    public void bilgiGoster(){

        System.out.println(platenumber+" " + xlocation+ " " + ylocation + " " + speed + " " + renk);
    }

}

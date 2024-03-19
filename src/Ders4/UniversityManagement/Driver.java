package Ders4.UniversityManagement;

public class Driver {

    public static void main(String[] args) {
        Academic academic = new Academic("Ahmet",12,"1985",10,"Aşçılık","Doçent");

        System.out.println(academic.id);
        System.out.println(academic.maasAlma(40000));

        Staff staff = new AdminManagement("Hasan",34,"1999",5,"Mali İşler");

        int i = staff.maasAlma(1000);
        System.out.println(staff.id + " numaralı çalışanın maaşı " + i);

        Staff staff2 = new Academic("Jale",35,"2000",4,"Bilgisayar Mühendisliği","Araş. Gör");



        int k = staff2.maasAlma(1000);
        System.out.println(staff2.id + " numaralı çalışanın maaşı " + k);
    }


}

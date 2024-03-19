package Ders4.UniversityManagement;

public abstract class Staff {

    public String isimsoyisim;
    public int id;

    public String dtarihi;
    public int kidemyili;

    public Staff(String isimsoyisim, int id, String dtarihi, int kidemyili) {
        this.isimsoyisim = isimsoyisim;
        this.id = id;
        this.dtarihi = dtarihi;
        this.kidemyili = kidemyili;
    }

    public int maasAlma(int maas){
        int artis = kidemyili + 500;
        maas = maas + artis;
        return maas;


    }


}

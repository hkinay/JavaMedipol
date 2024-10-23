package Ders4.UniversityManagement;

public class IdariPersonel extends Staff{
    private final String departman;

    public String getDepartman() {
        return departman;
    }

    public int getSifre() {
        return sifre;
    }

    protected int sifre;

    public IdariPersonel(String isimsoyisim, String telefon, String mailadres, double maas, boolean sozlesme, int kidem, String departman) {
        super(isimsoyisim, telefon, mailadres, maas, sozlesme, kidem);
        this.departman = departman;
    }


    @Override
    public int maasAlma(int maas) {
        return super.maasAlma(maas) + 2000;
        
    }
}

package Ders4.UniversityManagement;

public class Rector extends IdariPersonel {


    public Rector(String isimsoyisim, String telefon, String mailadres, double maas, boolean sozlesme, int kidem, String departman) {
        super(isimsoyisim, telefon, mailadres, maas, sozlesme, kidem, departman);
    }

    @Override
    public int maasAlma(int maas) {
        return super.maasAlma(maas) + 50000;
        
    }
}

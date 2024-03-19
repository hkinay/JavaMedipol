package Ders4.UniversityManagement;

public class Rector extends AdminManagement{
    
    
    public Rector(String isimsoyisim, int id, String dtarihi, int kidemyili, String daire) {
        super(isimsoyisim, id, dtarihi, kidemyili, daire);
    }

    @Override
    public int maasAlma(int maas) {
        return super.maasAlma(maas) + 50000;
        
    }
}

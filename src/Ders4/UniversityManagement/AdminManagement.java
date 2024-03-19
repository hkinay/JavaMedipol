package Ders4.UniversityManagement;

public class AdminManagement extends Staff{
    private final String daire;

    protected int sifre;
    
    public AdminManagement(String isimsoyisim, int id, String dtarihi, int kidemyili,String daire) {
        super(isimsoyisim, id, dtarihi, kidemyili);
        this.daire = daire;
    }

    @Override
    public int maasAlma(int maas) {
        return super.maasAlma(maas) + 2000;
        
    }
}

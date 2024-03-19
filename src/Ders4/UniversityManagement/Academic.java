package Ders4.UniversityManagement;

public class Academic extends Staff{
    private String bolum;
    private String titre;
    public Academic(String isimsoyisim, int id, String dtarihi, int kidemyili,String bolum, String titre) {
        super(isimsoyisim, id, dtarihi, kidemyili);
        this.titre = titre;
        this.bolum = bolum;
    }

    @Override
    public int maasAlma(int maas) {
        int yenimaas = super.maasAlma(maas) + 5000;
        return yenimaas;
    }
}

package Ders4.UniversityManagement;

public class Academic extends Staff{
    private String bolum;
    private String titre;

    public Academic(String isimsoyisim, String telefon, String mailadres, double maas, boolean sozlesme, int kidem, String bolum, String titre) {


        super(isimsoyisim, telefon, mailadres, maas, sozlesme, kidem);
        this.bolum = bolum;
        this.titre = titre;
    }


    @Override
    public int maasAlma(int maas) {
        int yenimaas = super.maasAlma(maas) + 5000;
        return yenimaas;
    }

    public void bilgilerigoster(){
        System.out.println("------------Personelin Kısa Bilgisi-----------");
        System.out.println("İsim: " + getIsimsoyisim());
        System.out.println("Mail Adres: " + getMailadres());
        System.out.println("Maaş: " + getMaas());
    }
}

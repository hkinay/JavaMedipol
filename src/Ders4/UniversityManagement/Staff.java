package Ders4.UniversityManagement;

public abstract class Staff {
/*

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
*/
    private String isimsoyisim;
    private String telefon;
    private String mailadres;
    private double maas;
    public boolean sozlesme;
    public int kidem;

    public Staff(String isimsoyisim, String telefon, String mailadres, double maas, boolean sozlesme, int kidem) {
        this.isimsoyisim = isimsoyisim;
        this.telefon = telefon;
        this.mailadres = mailadres;
        this.maas = maas;
        this.sozlesme = sozlesme;
        this.kidem = kidem;
    }

    public String getIsimsoyisim() {
        return isimsoyisim;
    }

    public void setIsimsoyisim(String isimsoyisim) {
        this.isimsoyisim = isimsoyisim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMailadres() {
        return mailadres;
    }

    public void setMailadres(String mailadres) {
        this.mailadres = mailadres;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }


    public boolean ServisKullanimi (boolean a){
        if (a==true){
            return a;

        }
        else{
            return false;
        }


    }
    public int maasAlma(int maas){
        int artis = kidem * 500;
        maas = maas + artis;
        return maas;}

    public void İzinKullan(){
        System.out.println("İzin kullanıyor..");
    }
}

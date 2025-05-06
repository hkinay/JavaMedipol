package Ders10.JavaDers10;

public class Ogrenciler {
    private int id;
    private String ad;
    private String soyad;
    private String email;

    public Ogrenciler(int id, String ad, String soyad, String email) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Ogrenciler(int id, String ad, String soyad) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
         }

    public Ogrenciler( String ad, String soyad, String email) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
    }

}

package Ders12;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Urun implements Externalizable {

    private static final long serialVersionUID = 1;

    private String urunKod;
    private  transient double fiyat ;

    private String ad;

    private String aciklama;

    public Urun(String urunKod, double fiyat, String ad, String aciklama) {
        this.urunKod = urunKod;
        this.fiyat = fiyat;
        this.ad = ad;
        this.aciklama = aciklama;
    }

    public Urun() {
        System.out.println("No-arg constructor çağrıldı");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Urunle ilgili çağrılmak istenenler");

        out.writeUTF(urunKod);
        out.writeUTF(ad);
        out.writeUTF(aciklama);
        out.writeDouble(fiyat);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        this.urunKod = in.readUTF();
        this.ad = in.readUTF();
        this.aciklama = in.readUTF();
        this.fiyat = in.readDouble();


    }
}

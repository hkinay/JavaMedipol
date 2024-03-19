package Ders5.DI;

public class TurkTelekomSmsProvider implements SmsProvider{
    @Override
    public void smsGonder(String mesaj) {
        System.out.println("Türk Telekom ile mesaj gönderiliyor " + mesaj);


    }
}

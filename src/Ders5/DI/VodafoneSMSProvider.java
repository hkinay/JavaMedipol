package Ders5.DI;

public class VodafoneSMSProvider implements SmsProvider{
    @Override
    public void smsGonder(String mesaj) {
        System.out.println("Vodafone ile mesaj gönderiliyor " + mesaj );
    }
}

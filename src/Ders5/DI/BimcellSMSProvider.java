package Ders5.DI;

public class BimcellSMSProvider implements SmsProvider{
    @Override
    public void smsGonder(String mesaj) {
        System.out.println(mesaj  + "Bu mesaj BİMCELL ile gönderildi");
    }
}

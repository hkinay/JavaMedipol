package Ders5.DI;

public class PTTCellSMSProvider implements SmsProvider{
    @Override
    public void smsGonder(String mesaj) {
        System.out.println("PTTCell ile gönderiliyor" + mesaj);
    }
}

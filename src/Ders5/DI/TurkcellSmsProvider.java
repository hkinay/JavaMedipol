package Ders5.DI;

public class TurkcellSmsProvider implements SmsProvider{
    @Override
    public void smsGonder(String mesaj) {
        System.out.println("Turkcell ile mesaj gonderiliyor " + mesaj);    }
}

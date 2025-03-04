package Ders5.DI;

public class AsmsProvider implements SmsProvider{
    @Override
    public void smsGonder(String mesaj) {

        System.out.println("ACell" + mesaj);

            }
}

package Ders5.DI;

public class SmsService {
    private SmsProvider smsProvider;

    public SmsService(SmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    //dependency injection
    public void smsGonder (String mesaj){



        smsProvider.smsGonder(mesaj);
    }
}

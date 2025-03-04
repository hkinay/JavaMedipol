package Ders4.UniversityManagement;

import javax.swing.text.rtf.RTFEditorKit;

public class Driver {

    public static void main(String[] args) {




       /* IdariPersonel m1 = new IdariPersonel("Ahmet Kaplan","34243232","a@a.com",14.5,true,2,"myo");


        System.out.println(m1.getIsimsoyisim());

        Academic a1 = new Academic("Mehmet Ali","3432423","k@k.com",34,false,3,"CENG","Prof.");


        a1.maasAlma(4000);

        System.out.println();

        a1.bilgilerigoster();

        Rector r1 = (Rector) new IdariPersonel("Ali Veli","453534","m@m.com",345.5,true,3,"Rektör");


        r1.getDepartman();*/
/*
       OnlisansOgrenci onlisansOgrenci = new OnlisansOgrenci("Ayşe",232,"34342","10.10.2020");

        onlisansOgrenci.bilgiGoster();*/


        AcikOgretimOgrenci acikOgretimOgrenci = new AcikOgretimOgrenci("Mehmet",1001,"YBS",1.5f,32);
        acikOgretimOgrenci.bilgiGoster();
        acikOgretimOgrenci.dersAlma();



}}

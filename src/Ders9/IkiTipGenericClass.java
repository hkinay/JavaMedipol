package Ders9;

import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;

public class IkiTipGenericClass <A,D>{
    private Dictionary<A,D> sozluk = new Hashtable<>();

    public void AddDict (A key, D value){
        this.sozluk.put(key,value);
    }

    public D getDict (A key){
        return this.sozluk.get(key);
    }
}

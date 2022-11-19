package day30collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        //Hash bir tekniktir, birbirine benzemeyen code lar uretir bu code lar datayi unique(essiz) yap ar.
        //Set lere coklu ama tekrarsiz data depolamak istedigimizde ihtiyac duyariz.(Ogrenci numaralari gibi )
        //HashSet ler eklenen elemanlarin siralamasi ile ugrasmaz.Siralama ile alakali zaman harcamaz bu yuzden cok hizli calisir
        //HashSetler index kullanmazlar.Cunku siralama rastgele yapildigi icin index manali olmaz
        /*
        HashSetler:
        1)tekrarsiz elemanlarda
        2)sıralama onemli degilse
        3)hız cok önemliyse
        4)indeks kullanmazlar
        */

        HashSet<String> emails= new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricat, Orange ]

        //Var olan elemani eklerseniz hata vermez , son ekleneni var olan datanin ustune yazar.(overwrite=ustune yazma)
        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricat, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[Null, Apple, Fig, Mango, Apricat, Orange]

        //clear() methodu bir collectiondaki tum elemanlari silmek icin kullanilir

    }
}

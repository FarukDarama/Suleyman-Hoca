package day30collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
      /*
        //Hash bir tekniktir,birbirine benzemeyen kodlar  üretir bu kodlar datayi unique yapar.
        //Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(Oğrenci numaraları gibi)
        HashSet eklenen elemanların sıralaması ile ugrasmaz.Sıra ile alakalı zaman harcamaz bu yuzden cok hızlı calısır.
        hız onemli sıralama onemsiz ise HashSet kullanılır.
        HashSet ler index kullanmazlar cunku sıralama rastgele yaıldıgı ıcın index manali olmaz
        HashSetler:
         1)tekrarsiz elemanlarda
         2)sırlama onemli degilse
         3)hız cok önemliyse
         4)İndeks kullanmazlar




        */

        HashSet<String> emails = new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");

        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange] rastgele sılralama yapti
        //Varolan elemani eklerseniz hata vermez son ekleneni varolan datanı uzerine yazar.(Overwrite)
        emails.add("Mango");
        System.out.println(emails);
        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);


    }
}

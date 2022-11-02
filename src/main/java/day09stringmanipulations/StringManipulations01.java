package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str ="Java is easy";
       int idxA1= str.indexOf("a");
        System.out.println("idxA = " + idxA1);
     // verilen karakter veya karakterlerin ilk görünümünün indexini verir.
     // lastIndexOf () methodu
       int idxA2 = str.lastIndexOf("a");
        System.out.println("idxA2 = " + idxA2);

        String s="Mississippi";
       int idxI= s.indexOf('i');// hem string hem de char ile kullanılabilir.u
        System.out.println("idxI = " + idxI);
     int idxIss1 =   s.indexOf("iss");
        System.out.println("idxIss1 = " + idxIss1);
     int idxIss2 =  s.lastIndexOf("iss");
        System.out.println("idxIss2 = " + idxIss2);
        // Example 1. Bir stringdeki bir karakterin tekrarlı veya  tekrarsız olup olmadıgını gösteren kodu
        // yazın.

        // Helloooo ==> h tekrarsız e tekrarsız l tekrarlı o tekrarlı
        // indexof ile lastindexof aynı ise o karakter tekrarsız farklı ise tekrarlı

      String t="Helloooo";
      char c='o';

      if (t.indexOf(c)==t.lastIndexOf(c)){
          System.out.println("Tekrarsız");
      }else {
          System.out.println("Tekrarlı");
          //index of iki parametre ile kullanılırsa ikinci paarametrede verilen sayı kadar karakteri gectikten sonra
          // istenen karaklterin ilk görünümünün index ini return eder
      }
      String u ="Learn Java earn money";
      int sonuc= u.indexOf(" ",6);//ilk 6 karakterden  sonraki index i bana ver demek
        String m="Hello everyone";
        //last index of iki parametre ile kullanılırsa ikinci para metrede verilen sayıyıindex olarak kabul edip  bu index e kadar
        //ol karakterleri bir kutu içine alınız ve lastIndexOf methodunu sadece bu kutu şçşndeki String için kullanılız
       int e= m.lastIndexOf("e",10);
        System.out.println("e = " + e);
      String v = " ";
      boolean BosMu = v.isEmpty();// Bir string in bos olup olmadıgını kontrol eder eger karakter yoksa true return eder.
        // herhangi bir karakter varsa false return eder.
        System.out.println("BosMu = " + BosMu);

        String x="       ";
        boolean blankMi= x.isBlank();// hem bos string icin hemde sadece space iceren stringler için true return eder
        System.out.println("blankMi = " + blankMi);
        // Example 2. Kullanıcıdan alınan isim en az bir karakter içermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi girin...");
        String ilk = input.nextLine();
        if (ilk.isBlank()){
            System.out.println("sana ismini gir dedim...");
        }else {
            System.out.println(ilk);
        }








    }
}

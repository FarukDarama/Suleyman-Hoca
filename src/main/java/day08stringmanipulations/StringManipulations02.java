package day08stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        // Examole 1: Bir stringdeki space hariç kac karacter kullanıldıgını gösteren kodu yazdırın.
        //"Ali okula gitti."
         String str ="Ali okula gitti.";
       int num = str.replace(" ","").length();
        System.out.println("num = " + num);
        // replace () methodu bir stringdeki herhangir characteri veya characterleri degiştimek için kullanılır.
        // Example 2. Bir Strindeki tüm a harflerini buyuk A ya cevirin
        String s ="Ankara'nin tasina gozlerimin yasina bak.";
        String s1 =  s.replace("a","A");
        System.out.println("s1 = " + s1);// AnkArA'nin tAsinA gozlerimin yAsinA bAk.
        // Example 3. Bir stringdeki tüm  "kara" kelimesinin yerine "*" koyunuz
        String t="Kara kara dusunme Ankara";
        String tYeni =  t.replace("kara","*");
        System.out.println("tYeni = " + tYeni);
        // Example 4. Bir Strindeki tüm sayıları * a ceverin.
         String stdId ="AC202117004";
         String yeniStdId=stdId.replaceAll("[0-9]","*");
        System.out.println("yeniStdId = " + yeniStdId);
        /*
    Bir grup data'yı ifade eden kodlara "Regex" denir.
    "Regex" Regular Expressions'in kısaltılmış halidir.

    1)Tüm rakamlar ==> [0-9]
    2)Tüm küçük harfler ==> [a-z]
    3)Tüm büyük harfler ==> [A-Z]
    4)Tüm harfler ==> [a-zA-Z]
    5)Sesli hardler ==> [aeiouAEIOU]
    6)Space ==> [ ]
    7)Tüm rakamlar ve tüm harfler ==>[0-9a-zA-Z]
    8)Tüm noktalama işaretleri ==>\\p{Punct}

    1)Rakamlar hariç tüm karakterler ==> [^0-9]
    2)Kucuk harfler hariç tüm karakterler ==> [^a-z]
    3)Buyuk harfler haric tüm karakterler ==> [^A-Z]
    4)Tum harfler haric tum karakterler ==> [^a-zA-Z]
    5)Space hariç ==>[^ ]
 */
       // Example 5. Verieln bir String de kullanılan  noktalama işartei,rakamlar ve space hariç
        // tüm karakterlin sayısını bulun
        String u = "Ali 13 yasinda , dersem inanma!...";
      int sonuc =  u.
              replaceAll("[0-9]","").
              replace(" ","").
              replaceAll("\\p{Punct}","").
              length();
        System.out.println("sonuc = " + sonuc);
        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //   i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli
        String pwd ="B78c? K!m";
       boolean first = pwd.replace(" ","").length()>7;
       boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;
       boolean third = pwd.replaceAll("[^0-9]","").length()>0;
       boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;
       boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

      boolean pwdGecerli = first && second && third && fourth && fifth ;

      if (pwdGecerli){
          System.out.println("Passwordunuz gecerli");
      }else {
          System.out.println("Passwordunuz gecerli degil.");
      }
     // Example 7. Bir Stringdeki noktalama işaretelerin  sayısını gosteren kodu yazınız

        String cumle = "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak ?...";
      int number = cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number);

       // Example 8. Verilen bir String Al ile baslıyor ve x ile bitiyorsa ekrana harika yazdırın
        // aksi durumda normal yazdırın.
        String v ="Alex";
       boolean baslangıc =  v.startsWith("Al");
       boolean bitis = v.endsWith("x");
       String result = baslangıc && bitis ?"Harika" : "Normal";
        System.out.println("result = " + result);




    }
}

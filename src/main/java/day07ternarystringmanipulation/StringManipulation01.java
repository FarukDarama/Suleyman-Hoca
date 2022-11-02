package day07ternarystringmanipulation;

public class StringManipulation01 {
    public static void main(String[] args) {
    /*            String Class Methodları
    1) equals() : Iki tane String'in aynı olup olmadıgını anlamamıza yarar.
       equals () methodu "boolean" return eder.
    2) equalsIgnoreCase () : Iki tane String in aynı olup olmadıgını buyuk harf kucuk harfe dikkat
       etmeden anlamamıza yarar.
       * boolean return eder.
     3) toLowerCase() : Bir Strindeki tüm harfleri kucuk harfe cevirmek için kullanılır
       *String return eder.
     4) toUpperCase() : Bir Strindeki tüm harfleri buyuk harfe cevirmek için kullanılır
       *String return eder.
     5) charAt(): Belli bir index deki characteri almak için kullanılır.
       * char return eder.
     6) length () : Bir String de kac tane character kullanıldıgını ogrenmek icin kullanılır.
       * int return eder.
     7) contains (): Bir Stringde belli bir characterin veya characterlerin var olup olmadıgını anlamak
       için kyllanılır.
       * boolean return eder.
     8) split () : Bir String i istedigimiz character den parcalamaya yarar.
       * Array return eder
     */
      /*
      Bir password un gecerli olup olmadıgını asagıdaki kurallara gore kontrol eden kodu yazınız.
      i) en az 8  character icermemeli
      ii) space icermemeli
      İİİ) ilk harfi "M"  veya "m" olmalı
      iiii) son characteri ? olmalı
       */

   String pwd = "manisa12X";
   boolean first  = pwd.length()>7;
   boolean second = !pwd.contains(" ");
   boolean third  = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';
   boolean fourth = pwd.charAt(pwd.length()-1) == '?';
   System.out.println(first && second && third && fourth);

    }
}

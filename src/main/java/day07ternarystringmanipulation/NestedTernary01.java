package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        Verilen yılın leap year (artık yıl) olup olmadıgını kontrol eden kodu yazınız.
        i) yıl 100 e bölünürse 400 e de bölünmelidir ==> 1600 + 1800-
        ii) yıl 100 e bölünmezse 4 e bölünmelidir ==>1996+ 2001-
         */
        int year =1996;
        String sonuc= year%100==0 ? (year%400==0 ? "Leap Year" : "Leap Year degil") : (year%4==0 ? "Leap Year": "Leap Year degil");

        System.out.println("sonuc = " + sonuc);
        /*
        Asagıdaki kurallara göre password un geccerli olup olmadıgını
        kontrol edem kodu yazınız
        1.)  8 karakterden fazla veya 8  karakter varsa ilk harfi kücük i olmalıdır
        2)   8 den az karakterli ise ilk harfi K olmalıdır
         */

        String pwd = "K2a3";
        char ilkHarf =pwd.charAt(0);
        String gecerli =pwd.length()<8 ? (ilkHarf=='K' ? "Gecerli" : "Gecersiz"):(ilkHarf=='i' ? "Gecerli" : "Gecersiz");
        System.out.println(gecerli);

    }
}

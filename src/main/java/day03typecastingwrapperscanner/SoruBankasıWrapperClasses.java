package day03typecastingwrapperscanner;

public class SoruBankasıWrapperClasses {
    public static void main(String[] args) {
        // Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin
        // toplamını bulmak için bir kod yazınız.
        // 1. Soru
     int min = Byte.MIN_VALUE;
     int max = Short.MAX_VALUE;
     int toplam =min+max;
        System.out.println(toplam);
       // 2. Soru
     String a ="103";
     byte newA=Byte.valueOf(a);
     String b = "2351";
     short newB=Short.valueOf(b);
        System.out.println(newB-newA);
       // 4. Soru
        String sehir= "AdANA";
        String konsolSehir=sehir.trim().toLowerCase();
      konsolSehir=konsolSehir.substring(0,1).toUpperCase() + konsolSehir.substring(1) ;
        System.out.println(konsolSehir);
       //5. Soru
       String x ="Ali Can";
       String y = "Merve Star";
       String z = "Mark Tom";
       String newx =x.replace(" ","");
       String newy =y.replace(" ","");
       String newz =z.replace(" ","");
       int xUzunluk=newx.length();
       int yUzunluk=newy.length();
       int zUzunluk=newz.length();
       int toplamHarf= xUzunluk+yUzunluk+zUzunluk;
       System.out.println(toplamHarf);




    }
}

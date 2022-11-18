package day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        double r1 = compareNumOfCharacters("Java", "xy");
        System.out.println("r1 = " + r1);


    }
    //Verilen iki Stringden birinin karakter sayisinın diğeririnin kac katı oldugunu veren methot olusturunuz

    public static double compareNumOfCharacters(String s, String t) {
        double result = 0;
        try {
            result = s.length() / t.length();
        } catch (NullPointerException e) {
            System.out.println("length() methodu null ile kullanılmaz");
        } catch (ArithmeticException e) {
            System.out.println("Herahngi bir sayi 0 ile bölünemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        }

        return result;
    }
    /*final, finally, finalize acıklayınız.
    1) final: bir key word dur.variable class ve methodlar ıcın kullanılır.
    2) finally: Bir code blogudur.
      try catch veya sadece try ile kullanılır.
      finalley code block ıcıne yazılan codeler her halukarda calısır.
      mesela  database ile connection ı kesmek yağılması gereken bir fiildir bunu finally ile yapabiliriz.
    3) finalize:Bir methoddur bu method java tarafından datalar imha edilmeden önce cagrılır,bu  method
      dataları imha edilecek hale getirir ve daha sonra "Garbage Collector" bu datalari imha eder.
       finalize methoduunu java developerlarda cagırabilir ama java kendi bildigini yapar.
     */





}



package day11loops;

import java.io.StringReader;

public class ForLoop01 {
    public static void main(String[] args) {
        //Example 1 : 3 den 6 ya kadar tam sayıların toplamını bulan kodu yazınız
        int sum =0;
        for (int i=3;i<7;i++){
           sum = sum+i;
        }
        // sout loop un dısına yazılırsa sadece sum ın  son degerini ekrana yazdırır.
        // loop un içine yazılırsa her bir loop için sum in hangi degerlerini aldıgını yazdırır.
        System.out.println(sum);
        //Example 2 : 6 dan 3 e kadar tam sayıların carpımını yazın
        int multiply =1;
        for (int i=6;i>2;i--){
          multiply = multiply*i;
        }
        System.out.println(multiply);
        //Example 3 : Size verilen tam  sayının rakamaları toplamını bulunuz
       int sonuc = 0;
       int num =385;
        num = Math.abs(num);
       for (int i=385;i>0 ;i=i/10){
        sonuc = sonuc + i%10;
       }
        System.out.println(sonuc);
       // Example 4 : Size verilen bir stringi ekrana ters ceviren kodu yazınız.
        String str = "Kaba";
        //Concatenation yapacaksaniz empty String ("") kullanin
        String ters ="";

        for (int i =str.length()-1;i>-1;i--){
            char c = str.charAt(i);
          ters = ters+c;

        }
        System.out.println(ters);




    }
}

package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
       // 8. Soru
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen saat giriniz");
        byte saat = input.nextByte();
        long saniye = saat*60*60;
        System.out.println(saat+" saat "+saniye+" saniye eder");
       // 9. Soru
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Adınızı Giriniz");
        String ad = scan.nextLine();
        System.out.println("Lütfen Soyadınızı Giriniz");
        String soyAd = scan.nextLine();
        System.out.println("Ad Soyad: "+ ad +" " +soyAd);


    }
}

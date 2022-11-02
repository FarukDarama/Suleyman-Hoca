package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
       // 1. Soru
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen karenin kenarini giriniz");
        int kenar = input.nextInt();
        System.out.println("Alan:"+(kenar*kenar));
        System.out.println("Cevre: "+ (4*kenar));
        // 2. Soru
        Scanner inputsayi = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = inputsayi.nextInt();
        System.out.println("Sayini Küpü: "+ (sayi*sayi*sayi));
        // 3. Soru
        Scanner dikDortgen = new Scanner(System.in);
        System.out.println("Dikdörtgenin uzun ve kısa kenarını giriniz");
        int uzun = dikDortgen.nextInt();
        int kisa = dikDortgen.nextInt();
        System.out.println("Alan: "+ (uzun*kisa));
        System.out.println("Cevre: "+2*(uzun+kisa));

    }
}

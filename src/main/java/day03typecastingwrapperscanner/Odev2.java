package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        // 4. Soru
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen eni giriniz");
        int en = input.nextInt();
        System.out.println("Lütfen boyu giriniz");
        int boy = input.nextInt();
        System.out.println("Lütfen yüksekligi giriniz");
        int yukseklik = input.nextInt();
        System.out.println("Küp'ün Hacmi: "+(en*boy*yukseklik));
        // 5. Soru
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yarıcap'i giriniz");
        float yariCap = scan.nextFloat();
        float pi = 3.14f;
        float alan = pi*yariCap*yariCap;
        float cevre = 2*pi*yariCap ;
        System.out.println("Daire'nin Alani: "+ alan);
        System.out.println("Daire'nin Cevresi: "+ cevre);

    }
}

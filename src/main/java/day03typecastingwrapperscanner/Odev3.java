package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        // 6. Soru
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarını giriniz");
        byte k1 = input.nextByte();
        byte k2 = input.nextByte();
        byte k3 = input.nextByte();
        System.out.println("Ucgenin cevresi: "+(k1+k2+k3));
        // 7. Soru
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mil mesafesini giriniz");
        double mil = scan.nextDouble();
        System.out.println(mil+" mil "+(mil*1.6)+" km eder");

    }
}

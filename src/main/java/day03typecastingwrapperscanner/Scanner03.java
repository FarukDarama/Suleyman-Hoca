package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        // Kullanıcıdan bir diktörtgenin en ve boyunu alıp alan ve cevre
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kısa  ve uzun kenarını giriniz");
        int en = input.nextInt();
        int boy = input.nextInt();
        System.out.println("Cevre: " + 2*(en+boy));
        System.out.println("Alan: "+ en*boy);



    }
}

package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        // 1.Yol
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun = input.next();
        if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta ici");
        } else if (gun.equalsIgnoreCase("Salı")) {
            System.out.println("Hafta ici");

        } else if (gun.equalsIgnoreCase("Carsamba")) {
            System.out.println("Hafta ici");

        } else if (gun.equalsIgnoreCase("Persembe")) {
            System.out.println("Hafta ici");

        } else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici");

        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu");

        } else if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta sonu");

        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }
        // 2.Yol
        if (gun.equalsIgnoreCase("Pazar")||gun.equals("Cumartesi")){
            System.out.println("Hafta sonu");
        } else if (gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Salı") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")) {
        }else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }
        // 3.Yol
      boolean haftaSonu=  gun.equalsIgnoreCase("Pazar")||gun.equals("Cumartesi");

      boolean haftaIci=   gun.equalsIgnoreCase("Pazartesi") ||
                          gun.equalsIgnoreCase("Salı") ||
                          gun.equalsIgnoreCase("Carsamba") ||
                          gun.equalsIgnoreCase("Persembe") ||
                          gun.equalsIgnoreCase("Cuma");
        if (haftaSonu) {
            System.out.println("Hafta sonu");
        } else if (haftaIci) {
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }

    }
}

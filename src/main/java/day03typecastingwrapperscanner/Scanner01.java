package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Kullanıcıdan data almaya yarar.Scanner kullanıcı ile etkileşim kurmamızı saglar.
        // Scanner bir java calssıdır, bu class'ı kullanabilmek için import etmek geekir.

        // Kullabıcıdan data almak için yapılması gerekenler
        // 1. Adım : Scanner  Classından object oluşturun.
        Scanner input = new Scanner(System.in);
        // 2. Adım : Kullanıcıya ne yapacagını soyle
        System.out.println("Hey kullanıcı yasını gir");
        //3. Adım: Kullaınıcıdan aldıgınız datayı bir variablein icine koyun
        byte age = input.nextByte();
        System.out.println("Hey kullanıcı senin yasın "+ age);






    }
}

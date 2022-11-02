package day05ifstatement;

import java.util.Scanner;

public class IfStatementSoruBankası {
    public static void main(String[] args) {
        // 1.Soru

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz");
        String ay = scan.next().toLowerCase();
        if (ay.equals("aralık")||ay.equals("ocak")||ay.equals("subat")){
            System.out.println("Kış");
        } else if (ay.equals("mart")||ay.equals("nisan")||ay.equals("mayis")) {
            System.out.println("Ilkbahar");

        } else if (ay.equals("haziran")||ay.equals("temmuz")||ay.equals("agustos")) {
            System.out.println("Yaz");

        } else if (ay.equals("eylul")||ay.equals("ekim")||ay.equals("kasim")) {
            System.out.println("Kış");

        }else {
            System.out.println("Geçersiz ay");
        }
        // 2. Soru (Çözemedim Sor)

        /*String pwd ="as df gh3456";
        if (pwd.replaceAll("\\S","").length()>0){
            System.out.println("Sifrede bosluk karakteri kullanmayınız");
        } else if (pwd.replaceAll("\\s","").length()>=8) {
            System.out.println("Geçerli Şifre");

        }else {
            System.out.println("Geçersiz Şifre");
        }*/

       // 4. Soru
        Scanner scan1=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı giriniz");
        int sayi=scan1.nextInt();
        if (sayi%10>=5){
            System.out.println("Son basamağı bir üst ondalığa yuvarla: " + (sayi/10+1)*10);
        } else {
            System.out.println("Son basamağı bir alt ondalığa yuvarla: "+(sayi/10)*10);
        }
        // 6.Soru

        Scanner scan2=new Scanner(System.in);
        System.out.println("Lutfen üçgenin kenar uzunluklarını giriniz");
        int k1=scan2.nextInt();
        int k2=scan2.nextInt();
        int k3=scan2.nextInt();
        if (k1==k2 && k2==k3){
            System.out.println("Eşkenar Üçgen");
        } else if (k1==k2 || k1==k3 || k2==k3) {
            System.out.println("Ikizkenar Üçgen");
        }else {
            System.out.println("Çeşitkenar Üçgen");
        }
        // 10.Soru
        double bmi = 18;
        if (bmi<0){
            System.out.println("Gçersiz Değer");
        } else if (bmi>12 && bmi<=18.5) {
            System.out.println("Zayıf");
        } else if (bmi>18.5 && bmi<=24.9) {
            System.out.println("Normal Ağırlık");
        } else if (bmi>=25 && bmi<=29.9) {
            System.out.println("Fazla Kilolu");
            
        } else if (bmi>=30) {
            System.out.println("Obezite");
            
        }

    }
}

package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        // Kullanıcıdan işlem ve iki sayı alarak işlemin sonucunu ekrana
        // yazdıran basit bir hesap makinası yapınız.
        Scanner input= new Scanner(System.in);
        System.out.println("Işlemi giriniz +,-,*,/,%");
        char islem =input.next().charAt(0);
        System.out.println("Ilk sayıyı giriniz");
        double sayi1=input.nextDouble();
        double sayi2=input.nextDouble();
        switch (islem){
            case '+':
                System.out.println(sayi1+sayi2);
                break;
            case '-':
                System.out.println(sayi1-sayi2);
                break;
            case '*':
                System.out.println(sayi1*sayi2);
                break;
            case '/':
                System.out.println(sayi1/sayi2);
                break;
            case '%':
                System.out.println(sayi1*sayi2/100);
                break;
            default:
                System.out.println("Bu ıslem tanımlanmamıs...");



        }


    }//main
}//class

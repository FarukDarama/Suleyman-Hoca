package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int sayi = imput.nextInt();
        //1.Yol
        if (sayi%2==0){
            System.out.println("Cift sayi");
        }
        if (sayi%2!=0){
            System.out.println("Tek sayı");
        }
        //2.Yol
        if (sayi%2==0){
            System.out.println("Cift sayi");
        }else{
            System.out.println("Tek sayi");
        }
      // Example 2:Bir sayının negatif pozitif veya nötr oldugunu soyleyen kodu yazınız

        System.out.println("Lutfen bir sayı giriniz");
        double s = imput.nextDouble();
        if (s>0){
            System.out.println("Pozitif");
        } else if (s<0) {
            System.out.println("Negatif");
        }else {
            System.out.println("Notr");
        }
        {

        }

    }
}

package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example 1: Kullanıcı gün numarasını giirsin siz günü yazdırsın
        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasını giriniz");
        int gun = input.nextInt();
        if (gun==1){
            System.out.println("Pazar");
        } else if (gun==2) {
            System.out.println("Pazartesi");
        } else if (gun==3) {
            System.out.println("Salı");

        } else if (gun==4) {
            System.out.println("Carsamba");
        } else if (gun==5) {
            System.out.println("Persembe");
        } else if (gun==6) {
            System.out.println("Cuma");
        }else if (gun==7) {
            System.out.println("Cumartesi");
        }else {
            System.out.println("Lutfen gercerli bir gün numarası giriniz");
        }


    }
}

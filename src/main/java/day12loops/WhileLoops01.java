package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        // Example 1. 3 den 10 a kadar tam sayıları aynı satırda ekrana yazdıran kodu yazın
        // 1. Yol:
        for (int i=3;i<11;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        // 2. Yol:
        int i=3;
        while (i<11){
            System.out.print(i+" ");

            i++;
        }
        System.out.println();
       // Example 2. 17 den 4 kadar cift sayıalrı yazdıran kod
        int k=17;
        while (k>=4){
            if (k%2==0){
            System.out.print(k+" ");
            }

            k--;
        }
        System.out.println();
        // Example 3. 12 den 67 ye kadar sayıalrın toplamını veren kodu yazın
        int m=12;
        int sum =0;

        while (m<68){
          sum= sum+m;

            m++;
        }
        System.out.println(sum);

        // Example 4 . Size verieln tam sayının toplamını ekrana yazdırın

        int x=385;
        int sum2=0;

        while (x>0){
        sum2= sum2+x%10;

            x/=10;
        }

        System.out.println("sum2 = " + sum2);

        // Example 5. Kullanıcıdan alıdıgınız bie sayının carpım tablosunu ekrana yazdırın
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int rakam =input.nextInt();
        int n =1;
        while (n<11){
            System.out.println(rakam+"x"+n+"="+(n*rakam));
            n++;
        }

    }
}

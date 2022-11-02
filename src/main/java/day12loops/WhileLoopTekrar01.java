package day12loops;

public class WhileLoopTekrar01 {
    public static void main(String[] args) {
        // Example 1. 3 den 10 a kadar tam sayıları aynı satırda ekrana yazdıran kodu while loop ile yazın
        int a=3;
        while (a<11){
            System.out.print(a+" ");
            a++;
        }
        System.out.println();
        // Example 2. 17 den 4 kadar cift sayıalrını while loop ile yazdıran kod yazın

        int b=17;
        while (b>3){
            if (b%2==0){
                System.out.print(b+" ");
            }
            b--;
        }
        System.out.println();
        // Example 3. 12 den 67 ye kadar sayıalrın toplamını veren kodu yazın
        int c =12;
        int sum =0;
        while (c<68){
           sum = sum+c;

            c++;
        }
        System.out.println("sum: "+sum);

        // Example 4 . Size verieln tam sayının toplamını ekrana yazdırın
        int d =1234;
        int sum2=0;
        while (d>0){
         sum2 = sum2+d%10;
            d=d/10;
        }
        System.out.println("sum2 toplam: "+sum2);
        // Example 5. Kullanıcıdan alıdıgınız bie sayının carpım tablosunu ekrana yazdırın
        // 3==> 3x1=3 3x2=6
        int num=5;
        int e=1;
        while (e<11){
            System.out.println(num+"x"+e+"="+(e*num));
            e++;
        }








    }

}

package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {
        // If satatement belli kodları belli şartlara bağlı olarak calışmaya başlar.

        // Example 1: Sayı pozitif ide ekrana pozitif yazdırın
        int s =12;
        if (s>0){
            System.out.println("Positive");
         char ch ='B';
         if (ch>='A' && ch <='Z'){
             System.out.println("Buyuk harf");
         // && işlemi sadece boolean ile kullanılır.
         // Example 3: Veri,len sayı 3 basamaklı ise ekrana 3 basamaklı yazdırın
         int sayi =-917;

         sayi = Math.abs(sayi);

         if (sayi>99 && sayi<1000){
             System.out.println("3 basamaklı");
             // Example 4: Verilen bir sayı cift sayı ise ekrana cift sayi yazdırın
             //
             int sayi1= -198;
             Math.abs(sayi1);

             if (sayi1%2==0){
                 System.out.println("Çift Sayi");
             }
             // Example 5: Verilen bir sayı 300den kucuk veya 1200 den buyuk ise "Harika Sayi" yazdırın
             int r=250;
             if (r<300 || r>1200){
                 System.out.println("Harika Sayi");
             }










         }






         }
        }


    }
}

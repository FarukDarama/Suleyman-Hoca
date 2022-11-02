package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        // Example 1. Kullanıcıdan bir sayı alınız sayı 100 den kücük ise ekrana kazandın yazdırın
        // aksi halde  ekrana kaybettin yazdırın.
        // Kullanıcı kazandıkca oyun devam etmeli
        Scanner input=new Scanner(System.in);
       int sayi=0;
        do {
            System.out.println("Bir sayi giriniz ");
             sayi =input.nextInt();

            if (sayi<100){
                System.out.println("Kazandınız");
            }
        }while (sayi<100);

        System.out.println("Kaybettiniz!");
        //Example 2. Kullanıcıdan ismini aliniz ilk harfinin buyuk olup olmadıgını kontrol edin
        System.out.println("lutfen iminizi ginin");


        do {
            System.out.println("Isim giriniz");
         char ilkHarf=input.next().charAt(0);
          if (ilkHarf>'A' && ilkHarf<'Z'){
              System.out.println("Ismi basarıyla girdiniz");
          }else {
              System.out.println("Ismi yanlıs girdiginiz icin isleminiz iptal edilmiştir");
              break;
          }
        }while (true);
        // Infinitive Loop : Sonsuz döngü
        // Artırma azaltma kısmını yazmazsanız infinitive loop sorunsalı olur .








    }
}

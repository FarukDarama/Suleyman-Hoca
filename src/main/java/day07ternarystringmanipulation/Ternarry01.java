package day07ternarystringmanipulation;

public class Ternarry01 {
    public static void main(String[] args) {
    // Example 1:Bir sayının pozitif olup olmadıgını  ekrana yazdıran kodu yazın.
        int sayi = 3;
        if (sayi>0){
            System.out.println("pozitif");
        }else{
            System.out.println("pozitif degil");
        }
    //2. Yol:
       String sonuc = sayi >0 ? "Pozitif" : "Pozitif degil";
       System.out.println("sonuc = " + sonuc);
        // Example 2:iki sayıdan kücük olanı  ekrana yazdıran kodu yazın.
    int b=120;
    int c=23;
    int min =b<c ? b:c;
        System.out.println("min = " + min);
        //Example 3: Verilen sayının mutlak degerini hesaplayın
        // pozitif sayıların ve 0 in mutlaak degeri kenileridir
        // negatif sayıların mutlak degeri -1 ile carpılır
    int d=-45;
    int abs = d<0 ? d*(-1) : d;
        System.out.println("mutlakDeger = " + abs);
       // Examole 4: İki tane sayı aynı işaraetli ise bu salıalrı carpınız
       // farklı işaretli ise işlem yapamam
    int e =12;
    int f =10;

        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f :"Islem yapamam";
        System.out.println("islem = " + islem);
    //  Ternary farklı data tipinde sonuc return ederse sonucun data teyp ını "Object" yapın.
    //  Java da her classın en az bir tane "parent" class'ı vardır. Sadece Object classın "parent" classı yoktur.















    }
}

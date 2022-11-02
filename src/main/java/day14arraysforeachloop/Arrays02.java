package day14arraysforeachloop;

import day13loopsarrays.ArraysTekrar01;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
         // Example 1: [0, 2, 3, 0, 12, 0] sıfırları  en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]
         // Cözüm: 1.Adım==> yeni array olusturacagım [0,0,0,0,0,0]
           // (eleman sayisi orjinal array ile aynı olmali)
       //2.Adim ==> 0 ise
        int original[]={0, 2, 3, 0, 12, 0};
        int yeni[]= new int[original.length];

        int idx =0;
        for (int i=0;i<original.length;i++){
            if (original[i] !=0){
                yeni[idx] =original[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));
        //Example 2 : Bir arrayin icinde herhangi bir elemanın olup olmadıgını ve
        // kac kere tekrarladının kontrol eden kodu yazınız.
        //[2,1,2,-3,2] ==> 2 elemanı var ve 3 kere tekrarlandi.
        //             ==> Kullanıcı 6 yi sordu ==> 6 elemanı  yok ve 0 kere tekrarlandı

       int arr[] ={2,1,2,-3,2};
       int eleman =2;
       int counter =0;
       for (int w :arr){
           if (w==eleman){
               counter++;//flag : Bazı durumların olup olmadıgını kontrol etmek için flag kullanılır
           }

       }
       if (counter>0){
           System.out.println(eleman +" array'de "+counter+" defa var");
       }else System.out.println(eleman+" arrey'de yok");

        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana" ==> calismayana

        String sentence ="Java kolaydir calisana, ne kolay ki calismayana.";//==> calismayana
       sentence = sentence.replaceAll("\\p{Punct}","");

       String words[] = sentence.split(" ");
       Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));//[ne, ki, Java, kolay, kolaydir, calisana, calismayana]
        System.out.println( words [words.length-1]);




    }
}

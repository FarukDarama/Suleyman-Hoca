package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02Tekrar {
    public static void main(String[] args) {
        // Example 1: [0, 2, 3, 0, 12, 0] sıfırları  en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]
        int []arr ={0, 2, 3, 0, 12, 0};
        int []yeniArr=new int[arr.length];
        int idx =0;

        for (int i =0;i<arr.length;i++){
            if (arr[i]!=0){
                yeniArr[idx]=arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeniArr));

        //Example 2 : Bir arrayin icinde herhangi bir elemanın olup olmadıgını ve
        // kac kere tekrarladının kontrol eden kodu yazınız.
        //[2,1,2,-3,2] ==> 2 elemanı var ve 3 kere tekrarlandi.
        //             ==> Kullanıcı 6 yi sordu ==> 6 elemanı  yok ve 0 kere tekrarlandı

        int []arr1={2,1,2,-3,2};
        int eleman=2;
        int counter=0;

        for (int w :arr1){
            if (w==eleman){
                counter++;
            }

        }
        if (counter>0){
            System.out.println(eleman+" elemani"+" "+counter+" kere tekrarlanmıştır");
        }else {
            System.out.println(eleman+" array'de yok");
        }
        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana" ==> calismayana

        String str = "Java kolaydir calisana, ne kolay ki calismayana.";
        String []arr2 =  str.replaceAll("\\p{Punct}","").split(" ");
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr2));//[Java, calisana, calismayana, ki, kolay, kolaydir, ne]
        //yanda alfabetik sıralama yaptı kelimelerin uzunluguna göre degil
        System.out.println(arr2[arr2.length-1]);







    }
}

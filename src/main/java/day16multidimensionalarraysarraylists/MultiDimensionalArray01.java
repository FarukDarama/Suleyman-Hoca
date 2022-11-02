package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    /*
    Array veya Collection varsa for each loop kullanmak ilk tercihiniz olsun
    Array veya Collection var ama index kullanmak zorundasınız o zaman for each loop calışmaz
    for loop veya while loop veya do while loop kullanmalisiniz
     */
    public static void main(String[] args) {
        // Bir tane intger m.d..array olusturun ve bu arraydeki tüm sayıların toplamını yazdırın
        int arr[][]={{2,5,1},{32,75},{13,21,43,56}};
        int toplam=0;
        for (int[] w:arr){
            for (int k:w){
              toplam = toplam+k;
            }
        }
        System.out.println("toplam = " + toplam);
    //  Bir md.... array i normal array e ceviran kodu yazınız
        //{{2,5,1},{32,75}} ===>{2,5,1,32,75}
        // Cözüm:
        // 1) M.D... arraydeki eleman sayisinı bulunuz

        int brr[][]={{2,5,1},{32,75}};
        int sum =0;
        int idx =0;
        for (int[] w:brr){
         sum = sum+w.length;
        }
        System.out.println("sum = " + sum);
        int crr[]=new int[sum];
        for (int[] w:brr){
            for (int k :w){
                crr[idx] =k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));




    }
}

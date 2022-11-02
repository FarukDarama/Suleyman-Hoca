package day13loopsarrays;

import java.util.Arrays;

public class ArraysTekrar01 {
    public static void main(String[] args) {
        //Array nasil olusturulur?
        int []arr = new int[4];
        arr[0]=12;
        arr[1]=9;
        arr[2]=13;
        arr[3]=10;
        System.out.println(Arrays.toString(arr));//[12,9,13,10]
        //Array'deki herhangi bir elemani nasil yazdirabiliriz?
        System.out.println(arr[1]);//9
        //Example 1: Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz
        Arrays.sort(arr);
        int ilk = arr[0];
        int son = arr[3];
        System.out.println(ilk+son);
        //Example 2: arr Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
        int sum =0;
        for (int i=0;i<arr.length;i++){
        sum = sum + arr[i];
        }
        System.out.println(sum);
        //4. Yol: for each loop Arraylerde ve Collectionslarda kullanılır
         int sum2=0;
         for (int w :arr){
          sum2 =  sum2 + w;
         }
        System.out.println(sum2);

        //Example 3: String bir Array olusturun bu Array e 5 isim yerleştirin
        // sonra bu isimlerdeki karakter sayılarının
        // toplamını ekrana yazdırın


          String  arr2[]={"ali","veli","deli","beli","seli"};

        System.out.println(Arrays.toString(arr2));
        int sum3 =0;
        for (String w :arr2){
          sum3 = sum3+w.length();
        }
        System.out.println("sum3 = " + sum3);

        // Example 4: Char bir Array olusrurunuz
        // bu Array e 5 eleman ekleyiniz
        // bu Arraydeki sadece buyuk harfleri yazdırın
         char []ch ={'a','B','x','Y','z'};
         for (char w :ch){
             if (w>'A' && w<'Z'){
                 System.out.print(w);
             }
         }








    }
}

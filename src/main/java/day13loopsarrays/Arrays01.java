package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {

    /*
        1)Ayni data tipinde, coklu data'i depolmaka icin Java'nin olusturdugu yapilar vardir.
          Bu yapilardan birisi de "Array" lerdir.
     */

    public static void main(String[] args) {

        //Array nasil olusturulur?
        int stdAges[] = new int[7];// [ 0, 0, 0, 0, 0, 0, 0 ]

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasil eklenir?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));// [12, 11, 13, 14, 10, 12, 12]

        //Array'deki herhangi bir elemani nasil yazdirabiliriz?
        System.out.println(stdAges[4]);//10

        //Example 1: Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14]

        int ilk = stdAges[0];

        //Note: "length()" String'lerde kullanilir, "length" Array'lerde kullanilir
        int son = stdAges[stdAges.length-1];

        System.out.println(ilk + son);//24

        //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
        //1.Yol : for loop
        int sum = 0;

        for(int i=0; i<stdAges.length; i++){
            sum = sum + stdAges[i];
        }
        System.out.println(sum);
        //2. Yol : while loop
        int sum2=0;
        int i =0;
        while (i<stdAges.length){
          sum2= sum2+stdAges[i];
          i++;
        }
        System.out.println("sum2 = " + sum2);
        //3. Yol do while loop
        int sum3=0;
        int k=0;
        do {
       sum3 = sum3+stdAges[k];
            k++;
        }while (k<stdAges.length);

        System.out.println("sum3 = " + sum3);
        //4. Yol: for each loop Arraylerde ve Collectionslarda kullanılır
        int sum4=0;
        for (int w :stdAges){
         sum4 = sum4+w;

        }
        System.out.println("sum4 = " + sum4);
       //Example 3: String bir Array olusturun bu Array e 5 isim yerleştirin sonra bu isimlerdeki karakter sayılarının
        // toplamını ekrana yazdırın
        String isimler[]= new String[5];
        isimler[0]="Ali";
        isimler[1]="Tom";
        isimler[2]="Veli";
        isimler[3]="Kemal";
        isimler[4]="Cem";
        int karakterSayısı=0;
        for (String w :isimler){
         karakterSayısı= karakterSayısı+w.length();

        }
        System.out.println("karakterSayısı = " + karakterSayısı);
        // Example 4: Char bir Array olusrurunuz
        // bu Array e 5 eleman ekleyiniz
        // bu Arraydeki sadece buyuk harfleri yazdırın
        char ch[]={'A','c','D','k','M'};
        for (char w :ch){
            if (w>='A'&& w<'Z'){
                System.out.print(w);
            }
        }








    }

}
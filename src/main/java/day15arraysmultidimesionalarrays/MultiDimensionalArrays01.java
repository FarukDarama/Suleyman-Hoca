package day15arraysmultidimesionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    // Bir array in elemanları array ise bu arrayler multidimesional arraydir.
    public static void main(String[] args) {
        // Mulidi... array nas,l olusturulur
        int arr[][] = new int[3][2];
        System.out.println(Arrays.deepToString(arr));
        //Multidimensional arraylere eleman ekleme
        arr[1][0]= 6;
        arr[0][0]= 3;
        arr[0][1]=-4;
        arr[1][1]=18;
        arr[2][0]=-7;
        arr[2][1]= 0;
        //Mult...array nasıl yazdırılır
        System.out.println(Arrays.deepToString(arr));
        //Multi... arraylerde array elemanlardan birini yazdirmak
        System.out.println(Arrays.toString(arr[1]));
        //Multi... Arraylerde ic arrayde ki eleman nasil yazdırılır.
        System.out.println(arr[1][0]);
        //Example 1: Strin bir multid.. array olusturunuz eleman ekleyiniz sonra da
        //toplam eleman sayisini yazdırın
        String brr[][] = new String[4][3];
        brr[0][0]="A";
        brr[0][1]="B";
        brr[0][2]="C";
        brr[1][0]="D";
        brr[1][1]="E";
        brr[1][2]="F";
        brr[2][0]="G";
        brr[2][1]="H";
        brr[2][2]="I";
        brr[3][0]="J";
        brr[3][1]="K";
        brr[3][2]="L";
        int sum =0;
       for (String[] w: brr){
         sum =  sum + w.length;

       }
        System.out.println("sum = " + sum);





    }
}

package day15arraysmultidimesionalarrays;

import java.util.Arrays;

public class Arrays02Tekrar {
    public static void main(String[] args) {
        //Example 1: Size verilen pozitif ve negatif sayilar içeren bir arrayde en kücük pozitif en buyuk negatif
        //elemani bulunuz
        int arr[]={-12,18,-5,23,-2,0};
        Arrays.sort(arr);//[-12,-5,-2,18,23]
        int negatifEnBuyuk=arr[0];
        int pozitifEnKucuk=arr[arr.length-1];

        for (int w :arr){

            if (w<0){
              negatifEnBuyuk = Math.max(negatifEnBuyuk,w);
            } else if (w>0) {
               pozitifEnKucuk = Math.min(pozitifEnKucuk,w);
            }

        }
        System.out.println("pozitifEnKucuk = " + pozitifEnKucuk);
        System.out.println("negatifEnBuyuk = " + negatifEnBuyuk);





    }
}

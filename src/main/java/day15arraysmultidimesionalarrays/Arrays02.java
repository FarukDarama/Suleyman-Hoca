package day15arraysmultidimesionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 1: Size verilen pzitif ve negatif sayilar içeren bir arrayde en kücük pozitif en buyuk negatif
        //elemani bulunuz
        int arr[]={-12,18,-5,23,-2,0};
        Arrays.sort(arr);//[-12,-5,0,18,23]

        int maxNegatif = arr[0];
        int minPozitif = arr[arr.length-1];
        for (int w :arr){
            if (w<0){
              maxNegatif = Math.max(maxNegatif,w);
            }
            if (w>0){
             minPozitif = Math.min( minPozitif,w );
            }
        }
        System.out.println(maxNegatif+" and "+minPozitif);












    }
}

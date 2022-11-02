package day15arraysmultidimesionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {
        //MultiDimensionalArray kısa yolsan nasıl olusturulur
        char arr[][] ={{'a','b'},{'C','D','E'},{'?'}};
        System.out.println(Arrays.deepToString(arr));
        // Bir String multi.... arrayde içinde a olan elemanları konsola yazdırın
        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        for (String[] w:brr){
         for (String k:w){
             if (k.contains("a")){
                 System.out.print(k+" ");
             }
         }

        }








    }
}

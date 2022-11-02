package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        //Example 1: Bir int arraylist deki 7 haric tüm elemanalrı iki artırın
        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w :ages){
            if (w==7){
                continue;
            }
          //w = w+2 listler boyle update edilememzler
            ages.set(ages.indexOf(w),w+2);
        }
        System.out.println(ages);
         // Example 2 : Size verilen arraylist de 8 ve 8 denönceki tüm elemanları 2 katına cıkarın
        List<Integer> yas = new ArrayList<>();
        yas.add(12);
        yas.add(7);
        yas.add(21);
        yas.add(8);
        yas.add(9);

        for (Integer w:yas){
            yas.set(yas.indexOf(w),w*2);
            if (w==8){
               break;
            }
        }
        System.out.println(yas);





    }
}

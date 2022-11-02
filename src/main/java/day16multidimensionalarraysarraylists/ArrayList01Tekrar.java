package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01Tekrar {
    public static void main(String[] args) {

        List<Integer> myList= new ArrayList<>();
        myList.add(21);
        myList.add(50);
        myList.add(23);
        myList.add(200);
        myList.add(18);
        myList.add(20);
        myList.add(23);
        myList.add(185);
        //Example 1: myList ArrayListendeki tüm tek sayıları 11 artırtıkdan sonra ekrana yazdırırnız.

        for (int w:myList){

            if (w%2!=0){
                myList.set(myList.indexOf(w),w+11);
            }
        }
        System.out.println(myList);










    }
}

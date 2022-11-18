package day30collections;
/*
Deque : Double Ended Queue manasindadir yani iki uclu Queue demektir.
FIFO ve LIFO beraber gerektiğinde  kullanılır

 */

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>();
        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck);// [Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]
        furnitureTruck.push("Refrigerator");
        System.out.println(furnitureTruck);//[Refrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]




    }
}

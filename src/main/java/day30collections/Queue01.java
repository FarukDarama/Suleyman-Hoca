package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
    Ilk giren elemani ilk kullanmaniz gerektiğinde qeueu en iyi secimdir.(FIFO)
    insertion order ' a göre dizilirler .
    Queue da  peek() poll() element() gibi ilk elemani bir cok method vardir.
    offer() methodu capacity kontrolu yapıldıktan sonra eleman ekleme durumlarında kullanılır.
     */
    public static void main(String[] args) {


        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Honey, Tomatoes]
        wareHouse.offer("Potatoes");
        System.out.println(wareHouse);
    }
}

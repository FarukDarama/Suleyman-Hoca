package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {
    //ArrayListler index kullanır ama ındex kullanmak eleman ekleme ve silme işlemlerinde biz zaman kaybettirir
    //cunku bir cok elemanın reindex edilmesi gerekir.Bundan dolayi Java linkedList diye bi yapi olusturmus.
    //LinkedList eleman ekleme ve eleman silmede cok basarılıdır.Buyuzden eleman ekleme silme işlemlerini
    // cokca yapacagıznız durumlarda linkedlist kullanılır.
    //ArrayList eleman bulma işlemlerinde çok başarılıdır(search işlemleri) LinkedList eleman bulma işlemlerinde başarısızdır
   /*
      1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
      2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
      3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
      4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
      5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
       6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
       7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.

    */
    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("TomHanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        System.out.println(visitors);//[Tom, Hanks, TomHanks, Brad, Pitt, Brad Pitt]
        visitors.add(2,"Angelina Julie");
        visitors.add("Brad Pitt");
        visitors.add("TomHanks");
        System.out.println(visitors);
        //LinkedListler ekleme ve cıkarma işlemlerinde cok basarılı olduklarından
        //ekleme ve cıkarma ile cok fazla method icerirler.
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cüneyt Arkın");
        System.out.println(visitors);
        visitors.removeLast();
        System.out.println(visitors);
        visitors.removeFirst();
        System.out.println(visitors);
        visitors.removeFirstOccurrence("TomHanks");
        System.out.println(visitors);
        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors);
        String firstEl = visitors.pop();//ilk elemanı alıp bana veriyor sonra ilk elemanı siliyor listten.
        System.out.println(firstEl);//Tom
        System.out.println(visitors);
        LinkedList<String> myList = new LinkedList<>();
        // System.out.println( myList.pop()); NoSuchElementException attı bos listten eleman eleman istedik ve sil dedik
        

    }


}

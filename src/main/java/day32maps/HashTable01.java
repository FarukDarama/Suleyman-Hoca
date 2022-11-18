package day32maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
       1)HashTable bir map'dir.
       2)HashTable entrySetleri herhangi bir siralamaya tabi tutmaz.
       3)HashTable ,HashMaplerden daha yavastir.Cunku HashTable'lar thread-safe(aynı anda bir cok iş yapma) ve
       synchronized(once corba, corba pişerken salata yapma mantıklı secim yaparak iş yapmak) dir.
       4)HashTablelarda key null olamaz.NullPointerException atar.
       5)HashTablelarda value null olamaz.NullPointerException atar.

       Note:toString() methodu objeleri consolda detaylari ile görebilmek icin classlarin icinde olusturulur.
            toString() methodunu olusturmadan consolda yazdırısak Java adrei yazdirir.
     */
    public static void main(String[] args) {
        Hashtable<String,Integer> counrtyPopulation = new Hashtable<>();
        counrtyPopulation.put("USA",400000000);
        counrtyPopulation.put("Germany",83000000);
        counrtyPopulation.put("Turkey",90000000);
        System.out.println(counrtyPopulation);
       // counrtyPopulation.put(null,9000000);//HashTablelarda key null olamaz.NullPointerException atar.
       // counrtyPopulation.put("France",null);//HashTablelarda value null olamaz.NullPointerException atar.

        Hashtable<String,Students> myStudents = new Hashtable<>();
        myStudents.put("Math",new Students("Tom Hanks","th@gmail.com",21,true));
        System.out.println(myStudents);
        String name = myStudents.get("Math").name;
        System.out.println(name);//Tom Hanks
        int age = myStudents.get("Math").age;
        System.out.println(age);//21



    }
}

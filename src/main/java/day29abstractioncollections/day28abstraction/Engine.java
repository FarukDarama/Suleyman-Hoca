package day29abstractioncollections.day28abstraction;

public interface Engine {
//Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in
// birden fazla "parent" i oldu bu ise Java'da mumkun degildir.
// Cunku Java "multiple Inheritance" i desteklemez.


//"multiple inheritance" class'larda mumkun degildir
// fakat Java "interface" isimli yeni bir yapi olusturdu
// bu yapida "multiple inheritance" a musaade etti.
    //Inter facelerdeki hersey abstarct oldugu ıcın ona tam abstract(fully Abstraction) derler
    //Abstract claslarda abstract ve concrete method bir arada kullanıldıgı ıcın abstract claslara fullay abstraction denmez
     //INTERFACELERDEKİ TUM METHODLAR ABSTRACT OLMAK ZORUNDADIR.
     //Interfacelerde abstract method olusturuken abstract key word kullanmaya gerek yoktur
     // cunku java o methodun abstract oldugunu bilir.
     //Interfacelerdeki methodlar otomatik olarak public kabul edlir buyuzden o
     // methodlar ıcın public yazmaya gerek yoktur

    // public abstract void eco(); ile void eco(); ayni anlama gelir
     void eco();

     void gas();

     void tsi();
     //default keyword kullanarak bodysi olan methodlar uretebilirsiniz
     //Asagıdaki method non-static dur.
     public default int add(int a,int b){
         return a+b;
     }
    // static keyword kullanarak bodysi olan methodlar uretebilirsiniz
    // Asagıdaki method static dur.
     public static String update(String str){
         return str+"!";
     }






}

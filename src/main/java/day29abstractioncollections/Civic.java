package day29abstractioncollections;

   /*
        "abstract method"lar sadece NE yapılacağını(WHAT TO DO) söyler
        "concrete method"lar ne yapılacağı ile birlikte NASIL yapılacağını(HOW TO DO) da söyler
        "interface"ler bir yapılacak işler listesidir.(TO DO LIST)
        "multiple parent interface" kullandıgınızda aynı method ismi ile birden faazla method
         olusturursanız bu methodların return typeları aynı olmalıdır aksı takdirde hata verir
        "multiple parent(birden çok parentli) interface kullandığınızda aynı mtehod ismi ile
         birden fazla method oluşturursanız bu methodların return type lari aynı olmalidir.Aksi takdirde hata verir.
         Çünkü java hangisini seçeceğini bilemez.  ==> void price();  ile   int price();  gibi
         "interfacelerde" constructor olmadıgı icin interfacelerden object olusturulamaz
         "abstract" classlarda clas oldukları icin constructor vardir.Ama constructorlar abstract classlarda object olusturmazlar.

         Soru : Abstract class ile Interfacenin farklari nelerdir ?

                METHOD
               1)abstarct class hem abstract hem concrete methodlar ıcerebilir.
               2)Interfaceler ise sadece abstract methodlar ıceririr
                 ama ısterssek ınterfaceler ıcınde de default ve statıc keyxordler kullanarak concrte methodlaar olusturabiliriz

                 VARİABLE
                1)Abstrackt classlarda normal classlar gıbi herturlu variable olusturulabilir
                2)Interfacelerde ise variableler public static ve final olmak zorunludur

                 INHERITANCE
                1)Absract classlar clas oldukları ıcın multiple inheritanceye musade etmezler
                  Interfaceler ıse multiple ınheritanceyi destekler

                 OBJECT CREATİON
                1)Abstract classlarda constructor vardir ama object olusturmada kullanılmaz
                  Interface lerde ise constructor olmadıgından object olusturulamaz

          Soru: Object Oriented Programming Language prensipleri(principles) nelerdir?
          i)Inheritance   ii)Polymorphism   iii)Encapsulation   iv)Abstraction


    */

public class Civic implements Engine,Ac{

    @Override
    public void run() {
        System.out.println("Civic runs well");
    }





}

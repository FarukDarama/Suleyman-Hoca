package day21accessmodifiersinheritance;

public class AnimalRunner {
    /*
     1)Inheritance sayesinde
       i)kod tekrarından kurtuluruz
       ii)Code tamiri(maintenance) kolay olur
       iii)Child Class'lari daha atomic yapmış oluruz
     2)Bir Classi baska bir calssin ch,ld classi yapmak için "extends" keyword kullanılır. ilk yazılan class child ,
     ikinci yazilan Class parent olur
     3)Child Class object'leri Parent Class'dan method ve variable'lari kullanabilir.
     4)Parent Class objeleri Child Classtan method ve variableleri kullanamaz.
     5)Object Class her Classin perentidir.Javada Object Class haric her classin parenti vardir.
     6)Private method ve variableler Child Classlar tarafından kullanılamazlar
       protected method ve variable'lar Child Class'lar tarafaindan  kullanılanilabir
       default method ve variableler ayni package deki Child Class'lar tarafından kullanilabilir
       public method ve variableler Child Class'lar tarafından kullanilabilir
       Note: "Child Class'lar tarafından kullanilabilir demek inherit edilebilir demek
     7)4 tip inheritance vardir
        i)Mutilevel Inheritance : Java bunu kabul eder
        ii)Hierarchical Inheritance : Bir parent için coklu child, java bunu kabule eder.
        iii)Multiple Inheritance:Bir child 'a coklu parent, java bunu desteklemez.
        1v)Single Inheritance:Bir Child Class icin bir Parent Class demektir,Java bunu destekler

     */




    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();


        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.drink();






    }
}

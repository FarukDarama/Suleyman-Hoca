package day29abstractioncollections.day28abstraction;

public abstract class Animal {

    //Bodysi olmayan methodlar Abstract method olarak adlandırılır
    //Bir methodu abstract yapmak icin i)method body i sil ii)abstract key word kullan
    //Abstract methodlar abstract class ıcınde olmalidir
    public abstract void eat();
    // "Abstract class"larda hem "abstract" method hem de concrete method kullanilabilir.
    public  void  drink(){
        System.out.println("Animals drink...");
    }
    // abstract move method olusturun

    public abstract void move();

}

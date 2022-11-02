package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        //Inheritance' de variable'lar secilirken Java objectin data tipine bakar.
        //Oncelikle istediginiz variablei Objectin data type i olan Class' da arar.
        //O classda bulamaz ise parent classlara bakar.
        //Hicbir Parent Classda bulamaz ise hata veririr
        Cat cat1 = new Cat();
        System.out.println( cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);//45
        Mammel cat2 = new Cat();
        System.out.println( cat2.a);
        Animal cat3 = new Cat();
        System.out.println(cat3.a);

        //Object olusturuken Object in data type'i child Class'lardan secilemez
        //Inheritance da variableler secilirken Java Constructor a bakar oncelikle istediğiniz methodu
       // Constructor ı kullanılan Classdan alir
        //O class da bulamaz ise parent classlara bakar hicbir yerde o methodu bulamaz ise hata verir.

        Cat cat4 = new Cat();
        cat4.eat();//Cat eat
        cat4.drink();
        Mammel cat5 = new Mammel();
        cat5.eat();//Mammel eat
        Animal cat6 = new Animal();
        cat6.eat();//Animal eat




    }
}

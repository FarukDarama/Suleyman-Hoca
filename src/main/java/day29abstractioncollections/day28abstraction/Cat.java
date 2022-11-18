package day29abstractioncollections.day28abstraction;

public class Cat extends Mammal {
     /*
       Bir method parent class da abstract method ise child class o methodu override edip kullanmak zorundadir
       Bu yuzden herhangi bir fonksionu mecburi yapmak isterseniz o methodu abstract yapmalisiniz.
      */
    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");
    }
}

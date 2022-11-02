package day22inheritancepolymorphism;

public class Mammel extends Animal {
    public int a = 13;
    public int b = 34;

    public void eat() {
        System.out.println("Mammel eat");
    }

    public void drink(){
        System.out.println("Mammel drink");
    }

    public Mammel(){
        System.out.println("Mammel");
    }

}

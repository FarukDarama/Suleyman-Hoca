package day23inheritancepolymorphism;

public class Animal {

    public void eat(){
        System.out.println("Animals eat");
    }

    public int add(int a,int b){
        return a+b;
    }

    public Integer multply(int a,int b){
        return a*b;
    }
    //Asagıdaki method "Overridden Method"
    public Animal creat(){
        return new Mammel();
    }

    public final double divide(int a,int b){
        return a/b;
    }

}

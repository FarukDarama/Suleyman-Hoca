package day32maps;

public class StaticBlocks01 {
    public static  double pi;
    //static block'lar ihtiyacimiz olan variable'larin class olusturma safhasinda elimizde olmasini saglar.
    //static block'lar Class icindeki hersey'den once calistirilir. "main method" dan ve diger tum method'lardan once calistirilir.
    //static block'lar icinde sadece "static variable" lara deger atanabilir.
    //1'den fazla "static block" varsa ustteki once calistirilir.

    static {

        System.out.println("Static blok 2");
    }


    public static void main(String[] args) {
        System.out.println("main method");


    }
    static {
        pi=3.14;
        System.out.println("Static blok 1");
    }



}

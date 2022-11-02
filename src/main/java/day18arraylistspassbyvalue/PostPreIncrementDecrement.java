package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {


        // Post Increment
        int a = 5;
        int b = a++;// Java anlamlı bir cumle duydugunda hemen uygular
        System.out.println("b = " + b);// dolayısıyla b yi 5 yazdırır.
        System.out.println("a = " + a);// 6

        // Pre Increment
        int c = 10;
        int d = ++c;
        System.out.println("d = " + d); //11
        System.out.println("c = " + c); //11

        //Post Increment
        int e = 20;
        int f =e--;

        System.out.println("f = " + f);//20
        System.out.println("e = " + e);//19

        //Pre Decrement
        int h =30;
        int i = --h;
        System.out.println("i = " + i);//29
        System.out.println("h = " + h);




    }
}

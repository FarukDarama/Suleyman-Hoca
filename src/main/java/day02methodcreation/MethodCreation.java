package day02methodcreation;

public class MethodCreation {
    // Main method içinde kullacagınız hersey static olmalıdır

    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2,5));
        System.out.println(ucSayiyicarpmaYap(2,1.5,6));
        System.out.println( IlkIkiyiToplaUcuncuIleCarp(2,8,3.2));
        //sout enter a basınca otomatik olarak System.out.println(); yazılır.
        // Ekrana birşey yazdırmak için iki tane kod var
        // 1) System.out.println();
        // 2)System.out.print();

    }

    //Example 1 : Toplama işlemi yapan bir method oluşturun
    public static double toplamaYap(double a,double b){
        return a+b;
    }
    public static double ucSayiyicarpmaYap(double a,double b,double c){
        return a*b*c;
    }
    public static double IlkIkiyiToplaUcuncuIleCarp(double a,double b,double c){
        return (a+b)*c;
    }




}

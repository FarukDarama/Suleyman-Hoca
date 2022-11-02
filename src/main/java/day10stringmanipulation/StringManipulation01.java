package day10stringmanipulation;

public class StringManipulation01 {
    public static void main(String[] args) {
        String a ="Java kolaydır.";
       boolean b = a.startsWith("kola",5);// bu string 5. karakterden sonra neyle baslıyor demek.
        System.out.println("b = " + b);
        String c = a.replaceFirst("a","*");// bu method stringdeki ilk a'* a cevirir.
        System.out.println("c = " + c);
        //concat methodu 2 tane String'i yapıştırmaya yarar.
        // Concatenation işlemi 2 türlü yapılır
        // java bir işlem için method uretmişse o methodu kullanmak best practice dir.
        String d= a.concat(" Anladın mi ?");
        System.out.println("d = " + d);
        String h ="Java";
        String i ="java";
        //compareTo()  ; method 2 tane String i alfabetik(lexicographic) olarak karsılastırır.
        // Buyuk kucuk harfe duyarlı olsun istemezseniz compareToIgnoreCase () kullanabilirsiniz.
        int k = h.compareToIgnoreCase(i);
        System.out.println("k = " + k);
       String n = a.repeat(1);// String i yanyana girilen sayi kadar yazdırır.
        // repeat (0) empty String return eder.
        System.out.println("n = " + n);



    }
}

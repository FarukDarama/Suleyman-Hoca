package day22inheritancepolymorphism;

public class HondaAccord extends Honda{

    /*
    Siz Class olusturdugunuz  da Java otomatik olarak java size gorunmez bir Constructor veriri, cunkü
       Java . Class in bir kalıp oldugunu ve Object olusturmak ıcın yaratıldıgını ve Object olusturmak icin
       constructor in sart oldugunu bilir
       2) Javanın gorunmez olusturuudugu bu gorunmez constructor a default constructor denir
       3) Siz kendiniz herhangi bir constructor olusturdugubuzda  Java default constructor i siler.
       4) Bir Class da bir den fazla constructor olabilir.Fakat bu constructorlarin parametreleri farkli olmalidir
       5) "this" keyword bu class anlamındadır this.price demek bu classdaki price isimli variable demektir
          this.price syntax'i constructor'ların içinde kullanilir.
       6)Constructor kullanarak variableler uzerinde yaptıgınız degisimler sadece Object uzerindeki variable'ların
       degerlerini  degistirir.
          Class daki variable degerlerini degistirremezler.

     */

    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord (){

           }
    public HondaAccord(int price){
         this.price = price;
           }
    public HondaAccord(int price,int year){

        this.price=price;
        this.year=year;
        System.out.println("Honda Accord Constructor");
    }

    public HondaAccord(int price,int year, String make,String model){
        this.price =price;
        this.year =year;
        this.make =make;
        this.model =model;

    }


}

package day25exception;

public class E01 {
    /*1)Exception java da hodlarımızı calıstırıken meydana gelen beklenemedik durumlardır
      2) Exceptionlar ile calismanin iki yolu vardır
          a) try-catch block kullanma ve exception olussa bile calışmayi devam ettirme
          b)throw exception kullanarak calışmayı durdurma (mesela yazdıgımız kod geregi bir dosya uzerınden
          okuma yapmamaız gerekiyorsa bu dosya silinmis ise java dosyayı bulamaz ve uygulamamnın devam etmesi gerekemz)
       3)Eger exception'i handle etmezsek java calısmayı durdurur.
       4)try-catch kullanırken try kodunu bir yada bırden fazla catch ile birlikte kullanabiliriz
       5)try catch olmaksızın yalnız kullanılmaz
       6)Eger yazmıs oldugumuz herhangi bir kod satırında problem olabilecegını dusunuyorsak try-catchblock
       icine koymalısınız
       7)catch block parantezine olması muhtemel exception class ismi yazilir
       8)e.getmassage() mrthodunun kullanarak teknik message elde edebiliriz.
         e.printStackTrace(); methodu Exception ile ilgili teknik  detayli mesaj  verir.Kod calismaya devam eder.
          System.err.println("Bolme isleminde bir problem olustu"); hada mesejını renkli olarak verir bu sayede consolda dıger
          mesajlardan ayırt edici olsundiye.
       9) Eger try body icindeki kod sorunsuz calısırsa catch blok devereye girmez
     */

    public static void main(String[] args) {
    // divide(6,2);
      //divide(0,2);
      //divide(6,0);//Matematikdem bir sayi 0 ile bölünemez

    // divide2(5,0);
     divide2(12,3);
     divide2(12,0);




    }

    //1.Yol Tavsiye edilmez.
    public static void divide(int a,int b){
       if (b==0){
           System.out.println("Bir sayi sifir ile bolunemez");
       }else System.out.println(a/b);

    }

    //2.Yol try-catch kullanılarak exception'i handle etmek tavsiye ed,l,r.
    public static void  divide2(int a,int b){

        try {

            System.out.println(a/b);
            System.out.println("hi exception");
            System.out.println("bye exception");

        }catch (ArithmeticException e){
            System.out.println("Bolme isleminde bir problem olustu===>"+e.getMessage());
            e.fillInStackTrace();
            System.err.println("Bolme isleminde bir problem olustu");
        }



    }



}

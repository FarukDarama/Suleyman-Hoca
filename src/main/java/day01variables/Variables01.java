package day01variables;

public class Variables01 {
    // Variable nasıl oluşturulur
    // 1) Access Modifier 2) Data type 3) Variable ismi  4) =           5) Deger 6) ;
    // Java da ; ingilizce deki nokta gibidir.
    // Ingilizce de cümle deriz Java da statement deriz.
    // "=" işareti "Assigment Operator" olarak adlandırılır.Sagdaki degeri alır soldaki variablenin içine atar.
    public int age = 13;
    public int height = 183;
                              // Java ' da Data Type'ları
    /*               ***Primitive Data Type'leri****
     1) int:
     Integer 'in kısaltması.Integer tam sayı demektir.
        Matematikde tamsayıların bası ve sonu yoktur.
        32 bit kullanır.
     2) byte:
     Tamsayılar için kullanılır
     en küçük: -128
     en büyük:127

     3) short:
     Tamsayılar için kullanılır.
     en küçük :-32769
     en büyük :32767
     4) long :
     tam sayılar için
     5) float:
     virgülden sonra 7 basamak verir ve sonuna f veya F koymanız gerekir
     Ondalıklı sayılar için
     32 bit kullanır
     6) double:
     Ondalıklı sayılar içindir.
     virgülden sonra 16 basamak içerebilir.
     64 bit kullanır
     7) boolean: "true" veya "false" degerleri için kullanılır .1.bit kullanır.
     8) char : tek  character için kullanılır
     A,C,?,2,.... olabilir.
              *** Non primitve ile primitiveler arasındaki farklar ***
     Biz primitive data type oluşturamayız.
     non primitiveler java tarafaından da oluşturulmuştur ,bizde oluşturabiliriz.Non primitiveler
     çoktur çunkü her developer non primitive oluşturabilir.Classlar aynı zamanda non primitive data type dir.
     Primitiveler küçük harfle Non Primitiveler büyük harfle başlar
     Primitive data typeler memory de farklı buyuklukte yer kaplar.
     Non Primitivelerin hepsi memory de aynı buyuklukte yer kullanırlar.
     */
       public byte price= 12;
       public short populationOfVillage= 23000;
       public float priceOfShirt = 13.99f;
       public double weightOfCell =0.000012045;
       // siz "long" demenize ragmen Java verilen sayıyı "int" kabul eder.
       // Bu yuzden ,long bir variable' int aralığının dısında bir sayı verirseniz sonuna l veya L koyunuz
       public long popolationOfWorld = 700000000l;
       // Uyarı vermez cünkü 1234 int aralığında oldugu için
       public long x = 1234;
       public boolean isRich =false;
       public char initial = 'S';
       public String name = "Tom Hanks";

    public static void main(String[] args) {
     System.out.println("Hallo world");




    }
}

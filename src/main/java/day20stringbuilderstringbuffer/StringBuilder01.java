package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        1)String builder java da bir classdir.
        2)String olustrumaya yarar.
        3)String class varken nicin StringBuilder a ihtiyac duyariz?
           Cunku String Class "Immutable Class"dir, bazen biz mutable Stringlere ihtiyac duyarız
           String Builder bize Mutable Stringlere ihityaç duyarız.
         4)Immutable Class larda vaolan bir deger degiştirilemez.Degistirmek istedginizde
            i)Memory de yeni variabla yeni degerle olusturulur
            ii)Eski variablenin pointer i yeni variableye dondurulur
            iii)Eger bir variable hi.bir pointer tarafından kullanılmıyorsa o variable Garbage Collector
            tarafından   silinir.

            "Mutable Classlarda olan degerler degistirilebiilir.Orjinal deger korunmaz
          5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
    Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin bu container'i
    kullanmasini temin eder. Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
    etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variablee'in
    degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
    yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

         */

        String str = "Java";
        str ="Super Java";
        System.out.println(str);

        //StringBuilder nasıl olusturulur ?
        //1.Yol
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);

        //2.Yol
        StringBuilder strb2 = new StringBuilder();
        //Yol a :
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);
        //Yol b :
        strb2.append(" Learn").append(" Java earn").append(" money.");
        System.out.println(strb2);

        //StringBuilderlarda karakter sayısı nasıl bulunur.

        StringBuilder strb3= new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxxxxx");
        int numOfChar = strb3.length();
        System.out.println(numOfChar);//3

        //Capacity asimlarinda capacity var olanin iki katinin iki fazlasina cikar
        int capacity =  strb3.capacity();
        System.out.println(capacity);//21

        strb3.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2);

        // setCharAt(2,'r');==>>Index 2 deki karakteri "r" ye cevirir.
        strb3.setCharAt(2,'r');
        System.out.println(strb3);
        // delete(3,18); ===> Index 3 dahil den index 18 hariç aradaki karakterleri siler
        strb3.delete(3,18);
        System.out.println(strb3);
        strb3.deleteCharAt(2);
        System.out.println(strb3);
        strb3.reverse();
        System.out.println(strb3);
        //toString() StringBuilder lari String e cevirir.
        String stringStrb3= strb3.toString();
        System.out.println(stringStrb3);// bursan sonra string oldu ve string methodlari cıkıyor karsımıza

        // Stringden de StringBuilder a asagıdaki gibi geceriz
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);
        strb4.insert(3,"MMMM");// 3. karakterden  sonra girdigimiz karakterleri araya yazar

        //insert(3,"KLMOPQRSTU",5,8);===>3. character den sonra,"KLMOPQRSTU" String'inin index 5,6,7 deki characterleri
        //yerleştirir.
        System.out.println(strb4);
        strb4.insert(3,"KLMOPQRSTU",5,8);

        StringBuilder a = new StringBuilder("Iava");
        StringBuilder b = new StringBuilder("Java");
        // a.compareTo(b); i)StringBuilder lar tamami ile ayni ise 0 verir.
        //                 ii)a alfabetik sirada b den sonra gelirse ğozitif olarak aradaki alfabetik siralama farkını gösteriri
        //                 iii)a alfabetik sirada b'den önce gelirse  negatif olarak aradaki alfabetik siralama farkini gösterir.
        int sonuc = a.compareTo(b);
        System.out.println(sonuc);





    }
}

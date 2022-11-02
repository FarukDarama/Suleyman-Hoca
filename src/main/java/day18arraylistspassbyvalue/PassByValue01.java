package day18arraylistspassbyvalue;

public class PassByValue01 {
/*
    1)Java, variable'ların orijinal değerlerini korumak ister.
    2)Variable metotlar içinde kullanıldığında, Java metodun içine
    orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
    Metohod kopya üstünde değişiklik yapar, dolayısıyla variable'ın
    orijinal değer korunmuş olur. Bu sisteme Pass By Value denir.
    Not : J ava pass by value kullanır bazı porgramlama dilleri orjinal degeri koruma altına
    almamıştır.Bu işi developerlara bırakmıstır.
    Bu tarz diller pass by reference kullanır.
 */

    public static void main(String[] args) {

        int x=5;//Gomlek
        System.out.println(x);//5
        // satatic method olan "main methodun" icindeki hersey satatic olmalıdır
        change(x);//ogrenci gomlegi
        System.out.println(x);// gomlek

        int ucret =100;
      int kopya =  indirim(ucret);
        System.out.println("kopya = " + kopya);

        System.out.println("ucret = " + ucret);


    }

    public static void change (int a){
        System.out.println(a*3);
    }
    // void dısındaki return type'larda method body'i içinde "return" key word kullanılmalıdır
    public static int indirim(int gomlekUcreti){
      return   gomlekUcreti -10;
    }



}

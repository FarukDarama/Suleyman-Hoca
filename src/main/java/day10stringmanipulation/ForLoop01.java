package day10stringmanipulation;

public class ForLoop01 {
    public static void main(String[] args) {
        // Example 1: Ekrana 5 kere "Hi!" yazdırın.
        // Tekrarlı işler için "loop" kullanırız.
        // 4 ceşit loop var
        /*
        1) for-loop
        2) while loop
        3) do while loop
        4) for each loop
         */
       // for parantezinin içinde 3 bölme olacak ve bölmeler ; ile ayrılacak.
        // Baslangıc degeri ;loop hangi şartta çalışacak;Increment(Artırma) veya Decrement(Azaltma)
        for (int i=1       ;     i<6                   ;                 i++){
            System.out.println("Hi");
        }
        // Example 3. 4 den 7 ye kadar tüm tamsayıları ekrana yazdıran kodu yazdırın
        for (int i=4;i<8;i++){
            System.out.println(" "+i);
        }
        System.out.println("========");
        // Example 3 14 den 5
        for (int i =14;i>4;i--){
            System.out.print(i+" ");
        }
        System.out.println("========");
        // 14 den 5 e kadar tüm çift sayılar
        for (int i =14;i>4;i=i-2){
            System.out.print(i+" ");
        }
        System.out.println("========");
        // 2. Yol
        for ( int i =14; i>4 ;i--   ){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // example 6 . 28 den 157 ye kadar tek sayıalar
        for ( int i =28; i<158 ;i++   ){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // Example 7. "Java" Stringini J*a*v*a* Stringine ceviriniz
        String str ="Java";
        for (int i=0 ; i<str.length(); i++  ){
            System.out.print(str.charAt(i)+"*");//J*a*v*a*
        }
        System.out.println();
        //Example 8. Stringini de tekrarsız karakterleri ekrana yazdırın
        String s="Hellooo Ali";
        for (int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if (s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }
        }
























    }
}

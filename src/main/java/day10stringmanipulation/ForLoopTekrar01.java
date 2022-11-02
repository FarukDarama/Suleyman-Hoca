package day10stringmanipulation;

public class ForLoopTekrar01 {
    public static void main(String[] args) {
        // Example 3. 6 den 13 ye kadar tüm tamsayıları ekrana yazdıran kodu yazdırın
        for (int i=6;i<14;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //18 den 4 e kadar tüm çift sayılar
     for (int i =18;i>3;i--){
         if (i%2==0){
             System.out.print(i+" ");
         }
     }
        System.out.println();
        // example 6 . 28 den 157 ye kadar tek sayıalar
       for (int i=28;i<79;i++){
           if (i%2!=0){
               System.out.print(i+" ");
           }
       }
        System.out.println();
        // Example 7. "Javalarca" Stringini J*a*v*a* Stringine ceviriniz
        String a="Javalarca";
        for (int i=0;i<a.length();i++){
            char aIndex=a.charAt(i);
            System.out.print(aIndex+"*");
        }
        System.out.println();
        //Example 8. "Hellooo Ali" Stringini de tekrarsız karakterleri ekrana yazdırın
        String c="Hellooo Ali";
        for (int i=0;i<c.length();i++){
            char cHarf=c.charAt(i);
            if (c.indexOf(cHarf)==c.lastIndexOf(cHarf)){
                System.out.print(cHarf);
            }
        }
        System.out.println();
        // "Merhaba Faruk nasıl gidiyor? daki tekrarsız karakterleri yazdırın .
        String f ="Merhaba Faruk nasıl gidiyor?";
        for (int i=0;i<f.length();i++){
            char harf =f.charAt(i);
            if (f.indexOf(harf)!=f.lastIndexOf(harf)){
                System.out.print(harf);
            }
        }










    }
}

package day06nestedifswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

     /*
     Pasword ün ilk harfi büyük ise
     'A' olursa gecerli password aksi halde gecersiz password
     Passwordun ilk harfi kucuk harf ise 'z' olursa gecerli password aksi halde
     gecersiz password
      */
        // Java nested kodları calıştırırken cok zaman harcar buna "Time Complexity" denir.
        // Bu yuzden mumkunse nested kullanmamak gerekir.

        String pwd = "Zxy12!";
       if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){
           if (pwd.charAt(0)=='A'){
               System.out.println("Gecerli Password");
           }else {
               System.out.println("Gcersiz Password");
           }
       }else if (pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){
           if (pwd.charAt(0)=='z'){
               System.out.println("Gecerli Password");
           }else {
               System.out.println("Gecersiz Password");
           }
       }









    }//main
}//class

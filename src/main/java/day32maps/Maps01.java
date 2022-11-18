package day32maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps01 {
    //Size verilen bir cumledeki her kelimenin kac kere kullanıldıgını gosteren kodu yazınız
    //I like to move it, move it. ==I=1, like=1, to=1,move=2,it=2;
    public static void main(String[] args) {
        String str ="I like to move it, move it.";
        //Noktalama işaretlerini sil
       str = str.replaceAll("\\p{Punct}","");

       // Split()
        String kelimeler[] = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        HashMap<String,Integer> gorunum = new HashMap<>();
        for (String w:kelimeler){
            Integer gorunumSayi= gorunum.get(w);
            if (gorunumSayi==null){
                gorunum.put(w,1);

            }else {
                gorunum.put(w,gorunumSayi+1);
            }
        }
        System.out.println(gorunum);

    }
}

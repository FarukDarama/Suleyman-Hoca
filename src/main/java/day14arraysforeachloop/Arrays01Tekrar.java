package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01Tekrar {
    public static void main(String[] args) {
        //Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
        String arr[]={"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w :arr){
            System.out.print(w +" ");
            if (w.equals("Tom")){
                break;
            }

        }
        System.out.println();
        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        for (String w :arr){
            if (w.equals("Tom")|| w.equals("Jane")){
                continue;
            }
            System.out.print(w +" ");
        }
        //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a
        //            yuklemesini saglayan kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kac isim gireceginizi yazin");
        int isimSayisi =input.nextInt();

        String isimArr[]=new String[isimSayisi];
        System.out.println("Girişi sonlandırmak için 'q'ya basin ");
        for (int i=1;i<isimArr.length;i++){
            System.out.println("Lutfen "+i+". ismi giriniz");
            String ogrenciIsım =input.next();
            if (ogrenciIsım.equalsIgnoreCase("q")){
                break;
            }
            isimArr[i-1]=ogrenciIsım;

        }
        System.out.println(Arrays.toString(isimArr));











    }
}

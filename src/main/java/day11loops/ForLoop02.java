package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example 1.  Bir String deki m karakteri hariç tüm karakteri yazdırın
        // Andromeda ==> Androeda
        // 1.Yol
        String str = "Adam";
        for (int i = 0 ;i<str.length() ;i++ ){
         char c =str.charAt(i);
         if (c!='m'){
             System.out.print(c);
         }

        }
        // 2. Yol
        for (int i = 0 ;i<str.length() ;i++ ){
            char c =str.charAt(i);
            if (c=='m'){
                continue;// loop'un icinde bazi degerler icin Loop'un calişmamasini isterseniz continue kullanınız
            }
            System.out.print(c);
        }
        System.out.println();
       // Example 2. 1 den 100 e kadar tum sayıalrı ekrana yazdırın 6 ile bölünenler hariç
        for (int i =1;i<101;i++){
            if (i%6==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        // Example 3. Size verilen bir string deki m den önceki karakterleri yazdırınız
        //Lüxemburg==>Lüxe

        String s="Luxemburg";
        for (int i =0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='m'){
                break;// Herhangi bir yerde loop u kırmak için loop kullanırız
            }
            System.out.print(c);
        }











    }
}

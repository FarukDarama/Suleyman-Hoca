package day12loops;

public class DoLoopTekrar01 {
    public static void main(String[] args) {
        // Example 1. Bir ondalık sayının ondalık kısmındaki rakamları topamını bulunuz
        // 24.5673==> 21
        double sayi=24.5673;
       String stringSayi = String.valueOf(sayi);
       String ondalık =  stringSayi.split("\\.")[1];
       int ondalikSayi = Integer.valueOf(ondalık);//5673
        int sum =0;
        for (int i =ondalikSayi;i>0;i/=10){
         sum = sum+i%10;
        }
        System.out.println("sum = " + sum);


    }
}

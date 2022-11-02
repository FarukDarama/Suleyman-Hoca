package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        int i=1;
        while (i<1){
            System.out.println("While loop");// While loop bazı durumlarda hiç çalışmayabilir
            i++;                             // yani while loop için zero execution mümkündür
        }
        int k =1;
        do{
            System.out.println("do-while-loop");// do-while da loop bodysi içindeki kod
            k++;                                // en az bir kere calısır.yani zero exacution münkün degildir
        }while (k<1);
    // Example 1. Bir ondalık sayının ondalık kısmındaki rakamları topamını bulunuz
        // 24.5673==> 21
     double num=24.5673;
        String str= String.valueOf(num);//String.valueOf() methodu parantezin içine konulan data tipini Striny yapar
        System.out.println(num);
        System.out.println(str);
        // Regex için . kullandıgınızda önüne \\ koyunuz.Yani nokta \\. seklinde kullanılır
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

      int decimalInt =  Integer.valueOf(decimalPart);
        System.out.println(decimalInt);
        int sum =0;

        do{

         sum = sum +decimalInt%10;

        decimalInt =  decimalInt/10;

        }while (decimalInt>0);
        System.out.println(sum);





    }
}

package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        /*
        ArrayList'ler ayni data tipine sahip bir den fazla datayi depolamak için kullanılıri
        Array ile ArrayList'in farkı neddir?
        1)Array olusturuken içine kac eleman koyacagımızı söylemeliyiz ve
        içine söylediginizden fazla koyamazsınız.Arrayler eleman sayisinda "fixed" dirler.
        ArrayList'leri olustururken eleman sayısı söylemeye gerek yok, cunku eleman sayısında felxibledirlar.
        2)Arraylerin içine primitive ve refenceler konulur,ArrayList lere ise "non-primitive"ler konulur
        3)Arrayler super fast dir cok hızlı ve memory i cok az kullanlır.
        Note :Eleman sayisi kesin belli olan coklu dataları deoplamak için Arrayi kullanırız.
              Eleman sayisi kesin belli degilse ArrayList kullanılır.
         */
       //ArrayList nasil olusturulur
        //1.Yol
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2. Yol
        ArrayList<Integer> heights = new ArrayList<>();
        //3. Yol
        List<Integer> nums = new ArrayList<>();

        // ArrayListler nasil yazdırılır?
        System.out.println(nums);//[]

        // ArrayListlere nasil eleman eklenir
        //add() methodu herzaman elemani en sona ekler.Buna (insertion order) denir

        nums.add(21);
        nums.add(18);
        nums.add(20);
        nums.add(1,50);
        System.out.println("nums = " + nums);
        List<Integer> prices =new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(prices);
        System.out.println(nums);
        nums.addAll(2,prices);
        System.out.println(nums);
        //ArrayList!lerin eleman sayisi nasil bulunur.
        int elemanSayisi=nums.size();
        System.out.println("elemanSayisi = " + elemanSayisi);
        //ArrayListlerden belli bir eleman nasil alınır.
        //get() methodu istenen bir index deki elemanı verir.
        int eleman1 = nums.get(3);
        System.out.println("eleman1 = " + eleman1);
        //ArrayList in boş olup olmadıgını nasil anlarız.
        boolean bos1 = nums.isEmpty();
        System.out.println("bos1 = " + bos1);
        //ArrayList de bir eleman nasıl degiştirilir.
        nums.set(3,200);
        System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]
        //Example 1: nums ArrayListendeki tüm tek sayıları 11 artırtıkdan sonra ekrana yazdırırnız.
        for (int w:nums){
            if (w%2!=0){
                nums.set(nums.indexOf(w),w+11);
            }
        }
        System.out.println(nums);
        // remove() methodunun içine tam sayi koyarsanız java onu index kabul eder.
        //Note 1:Tüm sayilar aksi söylenmedikce Java için primitivedir yani int'dir.
        //Note 2:Primitiveler arraylistlerin elemani olmazlar.
        //Note 3:Primitive yi wrapper class a ceviriseniz,non-primitive olur ve ArrayListlerin elemani olur
        //Birden fazla aynı eleman varsa Java ilk görünümü siler.

        Integer sayi=200;
        nums.remove(sayi);
        System.out.println(nums);




    }
}

package day16multidimensionalarraysarraylists;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {

        // Bir m.d.. arraydeki en büyük ve en küçük elemanların toplamını veren kodu yazın
        int arr[][]={{2,5,1},{83,75}};
        int maxElement =arr[0][0];
        int minElement =arr[0][0];
        for (int[] w:arr){
            for (int k :w){
            maxElement = Math.max(maxElement,k);
            }
        }
        System.out.println("maxElement = " + maxElement);

        for (int[] w:arr){
            for (int k :w){
              minElement = Math.min(k,minElement);
            }
        }
        System.out.println("minElement = " + minElement);
        System.out.println("Toplam: "+(minElement+maxElement));




    }
}

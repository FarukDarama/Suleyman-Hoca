package day15arraysmultidimesionalarrays;

public class MultiDimensionalArrays02Tekrar {
    public static void main(String[] args) {
        // Bir String multi.... array'de içinde a olan elemanları konsola yazdırın
        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        int counter=0;
        for (String[] w :brr){
            for (String k:w){
                if (k.contains("a")){
                    System.out.println(k);
                }
            }
        }






    }
}

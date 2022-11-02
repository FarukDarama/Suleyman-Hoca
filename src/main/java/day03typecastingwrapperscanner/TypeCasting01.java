package day03typecastingwrapperscanner;

public class TypeCasting01 {

    // Typecasting bir numeric data tipini diger numeric data tipine cevirmek demektir.
    //        byte < short < int < long < float < double
    // Kucukten buyuge gidise Auto widening denir.
    // Buyukten kucuge explicit narrowing denir.

    public static void main(String[] args) {

        byte age = 23;
        int newAge= age;
        long population = 1234;
        int newPopulation = (int)population;
    // Shortu doubleye ceviren kodu yazınız
    // Float ı byte yapan kodu yazınız.
     short okulMevcut = 1234;
     double sehirPopulation=okulMevcut;
      float hucreSayisi= 123456F;
      byte sinifMevcudu=(byte)hucreSayisi;



    }
}

package day03typecastingwrapperscanner;

public class WrapperClasse01 {
    public static void main(String[] args) {

        Byte b1=13;
        System.out.println( Byte.MAX_VALUE);
        System.out.println( Byte.MIN_VALUE);

        Short s1 =12;
        System.out.println( Short.MAX_VALUE);
        System.out.println( Short.MIN_VALUE);
        Integer i=13;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Long l=27L;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        // Primitiveler nasıl Wrapperlara cevrilir.
        float f1 = 13.99F;
        Float wrapperf1 = f1;
        // primitiveyi wrapperlara cevirmeye autobaxing deniyor.
        // Wrapperlar nasıl primitivelere cevrilir.(Unbaxing)
        Character w1 = 's';
        char primitiveW1 = w1;
        // Autobaxing ve Unbaxing Java tarafından otomatik olarak yapılır.


      }
}

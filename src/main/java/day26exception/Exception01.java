package day26exception;

public class Exception01 {
    public static void main(String[] args) {

        String str ="123";
     int result =  convertStringToInteger(str);
        System.out.println(result+5);//128
       String st ="1a2b";
      int r = convertStringToInteger(st);//NumberFormatException:Eger icinde rakamdan farkli karakter barındırıan bir string in
        // value of() mrthodu kullanarak Integera cevirmek isterseniz NumberFormatException alirsiniz
        System.out.println(r+10);

    }

    public static int convertStringToInteger(String str){ //method

        int i =0;
        try {
          i =  Integer.valueOf(str);
            System.out.println("Burayi try bolumu");
        }catch (NumberFormatException e){
            System.out.println("Rakam olmayan karakter iceren Stringler Integer'a cevrilemezler");

        }

        return i;
    }


}

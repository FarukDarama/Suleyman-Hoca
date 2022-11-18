package day26exception;

public class Exceptions02 {
    public static void main(String[] args) {

       char ch1 = getCharFromString("Java",2);
        System.out.println(ch1);
       char ch2 = getCharFromString("Selenium",8);
        System.out.println(ch2);//StringIndexOutOfBoundsException:Eger bir Stringden karakter veya karakterler
        //alırken olmayan bir index kullanılırsa bu hata alinir.


    }

    public static char getCharFromString(String str,int idx){

        char c=' ';
      try {
       c = str.charAt(idx);
      }catch (StringIndexOutOfBoundsException e){
         // System.out.println("Index ile ilgili bir problem olustu");
        System.out.println(e.getMessage());
        e.printStackTrace();//datayli log icin bu kullanılır

      }
      return c;


    }

}

package day25exception;

public class E03 {
    public static void main(String[] args) {
       String str="Ali";
       getNumOfChars(str);//
        String s="";
      getNumOfChars(s);//0
        String t = null;
        getNumOfChars(t);//NullPointerException
        // Eger lenght() methodunda null kullanırsanız bu exceptionu alırsınız



    }
    //Bir String de bulunan karakterlerin sayısını bulabilmek için bir method olusturunuz

    public static void getNumOfChars(String str){
    try {
        System.out.println(str.length());
    }catch (NullPointerException e){
        System.out.println("Length() methodunda problem olustu");
        e.printStackTrace();


    }


    }






}

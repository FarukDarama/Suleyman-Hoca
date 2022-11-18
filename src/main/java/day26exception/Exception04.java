package day26exception;

public class Exception04 {
    public static void main(String[] args) {
      int age =250;
      try {
          printAge(age);
      }catch (IllegalArgumentException e){
          System.out.println(e.getMessage());
      }




    }

    //Yasi ekrana yazdıran method yazdırın

    public static void printAge(int age){
        if (age<0 || age>200){
            throw new IllegalArgumentException("Yas negatif olamaz veya 200den buyuk olamaz");
        }else {
            System.out.println(age);
        }

    }
}

package day27exceptions;

public class Exceptions03 {
    /*
      1)Java exceptionlar olusturarak  Developerlarin Java kurallarına uymalarini temin etmiştir
      2)Bizde application uretirken kendi exceptionlarımızı olusturarak diger developerların bızım ortaya
        koydugumuz kurallara uymalarını temin ederiz
      3)Java nin degil, bizim ürettiğimiz exceptionlara "Custom Exception" denir
      4)Custom Exceptionlarda RunTimeException ve CompileTimeException olabilir.
      5)Custom "RunTimeException uretmek icin  exteds RuntimeException deriz
      6)Custom "CompileTimeException" üretmek için "extends Exception" deriz
     */
    public static void main(String[] args) throws IllegalGradeException {

        printGrades(20);
        checkNameFormat("Ali");


    }

    // Ogrenci notlarını yazdıran bir method olusturunuz
    public static void printGrades(double grade) throws IllegalGradeException {
        if (grade<0 || grade>100){
            throw new IllegalGradeException("Grade 0 dan az 100 den buyuk olamaz");
        }else {
            System.out.println(grade);
        }
    }
    //Verilen ismin ikl harfinin buyukharf olmaması durumunda exception atan method yazınız
    public static boolean checkNameFormat(String name){
        if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else {
            throw new IllegalNameException("Isımler buyuk harf ile başlar");
        }
    }




}

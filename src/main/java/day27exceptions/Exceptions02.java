package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    /*
    1)FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
     new den sonrak FileInputStream kısım hata verir.Cunku biz javaya verilen adresdeki dosyaya git dedik
     Java iki endişeye kapıldı a) ya verilen adres yanlış ise b) ya verielen adreste dosya yoksa
     Biz method isminden sonra "throws FileNotFaoundException yazarak,Java'ya bu iki endise duydugun durum olursa
     Exception at dedik.
    2)while ((k= fis.read()) !=-1){} yazdıgımızda read methodu hata verir cunku biz javaya dosyadaki karakterleri oku dedik
      Java bir endişeye kapıldı a) ya okuması gereken karakterler javanın bilmediği karakterler ise
      Biz method isminden sonra  "throws IOException yazarak  Javaya bu durumile karsılaştıgında Exception at dedik.
     3)Methıd isminden sonra throws IOException yazarsanız Java throws FileNotFoundExceptionu i siler
      cunku IOException, FileNotFoundException'i kapsar cunku diğerinin parentidir.
      IOException: Input Output Exception demektir.
      4)Gordugunuz gibi IOException ve FileNotFoundException biz kod yazarken ,daha run button una basmadan ortaya cıktı
      Bu tarz Exceptionlara "Compile Time Exception denir.diğer adları Checked Exceptionlardır.
      "Compile Time Exception" lar kesinlikle handle edilmelidir.(Exception Handling) halletmeden code yazmaya devam edemeyiz.
     */
    public static void main(String[] args) throws IOException {
        readTheTextFromTheFile();
        readTheText();

    }
    //Bir text file daki texti okuyan kodu yaziniz.
    //1.    Yol
    public static void readTheTextFromTheFile() throws IOException {//dosyayı bulamazsan beni ara

        FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
      int k =0;
      while ((k= fis.read()) !=-1){

          System.out.print((char)k);
      }

    }
    //2.Way
    public static void readTheText(){

        try {
            FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
            int k =0;
            while ((k= fis.read()) !=-1){

                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosyanin adresi veya varligi ile ilgili bir problem var");
        } catch (IOException e) {
            System.out.println("Dosyada okunamayan bir karakter var");
        }


    }



}

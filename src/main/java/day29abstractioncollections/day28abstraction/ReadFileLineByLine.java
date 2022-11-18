package day29abstractioncollections.day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
                      "throw" ile "throws" arasındaki farklar nelerdir?
      1) "throw" methodun bodysi icinde kullanılır. "throws" methodun () inden sonra kullanılır
      2) "throw" dan sonra object olusturulur.zthrows"dan sonra ise sadece Exception Classin ismi yazilir.
      3) "throw" methodun icinde istedigimiz yerde Exception uretmek için kullanılır."throws" ise var olan
      checked Exception'i atmak icin kullanilir.
      4) "throw" dan sonra sadece bir tane Exception olabilir.
          "throws"dan sonra 1 den fazla Exception olabilir
 */
public class ReadFileLineByLine {

    public static void main(String[] args) {

     readFileLineByLine();

    }

    public static void readFileLineByLine(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/day27exceptions/File1.txt"));
          String line = br.readLine();
          while (line!=null){
              System.out.println(line);
             line = br.readLine();

          }
        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis yada dosya silinmis-"+e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak character veya characterler var -"+e.getMessage());
        }
    }

}

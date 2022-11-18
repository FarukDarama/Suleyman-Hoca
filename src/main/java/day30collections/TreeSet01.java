package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    /*
    TreeSet tekrarsiz elemanlari "alfabetik veya kucukten buyuge"(Natural Order) göre dizer.
    TreeSet cooooook yavas calişir.
    Note: Tekrarsiz elemanlari natural order da depolamak icin TreeSet kullanmak mantıklıdır ama TreeSetler coook yavas oldugu için biz
    elemanlari önce HashSet e depolariz sonra HashSet i TreeSet e ceviririz.
     */

    public static void main(String[] args) {
        //Example 1:8 tane unique String elemanı alfabetik sırada depolayın.
        //1.Way:
      Long start1 =  LocalTime.now().toNanoOfDay();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);
        Long end1 =  LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);//3522000

        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");
        TreeSet myEmailsSorted =new TreeSet(myEmails);//HashSet i TreeSet e cevirme kodu.
        System.out.println(myEmailsSorted);
        Long end2 =  LocalTime.now().toNanoOfDay();//229000
        System.out.println(end2-end1);

    }
}

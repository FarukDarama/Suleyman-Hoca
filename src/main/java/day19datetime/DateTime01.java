package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1: Anlık tarihi(Current Date) ekrana yazdıran kodu yaziniz.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// 2022-10-21

        //Example 2: Anlık zamani(Current Time) ekrana yazdıran kodu yaziniz.

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //Example 3: Anlık tarihi(Current Date) ve anlik zamani(Current Time) ekrana yazdıran kodu yaziniz

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Example 4: Japonya daki Anlık tarihi(Current Date) ve anlik zamani(Current Time) ekrana yazdıran kodu yaziniz

         LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
         System.out.println(currentDateTimeInJapan);

         //Example 5: Istanbul daki Anlık tarihi(Current Date) ve anlik zamani(Current Time) ekrana yazdıran kodu yaziniz

         LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
         System.out.println(currentDateTimeInIstanbul);

         //Example 6: Bugunden 789 gün sonra emekli olacagınıza gore emeklilik tahini hesaplayan kodu yazınız
         LocalDate countDate =  LocalDate.of(2022,10,21);
         LocalDate retireDate = countDate.plusDays(789);
         System.out.println("retireDate = " + retireDate);
         //Example 6: Ikı cocugunuz dogum tarihleri arasındaki farkı gun olarak hesaplayan kodu yazın

         LocalDate dobAli =  LocalDate.of(2005,5,17);
         LocalDate dobVeli =  LocalDate.of(2013,2,8);
         Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);// between kullanıldıgında gecmis tarih daha önce tazilie
         System.out.println("diff = " + diff);

         // Example 8 : Tom aliden 3 yıl8 ay 13 gün sonra dogdu. ali  ise veliden 1 yıl 15 gun önce dogdu
         // tom un dogum tarihi 18   kasım  2011 le alinin vee velinin dogum tarihi

         // LocalDate dobTom = LocalDate.of(2011,11,18);
         //LocalDate dobOfAli = dobTom.minusYears(3).minusMonths(8).minusDays(13);// Method Chain

        // Example 8 : Istanbulun fethi ile cumhuriyetin kurulması arasında kac ay oldugunu bulun
        //29 may 1452
        //29 ekim 1923
        LocalDate istanbulFethi = LocalDate.of(1453,5,29);
        LocalDate cumhuriyetKurulus = LocalDate.of(1923,10,29);
        Long aySayisi =  ChronoUnit.MONTHS.between(istanbulFethi,cumhuriyetKurulus);
        System.out.println("aySayisi = " + aySayisi);

        // Example 9 : Verilen tarih in hangi burcta oldugunu gosteren kodu yazınız
        LocalDate myDate = LocalDate.of(1989,12,7);
        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        System.out.println("day = " + day);
        System.out.println("month = " + month);
        if ((day>21 )){
            if (month==3){
                System.out.println("Boga Burcu");
            }
            if (month==4){
                if (day<20){
                    System.out.println("Boga Burcu");
                }
            }
        }




    }
}

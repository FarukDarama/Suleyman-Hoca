package daystatickeywordencapsulation;

public class StudentRunner {
    public static void main(String[] args) {

      Student std1 = new Student();
        System.out.println( std1.getSdId());
        System.out.println(std1.getGpa());
        System.out.println(std1.isRetired());

        std1.setSdId("AB");
        System.out.println( std1.getSdId());
         std1.setGpa(4.0);
        System.out.println(std1.getGpa());
        std1.setRetired(true);
        System.out.println(std1.isRetired());

        Student std2 = new Student();

        System.out.println( std2.getSdId());//TH202201 ueni obje ile yaptıgım icin orjinal degeri aldi
        


    }
}

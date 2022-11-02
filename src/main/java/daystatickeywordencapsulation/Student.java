package daystatickeywordencapsulation;
//Encapsulation:Data Hiding(gizlemek) demektir
//Datayi dis etkenlerden korumak için
//Datayi acces modifierini "private" yaparak gizlerim
//Datayi gizldekten sonra baska classlardan okumak istersek ne yaparsın?
//Cevap:"get" methodlar(getter) olusturarark gizlediğimiz datalari okunur hale getirebiliriz
//Datayı gizledikten sonra baska classdan degistirmek istersen ne yaparsın?
//Cevap:"set" methodlar(setter) olusturarark gizlediğimiz datalari degistirebiliriz
//Variablenin data type ile get methodun return type ayni olmalıdır
//get methodlari isimlendirirken ( "get" + variable name ) ancak variablenin
// data typei boolean ise (is + variable name) yapılır

public class Student {

   public String stdName="Tom Hanks";
   private String sdId ="TH202201";
   private double gpa = 3.8;
   private  boolean retired =false;


    public String getSdId() {
        return sdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setSdId(String sdId) {
        this.sdId = sdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}

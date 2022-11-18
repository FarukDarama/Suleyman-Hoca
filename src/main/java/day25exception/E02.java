package day25exception;

public class E02 {
    public static void main(String[] args) {
        String arr[] ={"Ali","Can","Veli","Han"};

     getElementFromArray(arr,2);//Veli
     getElementFromArray(arr,0);
     getElementFromArray(arr,4);//ArrayIndexOutOfBoundsException

    }
    //Bir string arrayden index girerek eleman elde edebilmek icin bir method olusturun
    public static void getElementFromArray(String arr[], int idx){

        try {

            System.out.println(arr[idx]);

        }catch (ArrayIndexOutOfBoundsException e){
             //bu bizim teknik olmayan acıklamamız
            System.out.println("Array index'de bir problem meydana geldi===>"+e.getMessage());
            //Exception ile ilgili datalica teknik mesaj verir
            e.printStackTrace();
            //Hata mesajını diger mesajlardan ayırmak icin renki yazdırır.
            System.err.println("Array index de bir problem yaşandı");
        }

    }


}

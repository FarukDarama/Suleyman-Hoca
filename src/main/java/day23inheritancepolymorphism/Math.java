package day23inheritancepolymorphism;

public class Math extends Courses {

    public  void practice(){

        System.out.println("Solve questions");
    }
    public Math(){
    super("");// super dedigimiz icin parent a gidecek parantex icinde string deger koydugum ıcın yukardaki sıtrıng parametreli
                 // constructor i kullanacak
        System.out.println("1");
    }

    public Math(int a){
        this();//Aynı classın icinde diger parametresiz  constructori kullan demek
        System.out.println("2");
    }

}

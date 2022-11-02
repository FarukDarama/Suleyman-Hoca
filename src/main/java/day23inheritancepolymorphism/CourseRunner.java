package day23inheritancepolymorphism;

public class CourseRunner {
    public static void main(String[] args) {

      // Math math = new Math(); //Object olusturduk math ile calıstıgımız için
      //  math.liveSessions();   //math deki ve onun parentendaki methodlar gözüküyor
      //  math.practice();

      Math math = new Math(6);//Math classının constructor ını kullan icinde int parametreli olanı

    }
}

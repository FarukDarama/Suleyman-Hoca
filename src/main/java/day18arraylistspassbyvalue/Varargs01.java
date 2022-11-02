package day18arraylistspassbyvalue;

public class Varargs01 {
    /*
    1)  Farklı sayılardaki parametreler ile calısabilen bir method olusturmak ısterseniz varargs kullanmalısınız
    2)  Varargs arka tarafda Array kullanır bu yuzden varargslar ile calısırken
        arrayler ile calısıyor gibi davranabilirsiniz
    3)  Varargs olusturmak ıcın "<data tip>...  <varargs ismi>" veya "<data tip>  ...<varargs ismi>"
    4)  Bir methodda varargs in yanında baskabir para metre kullanılabir mi ?
        "varargs" en sonda olmak sartı ile kullanılabilir.
     5) Bir methodda bir den fazla varargs kullanılabilir mi ?
        "varargs" en sonda olmak zorunda oldugundan birden fazla kullanırsanız en az biri en sonda olmayacaktır bu da
        4. madde ile çelişir.

     */
    public static void main(String[] args) {

        int r1 =  add(2,3);
        System.out.println("r1 = " + r1);//5

        int r2 =  add(2,3,4);
        System.out.println("r2 = " + r2);//9

        int r3 =  add(2,3,4,5,6,7,8,9);
        System.out.println("r3 = " + r3);//9




    }
    // Ikı sayısını toplamını return eden bir method olusturunuz

   /* public static int add(int a,int b){
      return   a+b;

    }
    // Uc sayısını toplamını return eden bir method olusturunuz
    public static int add(int a,int b,int c){
      return   a+b+c;

    }
    // Uc sayısını toplamını return eden bir method olusturunuz
    public static int add(int a,int b,int c,int d){
        return   a+b+c+d;
    }*/
    // Istedigimiz kadar sayıyıyı toplayabilecegimiz bir method olusturalım
    public static  int add ( int...a){
        int sum =0;
        for (int w : a){
           sum = sum +w;
    }

     return sum;
    }





}

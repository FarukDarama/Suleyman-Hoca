package day24statickeywordencapsulation;

public class CarRunner {
    /*
    Static keyword classa baglanmıs class elemanlaridir
    Static class elemanlari butun objelerin ortak elemanidir(Gokteki ay gibi)
    Staticler uzerinde yapilan her degisiklik butun obeleri etkiler, butun objeler tarafindan gorulur.
    Static class elemanlarina class uzerinden ulasilir. Objeler staticlere ulasmak icin kullanilmaz.
       kullanimda hata vermez ama tavsiye edilmez.
    */

    public static void main(String[] args) {

        Car car1= new Car();
        Car car2= new Car();
        Car car3= new Car();
        Car car4= new Car();

        System.out.println(car1.counter);//Static variablelara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez
        System.out.println(car1.price);

        System.out.println(Car.counter);//Statik variablelara class ismi kullanılarak ulasılmalıdır.
        System.out.println(car2.price);


    }



}

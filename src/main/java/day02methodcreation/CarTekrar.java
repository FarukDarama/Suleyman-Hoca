package day02methodcreation;

public class CarTekrar {
    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {
        //Obje olusturuyoruz
        CarTekrar myHonda = new CarTekrar();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
        myHonda.hareketEt();
    }
    public void hareketEt(){
        System.out.println("Honda guzel hareket eder");
    }
    public void dur(){
        System.out.println("Honda guvenli durur");
    }


}

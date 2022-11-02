package day02methodcreation;

public class MethodCreationTekrar {
    public static void main(String[] args) {

        System.out.println(toplamaYapTekrar(1.2,5));
        System.out.println(ilkIkiSayıyıToplaSonraCarpTekrar(2,3,5));
        System.out.println(ucSayiyiCarpTekrar(2,1.5,6));
        System.out.println(carpmaYapTekrar(2,1.5,6));


    }
    public static double toplamaYapTekrar(double a, double b){
        return a+b;
    }

    public static double carpmaYapTekrar(double a, double b,double c){
        return a*b*c;
    }
    public static double ilkIkiSayıyıToplaSonraCarpTekrar(double a, double b,double c){
        return (a+b)*c;
    }
    public static double ucSayiyiCarpTekrar(double a ,double b,double c){
        return a*b*c;
    }

}


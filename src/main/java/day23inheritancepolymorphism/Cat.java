package day23inheritancepolymorphism;

public class Cat extends Mammel {

    public  void moew (){
        System.out.println("Cats meow");
    }

    @Override // @Override annotation'ini kullanarak Javanın yaptıgımız Overrşde işlemini kontrol etmesini saglar
    public void eat() {
        System.out.println("Cats eat");
    }
    @Override
    public int add(int a,int b){
        return a+b+1;
    }

    @Override
    public Integer multply(int a, int b) {
        return a*b+1;
    }
     //Asagıdaki method overrideing Method
    @Override
    public Mammel creat() {
        return new Mammel();
    }



    /*
    1)Override yaparken methodun bodysi degistirilir
    2)Override yaparken  asla method signature(isim ve para metre) degistrilemez
    3)Override yaparken inheritance olmak zorundadir
    4)Override yaparken access modifierlar belli kurallara göre farklılastırılabilirler
            i)private methodlar override edilemezler
            ii)Child Class daki override edilen methodun access modifieri Parent classdaki
            methodun access modifieri ile ayni veya genis olmaslı
            Note:Child classdakimethodun access modifieri daha dar olamaz
            iii)default methodlar aynı package icinde ise override edilebirler
            farkli package den override edilemezler
     5)Parent Class daki methodun return type i void ise return type degistirilmez
     6)Parent Class daki methodun return type i primitive ise return type degistirilmez
     7)Parent Class daki methodun return type i WrapperClass ise return type degistirilmez
     8)Parent Class daki methodun return type i ChildClass ise return type  childlardan biri olabilir
        Note:Child classdaki return type Parent classdakinden genis olamaz
        Note:Aralarında parent child ilişkisi olmayan Classlar overriding de return type degisiminde kullanılamazlar
        mesela Shor Integer dan kucuktur fakat aralarında parent child ilişkisi olmadıgından "Integer" yerine "Short"
        kullanamazsin.
     ===>   Note:Childe daki methodun Return typendan Parentdaki methodun return typena gidişte IS-A relationship olmali
        Note:Aralarında IS-A relationship olan data typelara Covariant denir
      9)  Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
           HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
      10)Final methodlar override edilemezler cunku mthod body degistirilir fakat final method
       body degistrilmesine musade etmez
       11)Polymorphism =Overloading + Overriding
           Note: Polymorphism nedir denince overloading ve overriding i anlatın
        12)Overloadin ile Overriding arasındaki farklar nedir?
           i)Overloading icin inheritance gerekemez Overriding icin gerekir
           ii)Private methodlar Overload edilebilir Override edilemezler
           iii)final methodlar Overload edilebilir Override edilemezler
           iv)Overloading static polymorphism olarak Overriding dinamik Polymorphism olarak adlandırılır
              Cunku static methodlar overload edilebilir,Override edilemezler.
            v)Overloading de method signature degişir ama overriding method signature a dokunulmaz.
     */




}

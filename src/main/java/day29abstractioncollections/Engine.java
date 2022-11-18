package day29abstractioncollections;

public interface Engine extends Vehicle{
    // Child        Parent
    // Class ---> Interface ==> implements
    // Class ---> Class     ==> extends
    // Interface ---> Interface ==> extends
    // Interface ---> Class ==> Mumkun degil
    //interfacelerdeki tum variableler otomatik(default) "public" olur
    //interface deki tüm variableler otomatik olarak final dir.
    //interface deki tüm variableler otomatik olarak static dir.

   int price=2000;
   double weight =23.5;
   void run();



}

package day12loops;

public class NestedLoopTekrar01 {
    public static void main(String[] args) {
        // Example 1. Aşagıdaki şekli ekrana yazdıran kodu yazın
        /*
         ****
         ****
         ****
         */
        for (int i=1;i<4;i++){
            for (int k=1;k<5;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Example 2. Asagıdaki şekli cizen kodu yazın
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        for (int i=1;i<6;i++){
            for (int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        //Example 3.
        /*
        Asagıdaki şekli cizen kodu yazın
        * * * *
        * * *
        * *
        *
         */
        for (int i =1;i<5;i++){
            for (int k =5;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}

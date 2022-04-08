package _07_ForLoop;

public class Q23 {
    public static void main(String[] args) {


/*
        * * * * * * * * * *
         * * * * * * * * *
          * * * * * * * *
           * * * * * * *
            * * * * * *
             * * * * *
              * * * *
               * * *
                * *
                 *

 */



        for (int satir = 1; satir <=10 ; satir++) {
            for (int bosluk = 1; bosluk <=satir ; bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz = 10; yildiz >=satir ; yildiz--) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}

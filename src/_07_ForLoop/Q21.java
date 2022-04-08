package _07_ForLoop;

public class Q21 {

    public static void main(String[] args) {

        /* TASK : aşagıdaki şekli console'a yazdırınız

         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********

         */
        for (int satir = 1; satir <= 9; satir++) {
            for (int satirIci = 1; satirIci <= satir; satirIci++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    }


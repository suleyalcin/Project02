package _07_ForLoop;

public class Q19 {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */

    public static void main(String[] args) {
        for (int satir = 1; satir <=5; satir++){
            for(int bosluk=satir; bosluk<5; bosluk++){
                System.out.print(" ");
            }
            for(int yildiz=1; yildiz<=satir; yildiz++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


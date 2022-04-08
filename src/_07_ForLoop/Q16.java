package _07_ForLoop;

public class Q16 {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */

        int harf = 6;
        for (int satir = 1, c = 'A'; satir <= harf; satir++, c++) {
            for (int sutun = 1; sutun <= satir; sutun++) {
                System.out.print((char) c + " ");
            }
            System.out.println();
        }
        //2.yol
        int h = 6;
        for (int i = 1, c = 'A'; i <= h; i++, c++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) c + " ");
            }
            System.out.println();

        }
        //3.yol
        int karakter = 65;
        for (int satir = 0; satir < 6; satir++) { //satır kontrolu
            for (int sutun = 0; sutun <= satir; sutun++) {//sutun kontrolu
                System.out.print((char) (karakter + satir) + " ");
            }
            System.out.println();

        }
    }
}
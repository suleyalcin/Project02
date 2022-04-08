package _07_ForLoop;

public class Q15 {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
    public static void main(String[] args) {
        char baslangic='A';
        char bitis='F';
        for (char i = baslangic; i <=bitis ; i++) {
            for (char j = baslangic; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}




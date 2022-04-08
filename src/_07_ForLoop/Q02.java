package _07_ForLoop;

public class Q02 {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

    int sayi=255;
    for (int i = 0; i <sayi ; i++){
        System.out.println(" sayi degeri: "+i+"==>"+"karakter degeri==> "+(char)i);


    }

    //2.yol
        for(int i=0; i<=255; i++){
            char karakter = (char)i;
            System.out.println(i+"=>"+karakter);
        }

    }
}



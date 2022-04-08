package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Karakter Giriniz");
        char harf=scan.next().charAt(0);
        String str="";
        str=harf>='a' && harf<='z' || harf>='A' &&harf<='Z'? (harf>='a' && harf<='z' ? "Kucuk Harf" : "Buyuk Harf")
                :"Harf Degil";


        System.out.println(str);
/*
        if (karakter>='A' && karakter<='Z' && karakter>='a' && karakter<='z'){
            if (karakter>='a'){
                System.out.println("Kucuk Harf");
            }else{
                System.out.println("Buyuk Harf");
            }
        }else{
            System.out.println("Harf degil");
        }
*/
    }
}

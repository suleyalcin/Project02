package _04;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre ,
// ayın kaç gün olduğunu sayı ile yazdırınız

Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ayın nunmarasını giriniz");
        int ay=scan.nextInt();
        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girdiğiniz ay 31 çeker");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girdiğiniz ay 30 çeker");
                break;
            case 2:
                System.out.println("Lütfen bukunduğunuz yılı gırınız");
                int yıl=scan.nextInt();
                if(yıl%4==0) {
                    System.out.println("Girdiğiniz ayda 29 gün var");
                }else{
                    System.out.println("Girdiğiniz ayda 28 gün var");
                }
                break;
                }





    }
}


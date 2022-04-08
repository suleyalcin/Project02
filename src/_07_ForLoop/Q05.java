package _07_ForLoop;

public class Q05 {

    public static void main(String[] args) {
        /* TASK :
Aşağıdaki şekilde çıktı veren programı print içerisinde
sadece bir tane # kullanarak yazıdırınız

           #####
           #####
           #####
           #####
           #####

         */
        char karakter='#';
        for (int sutun = 1; sutun <=5 ; sutun++) {
            // System.out.print("*");
            for (int satir = 1; satir <=5 ; satir++) {
                System.out.print(karakter);//print => satirlari yan yana yazmasi icin
            }
            System.out.println(); //yeni satirdan baslamasi icin
        }
    }
}



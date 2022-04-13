package _11_dateTime.HaftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

    List<Kullanici> kisiler = new ArrayList<>();//bos list create edildi
    public List<Kullanici> kayitAl(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi Giriniz : ");
        String isim=scan.nextLine();
        return kisiler;
    }

}

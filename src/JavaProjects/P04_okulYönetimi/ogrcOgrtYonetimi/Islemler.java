package JavaProjects.P04_okulYönetimi.ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrncListesi = new ArrayList<>();
    static ArrayList<Kisi> ogrtmListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;//ogretmen mi secti ogrenci mi secti ona gore bakicaz

    public static void girisPaneli() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;

            case "Q":
                cıkıs();
                break;
            default:
                System.out.println("hatalı giriş yaptınız  :(");
                girisPaneli();//recursive method call//35 .satir recursive call kodun devamliligini sagliyor
                break;


        }


    }

    private static void cıkıs() {
        System.out.println("agam eline sağlık yine bekleriz selametle   :)");
    }

    public static void islemMenusu() {
        System.out.println("Sectiginiz  Kişi turu: " + kisiTuru + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeyap();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("adam gibi bir şey girrr :( ");
                islemMenusu();

                break;
        }

    }


    //******************//
    private static void silme() {
        System.out.println("   ***   " + kisiTuru + "  silme sayfası   ***");
        System.out.println("");

        System.out.print("kimlik No giriniz : ");
        String kimlikNo = scan.next();
        if (kisiTuru.equals("OGRENCI")) {
            for (Kisi each : ogrncListesi
            ) {
                if (each.getKimlikNo().equals(kimlikNo)) {
                    ogrncListesi.remove(each);
                    System.out.println("Silindi");
                    break;
                } else System.out.println("Boyle biri bulunamadigindan silinemedi");

            }//ogrenciyse bodysi

        }   //ogretmense

        System.out.print("kimlik No giriniz : ");

        if (kisiTuru.equals("OGRETMEN")) {
            for (Kisi each : ogrtmListesi
            ) {
                if (each.getKimlikNo().equals(kimlikNo)) {
                    ogrtmListesi.remove(each);
                    System.out.println("Silindi");
                    break;
                } else System.out.println("Boyle biri bulunamadigindan silinemedi");

            }//ogretmense bodysi
        }


    }//silme metod bodysi

    ///*******************************///
    private static void listeyap() {

        System.out.println("   ***   " + kisiTuru + " listeleme sayfası   ***");
        System.out.println("");

        if (kisiTuru.equals("OGRENCI")) {
            for (Kisi each : ogrncListesi) {
                System.out.println(each.toString());
            }
        } else {//ogretmense
            for (Kisi each : ogrtmListesi
            ) {
                System.out.println(each.toString());

            }


        }//ogretmense bodysi


    }//listeyap metodunun bodysi


    ////********///
    private static void arama() {

        System.out.println("***" + kisiTuru + " arama sayfasi ");
        System.out.println("");//dummy hayalet komut ust uste sout yan yana olmasin diye

        System.out.print("kimlik No giriniz : ");
        String kimlikNo = scan.next();

        if (kisiTuru.equals("OGRENCI")) {//ogrenciyse
            for (Kisi each : ogrncListesi
            ) {
                if (each.getKimlikNo().equals(kimlikNo)) {
                    System.out.println(each.toString());
                } else
                    System.out.println("Kayit bulunamadi");


            }


        } else { //ogretmense
            for (Kisi each : ogrtmListesi
            ) {
                if (each.getKimlikNo().equals(kimlikNo)) {
                    System.out.println(each.toString());
                } else
                    System.out.println("Kayit bulunamadi");


            }//icteki ifin suslusu
        }//ogretmense else suslusu

    }//arama metodu suslusu


    //***** islem menusundeki EKLEME metodu**************
    private static void ekle() {
        System.out.println("   ***   " + kisiTuru + " ekleme sayfası   ***");
        System.out.print("ad soyad giriniz : ");
        scan.nextLine();//dummy hayalet komut
        String adSoyad = scan.nextLine();

        System.out.print("kimlik No giriniz : ");
        String kimlikNo = scan.next();

        System.out.print("yas giriniz : ");
        int yas = scan.nextInt();//ASIL AYRIM BURADAN SONRA BASLIYOR OGRENCIYSE OGRETMENSE YUKARIDAKILER ATADAN GELDI ORTAK

        if (kisiTuru.equals("OGRENCI")) {
            System.out.print("ogrenci No giriniz : ");
            String ogrcNo = scan.next();
            scan.nextLine();//dummy hayalet komut ARDISIK sCANNER CLASSLARI BITISIK YAZDIRMASIN DIYE

            System.out.print("sınıf giriniz : ");
            String sınıf = scan.next();

            Ogrenci sefilOgrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrcNo, sınıf);//p'li cons ogrc obj create edildi
            ogrncListesi.add(sefilOgrenci);
        } else {//OGRETMENSE
            System.out.print("sicil No giriniz : ");
            String sicilNo = scan.nextLine();
            System.out.print("bolum giriniz : ");
            String bolum = scan.nextLine();

            Ogretmen muhtesemOgretmen = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);//p'li cons ogrtm obj create edildi
            ogrtmListesi.add(muhtesemOgretmen);
        }//ekle metodunun else suslusu

    }//ekle metodu suslusu
    //**************************EKLE bitti***************************


}//class




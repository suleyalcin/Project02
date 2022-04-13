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
               // listele();
                islemMenusu();
                break;
            case 4:
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

    private static void arama() {




    }//arama metodu suslusu

    //***** islem menusundeki EKLEME metodu**************
            private static void ekle () {
                System.out.println("   ***   " + kisiTuru + " ekleme sayfası   ***");
                System.out.print("ad soyad giriniz : ");
                String adSoyad = scan.nextLine();
                scan.nextLine();//dummy hayalet komut


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
            //**************************EKLE bitti******************************

        }//class




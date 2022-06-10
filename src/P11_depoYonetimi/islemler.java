package P11_depoYonetimi;

import java.util.*;

import static P11_depoYonetimi.item.itemMap;
import static P11_depoYonetimi.mapler.miktar;
import static P11_depoYonetimi.urunTanimlama.*;

public class islemler {

    static Scanner scan=new Scanner(System.in);
    public static List<String> urunList= new ArrayList<>();
    public static void girisPaneli(){
        System.out.println("====================================\nDEPO YONETIM PANELI\n" +
                "====================================\n"
                + "1- URUN TANIMLAMA\n2- URUN LİSTELE\n3- URUN GİRİŞİ\n4- URUNU RAFA KOY\n5- URUN ÇIKIŞI");
        System.out.print("isleminiz seciniz : ");
        String secim= scan.next().toUpperCase(Locale.ROOT);
        switch (secim){
            case "1":
                urunTanımla();
                girisPaneli();
                break;
            case "2": //Jasmina, zeynep, merve
                urunListele();
                girisPaneli();
                break;
            case "3": // oğuzhan, fatih
                urunGirisi();
                girisPaneli();
                break;
            case "4"://gökhan, hüseyin
                urunuRafaKoy();
                girisPaneli();
                break;
            case "5":// defne, şule
                urunCikisi();
                girisPaneli();
                break;
            default:
                System.out.println("hatalı giriş yapınız");
                girisPaneli();
                break;
        }
    }
    public static void urunCikisi () {

        //	urunCikisi 		==> listeden urunu sececegiz ve urunun cikisini yapacagiz.
        //	burada urun listesinden sadece miktarda degisiklik yapilacak.
        //	urun adedi 0dan az olamaz. 0 olunca urun tanimlamasi silinmesin. sadece miktari 0 olsun.
        //	 * 		===> yaptigimiz tum degisiklikler listede de gorunsun.
        System.out.println("Lutfen cikisi yapilacak urunun id numarasini giriniz");
        int id = scan.nextInt();

        System.out.println("Cikartilmasini istediginiz miktari giriniz");
        scan.nextLine();//dummy
        int urunCikisi = scan.nextInt();

        String[] arr = itemMap.get(id).split(" ");
        int miktar = 0;

        Integer urunAdedi = scan.nextInt();
        LinkedList<String> list = new LinkedList<>(Arrays.asList(urunIsmi));

        if (urunAdedi > 0) {
            System.out.println(urunList.remove(urunIsmi));

        } else if (urunAdedi == 0) {
            System.out.println();
        } else

            urunListeYazdir();
    }



    private static void urunuRafaKoy() {
        urunListeYazdir();
    }
    private static void urunGirisi() {
        urunListeYazdir();
    }
    private static void urunListele() {
        urunListeYazdir();
    }
    public static void urunTanımla() {
        //List<String> urunList= new ArrayList<>();
        //urunTanimlama     ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.
        System.out.println("ürün ismi giriniz: ");
        urunIsmi = scan.next();
        urunList.add(urunIsmi);
        //scan.next();
        System.out.println("üreticisini giriniz: ");
        uretici = scan.next();
        urunList.add(uretici);
        //scan.next();
        System.out.println("birimi giriniz: ");
        birim = scan.next();
        urunList.add(birim);
        //scan.next();
        System.out.println("id giriniz: ");
        urunId = scan.nextInt();
        Map<Integer, List> urunListesiMap = new HashMap<Integer, List>();
        urunListesiMap.put(urunId, urunList);
        System.out.println(urunListesiMap);
    }
        public static void urunListeYazdir() {
            urunListeYazdir();
    }
    }

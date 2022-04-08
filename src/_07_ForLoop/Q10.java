package _07_ForLoop;



import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String girilenVeri = scan.next();
        //kullanıcıdan verı alın dedıgı ıcın once scaner scan yapıp verı alıyoruz


        char girilenharf = girilenVeri.length() < 2 ? girilenVeri.charAt(0) : '-';

        //girilen verinin uzunlugu ıkı karakterden kucukse yanı tek karakter ıse
        //girilen verinin ilk karakterını al eger ıkı karakterden uzunsa
        //  -  deger alsın ve yanlıs karakter ibaresını output olarak versın


        char[] sesliHarfler = {'a', 'e', 'i', 'o', 'u'};//list yaptık burde seslı harflerın lıstesını olusturduk

        boolean sesliHarfMi = false;//burda boolen bır verıable actık seslı harf olup olamdıgını kotrol etmesı ıcın

        boolean harfMi = girilenharf >= 97 && girilenharf <= 122 ? true : false;
        //burde turnary yapıp harfa arlıklarının ascıı degerlerını gırıp
        //sorulan karakterın bu ralıkta olup olmadıgına baktık
        // bu ralıkta ıse true degılse false versın istedım

        for (int i = 0; i < sesliHarfler.length; i++) {
            //burda ıf le girilen harfın
            // seslı harf olup olmadıgını kodunu yazdık cunku soruda
            //se sa varsa ıf var demektır

            if (sesliHarfler[i] == girilenharf) {
                // burdada girilen harfi sesli harf olup olmadıgını kontrol ettık
                sesliHarfMi = true;
                break;// sonunda da donguyu kırdık


            }

        }

        if (harfMi && sesliHarfMi) {//burda hem harf hemde seslı harfse sesli harf yazdırdık
            // cunku girilen deger harf dısında bır degerde olabılır

            System.out.println(girilenharf + " sesli harftir");

        } else if (harfMi == true && sesliHarfMi == false) {
            System.out.println(girilenharf + " sessiz harftir");
            // harf ama seslı harf degılse sessız haftır yadırdık

        }else System.out.println("Yanliş Karakter Girdiniz");
        // en son elslede bunların dısında bırseyse yanlıs verı gırdınız yazdırdık
    }
}




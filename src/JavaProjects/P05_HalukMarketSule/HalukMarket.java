package JavaProjects.P05_HalukMarketSule;

public class HalukMarket extends Methods {


    public static void main(String[] args) {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */

        String No[] = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10"};
        String urun[] = {"Domates ", "Patates ", "Biber ", "Sogan ", "Havuc ", "Elma ", "Muz ", "Cilek ", "Kavun ", "Uzum ", "Limon "};
        String Fiyat[] = {"2.10 TL", "3.20 TL", "1.50 TL", "2.30 TL", "3.10 TL", "1.20 TL", "1.90 TL", "6.10 TL", "4.30 TL", "2.70 TL", "0.50 TL"};
        System.out.println("No \t    Ürün \t\t  Fiyat");
        System.out.println("====\t=======\t  =========");

        for (int i = 0; i < urun.length; i++) {

            System.out.printf("%-6s  %-10s  %-10s\n", No[i], urun[i], Fiyat[i]);
        }

        urunSec(urunListesi, fiyatListesi);
    }
}

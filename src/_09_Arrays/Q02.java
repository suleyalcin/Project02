package _09_Arrays;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {


        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

         */
        int arr[][] = {{10, 20, 30}, {4}, {6, 7, 20}};
        int arrYeni[] = new int[arr.length];
        int toplam=0;


        for (int kat = 0; kat < arr.length; kat++) {//katlari dolasir auter arrayi dolasir

            for (int daire = 0; daire < arr[kat].length; daire++) {//daireleri dolasir inner arrayi dolasir
                arrYeni[kat] += arr[kat][daire]; //katlari kendi icinde topla
            }
        }
        System.out.println(Arrays.toString(arrYeni));



            // // verilen multi dimensional array'in tum elementlerinin toplamini bulunuz.
        //        int arr[][] = {{3, 1, 7,5}, {6, 10}};
        //        int toplam =0;
        //        for(int i=0; i<arr.length; i++){ //auter arrayin uzunluguna kadar gitsin
        //            for(int j=0; j<arr[i].length ;j++){ ////inner arrayin uzunluguna kadar gitsin
        //                toplam+=arr[i][j];
        //            }
        //        }
        //
        //        System.out.println("Arraydeki Elemntlerin toplami : "+toplam);

    }
}

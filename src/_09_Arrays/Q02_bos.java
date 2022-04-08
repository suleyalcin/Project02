package _09_Arrays;

import java.util.Arrays;

public class Q02_bos {
      /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

       */
        public static void main(String[] args) {

    int arr[][]= {{10,20,30},{4},{6,7,20}};
    int arrYeni[]=new int[arr.length];
    int toplam=0;


    for(int kat=0; kat<arr.length; kat++) { //katlari dolasir
        for (int daire = 0; daire < arr[kat].length; daire++) {//daireleri dolasir
            arrYeni[kat] += arr[kat][daire];//katlari kendi icinde toplar

        }

    }
            System.out.println(Arrays.toString(arrYeni));

      }//main
    }//class



package _09_Arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int[] arr1 = {1, 2, -3, 4, -5, -6};
        System.out.println("for each cozumu : ");


        for (int w : arr1) {
            w *= -1;
            System.out.print(w + ", ");

        }
        System.out.println(" ");
        System.out.println("method for cozumu : ");

        int arr[]={1,2,-3,4,-5,-6};

        System.out.println("Verilen Array : "+Arrays.toString(arr));

        System.out.println("Ters Isaretlisi:"+Arrays.toString(verilenArrayinTersIsaretlisiniYazdir(arr)));

    }

    private static int[] verilenArrayinTersIsaretlisiniYazdir(int arr[]) {
        for(int i=0; i<arr.length; i++){
            arr[i]*=-1;
        }
        return arr;
    }


}

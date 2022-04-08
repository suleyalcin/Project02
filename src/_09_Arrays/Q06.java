package _09_Arrays;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
	
	/*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	*/

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int min=arr[0];
        int max=arr[arr.length-1];

        int max2=arr[arr.length-2];

        System.out.println("En kucuk Sayi "+min);
        System.out.println("En buyuk Sayi "+max);
        System.out.println("Ikinci En Buyuk Sayi "+max2);





    }//main
}

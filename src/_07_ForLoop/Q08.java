package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */
    Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.nextLine();

        String terstenKelime="";
        for(int i=kelime.length()-1; i>0; i++){
            terstenKelime+=kelime.charAt(i);
        }
        System.out.println("Girdiginiz Kelimenin Tersten yazilisi "+terstenKelime);
            if(terstenKelime.equalsIgnoreCase(kelime)){
                System.out.println("YAzdiginiz Kelime :"+kelime+" Polindromdur");
            }else{
                System.out.println("YazdiginizKelime"+ kelime+" Polindrom Degil.");
            }
    }

}


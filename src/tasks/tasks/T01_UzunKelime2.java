package tasks.tasks;

import java.util.Scanner;

public class T01_UzunKelime2 {
    /* kullanıcıdan gelen cümleyi parametre olarak alan cümledeki en uzun kelimeyi return eden
   longestWord(sentence) methodu craete ediniz.
   Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, stringteki en uzun sozcugu return edilsin.
   Noktalama işaretleri dikkate almayın ve cumlenin boş olmayacağını varsayın.
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz.");
        String sentence=scan.nextLine().replaceAll("\\W"," ");
        Longestword(sentence);
    }
    public static String Longestword(String sentence) {
        String[] keimeler= sentence.split(" ");
        // System.out.println(Arrays.toString(keimeler));
        int enUzunKelime=0;
        int maxKelimeSayısı=0;
        for (int i = 0; i <keimeler.length ; i++) {
            if (keimeler[i].length()>maxKelimeSayısı) {
                enUzunKelime = i;
                maxKelimeSayısı = keimeler[i].length();
            }
        }
        System.out.println("en uzun kelime: "+ keimeler[enUzunKelime]);
        return sentence;
    }
}


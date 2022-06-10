package _17_Set;

import java.util.*;

public class Ex03 {
    /* TASK:

        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin

     */

    public static void main(String[] args) {
//  1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.

        ArrayList<Integer> list=new ArrayList<>();
        Random rndm=new Random();
        for(int i=0; i<30; i++){
            list.add(rndm.nextInt(10));
        }

//        2.  1. adımdaki arraylist print edin.
        System.out.println(list);
        tekrarsizList(list);

//        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.

    }

    private static void tekrarsizList(ArrayList<Integer> list) {
    }

//        4.  sonucu print edin
//        5.  Basta hazirlanan arraylist'i Set'e cevirin
//        6.  Hazirlanan bu Set'i de Arraylist'e cevirin


}


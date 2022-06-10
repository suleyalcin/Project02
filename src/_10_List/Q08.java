package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08 {

    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */
        String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        List<String>list=new ArrayList<>();
        for(int i=0; i<isimler.length; i++){
            list.add(isimler[i]);
        }
        System.out.println(list);
        String degisen1=  list.get(2);
        String degisen2=list.get(7);
        list.set(2,degisen2);
        list.set(7,degisen1);
        System.out.println(list);


    }

}

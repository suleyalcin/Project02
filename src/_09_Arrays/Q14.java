package _09_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q14<harfler> {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */

        String str = "Congratulations";
        String[] harfler = str.split("");// splitle parcaladık [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
        System.out.println(Arrays.toString(harfler));


        System.out.println(Arrays.toString(harfler).replaceAll("o", "i").replaceAll("a",
                "i").replaceAll("u", "i"));//replaceall ile istenen harfleri degistirdik [C, i, n, g, r, i, t, i, l, i, t, i, i, n, s]

        Collections.reverse(Arrays.asList(harfler));//degisen veriyi tersten yazdırdık

        System.out.println(Arrays.asList(harfler).toString().replaceAll("o", "i").replaceAll("a",
                        "i").replaceAll("u", "i").
                replaceAll("\\[","").replaceAll("]","").replaceAll(",",""));

    }
}





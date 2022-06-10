package _12_Varargs;



public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

        concat();



    }

    private static void concat() {

        String str1="m";
        String str2="e";
        String str3="r";
        String str4="v";
        String str5="e";

        String str6 = str1.concat(str2).concat(str3).concat(str4).concat(str5);
        System.out.println(str6);
    }


}


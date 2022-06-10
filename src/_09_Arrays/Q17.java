package _09_Arrays;

public class Q17 {
  /* TASK :
  Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
  Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

   */

    public static void main(String[] args) {


        String[] somun = {"m7", "m20", "m6", "m10", "m12", "m5"};
        String[] civata = {"m5", "m8", "m11", "m20", "m7", "m9", "m10"};

        for (int i = 0; i < somun.length; i++) {
            for (int j = 0; j < civata.length; j++) {
                if (civata[j].contains(somun[i])) {
                    System.out.println(civata[j] + " =civata " + " ," + somun[i] + " =somun ile uyumludur");
                }
            }
        }
    }
}

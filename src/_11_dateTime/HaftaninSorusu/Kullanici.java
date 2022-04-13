package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;

public class Kullanici {
    String name;
    LocalDateTime kayitZamani;

    public Kullanici(){//parametresiz cons.

    }

    public Kullanici(String name, LocalDateTime kayitZamani) {//Parametreli Cons.
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}

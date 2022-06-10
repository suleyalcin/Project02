package P11_depoYonetimi;

public class urunTanimlama {


    static int urunId;
    static String urunIsmi;
    static String uretici;
    static String birim;
    static int urunMiktar;
    static String raf;
    public urunTanimlama() {
    }
    public urunTanimlama(int urunId, String urunIsmi, String uretici, String birim, int urunMiktar, String raf) {
        this.urunId=urunId;
        this.urunIsmi=urunIsmi;
        this.uretici=uretici;
        this.birim=birim;
        this.urunMiktar=urunMiktar;
        this.raf=raf;
    }
    public urunTanimlama(int urunId, String urunIsmi, String uretici, String birim) {
        this.urunId=urunId;
        this.urunIsmi=urunIsmi;
        this.uretici=uretici;
        this.birim=birim;
    }
    public static int getUrunId() {
        return urunId;
    }
    public static void setUrunId(int urunId) {
        urunTanimlama.urunId = urunId;
    }
    public static String getUrunIsmi() {
        return urunIsmi;
    }
    public static void setUrunIsmi(String urunIsmi) {
        urunTanimlama.urunIsmi = urunIsmi;
    }
    public static String getUretici() {
        return uretici;
    }
    public static void setUretici(String uretici) {
        urunTanimlama.uretici = uretici;
    }
    public static String getBirim() {
        return birim;
    }
    public static void setBirim(String birim) {
        urunTanimlama.birim = birim;
    }
    public static int getUrunMiktar() {
        return urunMiktar;
    }
    public static void setUrunMiktar(int urunMiktar) {
        urunTanimlama.urunMiktar = urunMiktar;
    }
    public static String getRaf() {
        return raf;
    }
    public static void setRaf(String raf) {
        urunTanimlama.raf = raf;
    }
    @Override
    public String toString() {
        return "urunTanimlama{" +
                "urunId='" + urunId + '\'' +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", birim='" + birim + '\'' +
                ", urunMiktar=" + urunMiktar +
                '}';
    }
}

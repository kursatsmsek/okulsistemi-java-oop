public class Insan {
    private String isim;
    private String soyisim;
    private int id;

    public Insan(String isim, String soyisim, int id) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.id = id;
    }

    public String getisim() {
        return isim;
    }

    public void setisim(String isim) {
        this.isim = isim;
    }

    public String getsoyisim() {
        return soyisim;
    }

    public void setsoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void bilgileriGoster() {
        System.out.println("İsim Soyisim: " + isim + " " + soyisim);
        System.out.println("id: " + id);
    }

    public void tatileCikar(int gun) {
        System.out.println(getisim() + " " + gun + " tatile çıkıyor.");
    }
}

public class Idareci extends Insan {
    private String mertebe;

    public Idareci(String isim, String soyisim, int id, String mertebe) {
        super(isim, soyisim, id);
        this.mertebe = mertebe;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Mertebe: " + mertebe);
    }

    public void izineCikar(String izinli, int igun) {
        System.out.println(getisim() + " " + izinli + " kişisine " + igun + " kadar izin verdi.");
    }

    public void gorevAta(String gorevli) {
        System.out.println(getisim() + " " + gorevli + " kişisine görev atadı.");
    }

    public String getMertebe() {
        return mertebe;
    }

    public void setMertebe(String mertebe) {
        this.mertebe = mertebe;
    }
}

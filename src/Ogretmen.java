public class Ogretmen extends Insan {
    private String brans;

    public Ogretmen(String isim, String soyisim, int id, String brans) {
        super(isim, soyisim, id);
        this.brans = brans;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Branş: " + brans);
    }

    public void dersAnlat(Sınıf sınıf) {
        System.out.println(getisim() + " hoca" + sınıf + " sınıfına ders anlatıyor.");
    }

    public void notVer(Ogrenci ogrenci,int not) {
        System.out.println(getisim() + " hoca" + ogrenci + " adlı öğrenciye " + not + " puan verdi.");
    }
}

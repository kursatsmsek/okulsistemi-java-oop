public class Ogrenci extends Insan {
    private Sınıf sınıf;
    public Ogrenci(String isim, String soyisim, int id,Sınıf sınıf) {
        super(isim, soyisim, id);
        this.sınıf = sınıf;
    }

    public Sınıf getSınıf() {
        return sınıf;
    }

    public void setSınıf(Sınıf sınıf) {
        this.sınıf = sınıf;
    }

    @Override
    public void bilgileriGoster() {
        System.out.println("İsim Soyisim: " + getisim() + " " + getsoyisim());
        System.out.println("Okul Numarası: " + getid());
        System.out.println("Sınıf: " + getSınıf().getLevel() + "-" + getSınıf().getSube());
    }

    public void dersCalis(String ders) {
        System.out.println(getisim() + " " + ders + " dersine çalışıyor.");
    }
}

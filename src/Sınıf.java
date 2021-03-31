public class Sınıf {
    private String sube;
    private int level;
    private int mevcut;

    public Sınıf(String sube, int level, int mevcut) {
        this.sube = sube;
        this.level = level;
        this.mevcut = mevcut;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMevcut() {
        return mevcut;
    }

    public void setMevcut(int mevcut) {
        this.mevcut = mevcut;
    }

    public void sinifBilgileri() {
        System.out.println("Sınıf: " + level + "-" + sube);
        System.out.println("Mevcut: " + mevcut);
    }
}

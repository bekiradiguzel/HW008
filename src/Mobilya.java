public class Mobilya {
    private double yukseklik;
    private String aciklama;
    private boolean kapaliMi;
    public Mobilya(double yukseklik, String aciklama, boolean kapaliMi) {
        setYukseklik(yukseklik);
        this.aciklama = aciklama;
        this.kapaliMi = kapaliMi;
    }

    public Mobilya() {
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if(yukseklik>0)
        this.yukseklik = yukseklik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public boolean isKapaliMi() {
        return kapaliMi;
    }

    public void setKapaliMi(boolean kapaliMi) {
        this.kapaliMi = kapaliMi;
    }

    @Override
    public String toString() {
        return "Mobilya{" +
                "aciklama='" + aciklama + '\'' +
                '}';
    }


}

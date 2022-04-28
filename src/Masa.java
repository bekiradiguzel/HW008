public class Masa extends Mobilya implements Dortgen {
    private double genislik;
    private double derinlik;

    public Masa(String aciklama, double yukseklik, double genislik, double derinlik, boolean kapaliMi) {
        super(yukseklik, aciklama, kapaliMi);
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    public Masa() {
    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        if(isKapaliMi()==false){
            return genislik*derinlik;
        }

        return 6*genislik*derinlik;
    }

    @Override
    public double hacimHesapla() {
        return genislik*derinlik*getYukseklik();
    }

    @Override
    public void setDerinlik(double derinlik) {
        this.derinlik = derinlik;
    }

}
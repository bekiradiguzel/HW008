public class Sehpa extends Mobilya implements  Dortgen {
    private double genislik;
    private double derinlik;


    public Sehpa() {
    }

    @Override
    public String toString() {
        return "Sehpa{" +
                "genislik=" + genislik +
                ", derinlik=" + derinlik +",yukseklik="+getYukseklik()+
                "} " + super.toString();
    }

    public Sehpa(double yukseklik, String aciklama, boolean kapaliMi, double genislik, double derinlik) {
        super(yukseklik, aciklama, kapaliMi);
    this.genislik=genislik;
    this.derinlik=derinlik;


    }

    @Override
    public void setGenislik(double genislik) {

    }

    @Override
    public double getGenislik() {
        return 0;
    }

    @Override
    public void setDerinlik(double derinlik) {

    }

    @Override
    public double getDerinlik() {
        return 0;
    }

    @Override
    public double alanHesapla() {
        if(isKapaliMi()==false){
            return genislik*derinlik;
        }else{
            return genislik*derinlik*getYukseklik();
        }
    }

    @Override
    public double hacimHesapla() {
        return genislik*derinlik*getYukseklik();
    }
}

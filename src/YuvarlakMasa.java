public class YuvarlakMasa extends Mobilya implements Daire {
    private double yaricap;

    public YuvarlakMasa() {
    }

    public YuvarlakMasa(String aciklama, double yaricap, double yukseklik, boolean kapaliMi) {
        super(yukseklik, aciklama, kapaliMi);
        this.yaricap = yaricap;
    }

    @Override
    public double setYaricap(double yaricap) {

        return yaricap;
    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double hacimHesapla() {
        return Math.PI*yaricap*yaricap*getYukseklik();
    }

    @Override
    public String toString() {
        return "YuvarlakMasa{" +
                "yaricap=" + yaricap +"yukseklik"+getYukseklik()+
                "} " + super.toString();
    }

    //double alanHesapla();: Eğer kapaliMi false ise (PI x yaricap x yaricap) değilse (2 x PI x yaricap x yaricap + 2 x PI x yaricap x yukseklik)
//		double hacimHesapla(); PI x yaricap x yaricap x yu
    @Override
    public double alanHesapla() {
        if (isKapaliMi() == false) {
            return Math.PI * yaricap * yaricap;
        } else {
            return (2*Math.PI*yaricap*yaricap)+(2*Math.PI*yaricap*getYukseklik());
        }




        }
    }

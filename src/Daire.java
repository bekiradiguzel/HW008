public interface Daire {


    double setYaricap(double yaricap);
    double getYaricap();

    double alanHesapla();
    double hacimHesapla();

    /*

    void setYaricap(double yaricap);
		double getYaricap();
		double alanHesapla();: Eğer kapaliMi false ise (PI x yaricap x yaricap) değilse (2 x PI x yaricap x yaricap + 2 x PI x yaricap x yukseklik)
		double hacimHesapla(); PI x yaricap x yaricap x yukseklik
     */
}

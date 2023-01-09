package App.HitungBangunDatarDanRuang;

public class Segitiga {
    protected Double tinggi;
    protected Double T;
    protected Double alas;
    protected Double sisi;

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }

    public void setT(Double t) {
        this.T = t;
    }

    public void setAlas(Double alas) {
        this.alas = alas;
    }

    public void setSisi(Double sisi) {
        this.sisi = sisi;
    }

    public Double getLuasSegitiga() {
        return 0.5 * this.alas * this.tinggi;
    }

    public Double getKelilingSegitiga() {
        return this.sisi * 3;
    }
}

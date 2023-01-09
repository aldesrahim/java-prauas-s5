package App.HitungBangunDatarDanRuang;

public class PrismaSegitiga extends Segitiga {
    public Double getVolumePrismaSegitiga() {
        return this.getLuasSegitiga() * this.T;
    }

    public Double getKelilingPrismaSegitiga() {
        return (this.getKelilingSegitiga() * 2) + (this.tinggi * 3);
    }
}

package App.LuasBangunDatarOverload;

public class PersegiDanSegitiga {
    public Double getLuas(Double sisi) {
        return Math.pow(sisi, 2);
    }

    public Double getLuas(Double alas, Double tinggi) {
        return 0.5 * alas * tinggi;
    }
}

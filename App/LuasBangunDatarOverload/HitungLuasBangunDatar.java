package App.LuasBangunDatarOverload;

public class HitungLuasBangunDatar {
    public static void main(String[] args) {
        PersegiDanSegitiga persegiDanSegitiga = new PersegiDanSegitiga();

        Double luasPersegi = persegiDanSegitiga.getLuas(10.0);
        Double luasSegitiga = persegiDanSegitiga.getLuas(10.0, 10.0);

        System.out.println("Luas persegi: " + luasPersegi);
        System.out.println("Luas segitiga: " + luasSegitiga);
    }
}

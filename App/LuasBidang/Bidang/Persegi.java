package App.LuasBidang.Bidang;

import App.LuasBidang.Bidang.Factory.Bidang;
import App.LuasBidang.Bidang.Factory.BidangInterface;

public class Persegi extends Bidang implements BidangInterface {

    private Double sisi;

    @Override
    public void inputInformation() {
        System.out.println("Hitung Luas Persegi");
        System.out.print("Masukkan panjang sisi: ");

        this.sisi = Double.parseDouble(this.scanner.nextLine());
    }

    @Override
    public void calculateLuas() {
        this.luas = Math.pow(this.sisi, 2);

        System.out.println("Luas Persegi adalah: " + this.getLuas());
    }
}

package App.LuasBidang.Bidang;

import App.LuasBidang.Bidang.Factory.Bidang;
import App.LuasBidang.Bidang.Factory.BidangInterface;

public class Segitiga extends Bidang implements BidangInterface {

    private Double alas;
    private Double tinggi;

    @Override
    public void inputInformation() {
        System.out.println("Hitung Luas Segitiga");

        System.out.print("Masukkan panjang alas: ");
        this.alas = Double.parseDouble(this.scanner.nextLine());

        System.out.print("Masukkan tinggi: ");
        this.tinggi = Double.parseDouble(this.scanner.nextLine());
    }

    @Override
    public void calculateLuas() {
        this.luas = 0.5 * this.alas * this.tinggi;

        System.out.println("Luas Segitiga adalah: " + this.getLuas());
    }
}

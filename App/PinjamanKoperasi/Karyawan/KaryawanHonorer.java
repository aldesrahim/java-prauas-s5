package App.PinjamanKoperasi.Karyawan;

import App.PinjamanKoperasi.Object.GolonganPinjaman;
import App.PinjamanKoperasi.Helper;
import App.PinjamanKoperasi.Karyawan.Factory.Karyawan;
import App.PinjamanKoperasi.Karyawan.Factory.KaryawanInterface;

public class KaryawanHonorer extends Karyawan implements KaryawanInterface {
    private static final Double BUNGA_PERSEN = 0.025;

    public KaryawanHonorer() {
        this.golonganPinjamanList.add(new GolonganPinjaman("Golongan A", 30000000.0));
        this.golonganPinjamanList.add(new GolonganPinjaman("Golongan B", 20000000.0));
        this.golonganPinjamanList.add(new GolonganPinjaman("Golongan C", 10000000.0));
    }

    @Override
    public void tampilGolonganList() {
        System.out.print("\n");

        System.out.println("Pilih Golongan Pinjaman Karyawan Honorer");
        int num = 1;
        for (GolonganPinjaman golongan: this.golonganPinjamanList) {
            System.out.println(num + ". " + golongan.nama + " | Pinjaman: " + Helper.numberFormat(golongan.pinjaman));
            num++;
        }

        this.pilihGolongan();
        this.inputBulanAngsuran();
    }

    @Override
    public void tampilHasilKalkulasi() {
        this.golonganPinjaman.calculate(BUNGA_PERSEN, this.bulanAngsuran);

        System.out.println("Hasil Kalkulasi Pinjaman Karyawan Honorer");
        System.out.println("\n");

        System.out.println("Pinjaman: " + Helper.numberFormat(this.golonganPinjaman.pinjaman));
        System.out.println("Lama angsuran (bulan): " + Helper.numberFormat(this.bulanAngsuran));
        System.out.println("Pokok pinjaman tiap bulan: " + Helper.numberFormat(this.golonganPinjaman.pokokPinjamanPerBulan));

        System.out.print("\n");

        System.out.println("Nilai tetap untuk bunga persen: " + BUNGA_PERSEN);
        System.out.println("Nilai bunga tiap bulan: " + Helper.numberFormat(this.golonganPinjaman.bungaPerbulan));
        System.out.println("Kewajiban tiap bulan: " + Helper.numberFormat(this.golonganPinjaman.kewajibanPerbulan));

        System.out.print("\n");

        System.out.println("Total pinjaman: " + Helper.numberFormat(this.golonganPinjaman.totalPinjaman));
    }
}

package App.PinjamanKoperasi.Karyawan;

import App.PinjamanKoperasi.Object.GolonganPinjaman;
import App.PinjamanKoperasi.Helper;
import App.PinjamanKoperasi.Karyawan.Factory.Karyawan;
import App.PinjamanKoperasi.Karyawan.Factory.KaryawanInterface;

public class KaryawanTetap extends Karyawan implements KaryawanInterface {
    private static final Double BUNGA_PERSEN = 0.025;
    
    public KaryawanTetap() {
        this.golonganPinjamanList.add(new GolonganPinjaman("Golongan A", 100000000.0));
        this.golonganPinjamanList.add(new GolonganPinjaman("Golongan B", 75000000.0));
        this.golonganPinjamanList.add(new GolonganPinjaman("Golongan C", 55000000.0));
    }

    @Override
    public void tampilGolonganList() {
        System.out.print("\n");

        System.out.println("Pilih Golongan Pinjaman Karyawan Tetap");
        int num = 1;
        for (GolonganPinjaman golongan: this.golonganPinjamanList) {
            System.out.println(num + ". " + golongan.nama + " | Pinjaman: " + Helper.numberFormat(golongan.pinjaman));
            num++;
        }

        this.pilihGolongan();
        this.inputBulanAngsuran();
    }

    public GolonganPinjaman getGolonganPinjaman() {
        return this.golonganPinjaman;
    }

    @Override
    public void tampilHasilKalkulasi() {
        this.golonganPinjaman.calculate(BUNGA_PERSEN, this.bulanAngsuran);

        System.out.println("Hasil Kalkulasi Pinjaman Karyawan Tetap");
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

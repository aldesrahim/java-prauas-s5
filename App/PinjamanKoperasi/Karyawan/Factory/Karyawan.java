package App.PinjamanKoperasi.Karyawan.Factory;

import App.PinjamanKoperasi.DTO.GolonganPinjaman;

import java.util.ArrayList;
import java.util.Scanner;

abstract public class Karyawan implements KaryawanInterface {
    public Scanner scanner = new Scanner(System.in);

    protected String nama;
    protected String nik;
    protected ArrayList<GolonganPinjaman> golonganPinjamanList = new ArrayList<>();
    protected GolonganPinjaman golonganPinjaman;
    protected Integer bulanAngsuran;

    abstract public void tampilGolonganList();

    public void pilihGolongan() {
        while (true) {
            System.out.print("Masukkan pilihan golongan > ");
            int pilihan = Integer.parseInt(scanner.nextLine());

            if (pilihan > 0 && pilihan <= this.golonganPinjamanList.size()) {
                this.golonganPinjaman = this.golonganPinjamanList.get(pilihan - 1);
                break;
            }
        }
    }

    public void inputBulanAngsuran() {
        while (true) {
            System.out.print("Masukkan jumlah angsuran (bulan) > ");
            int pilihan = Integer.parseInt(scanner.nextLine());

            if (pilihan > 0 && pilihan <= 12) {
                this.bulanAngsuran = pilihan;
                break;
            }
        }
    }

    public void inputPeminjman() {
        System.out.print("\n");

        System.out.print("Masukkan nama peminjam > ");
        this.nama = scanner.nextLine();
        System.out.print("Masukkan NIK peminjam > ");
        this.nik = scanner.nextLine();
    }
}

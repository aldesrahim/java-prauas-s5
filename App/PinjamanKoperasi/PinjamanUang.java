package App.PinjamanKoperasi;

import App.PinjamanKoperasi.Karyawan.Factory.KaryawanInterface;
import App.PinjamanKoperasi.Karyawan.KaryawanHonorer;
import App.PinjamanKoperasi.Karyawan.KaryawanTetap;

import java.util.Scanner;

public class PinjamanUang {
    public Scanner scanner = new Scanner(System.in);

    private KaryawanInterface karyawan;
    public void pilihStatus() {
        boolean loop = false;

        System.out.println("Pilih Status Karyawan");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Honorer");

        do {
            System.out.print("Masukkan pilihan status > ");

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> this.karyawan = new KaryawanTetap();
                case 2 -> this.karyawan = new KaryawanHonorer();
                default -> loop = true;
            }
        } while (loop);
    }

    public static void main(String[] args) {
        PinjamanUang dis = new PinjamanUang();

        System.out.println("==========================");
        System.out.println("Aplikasi Pinjaman Karyawan");
        System.out.println("==========================");

        dis.pilihStatus();
        dis.karyawan.inputPeminjman();
        dis.karyawan.tampilGolonganList();
        dis.karyawan.tampilHasilKalkulasi();
    }
}

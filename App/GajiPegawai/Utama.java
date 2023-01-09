package App.GajiPegawai;

import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hitung gaji karyawan");
        System.out.println("1. Manajer");
        System.out.println("2. Kabag");
        System.out.println("3. Staff");

        System.out.print("Pilih karyawan: ");

        KaryawanInterface karyawan = switch (scanner.nextLine()) {
            case "1" -> new KaryawanManajer();
            case "2" -> new KaryawanKabag();
            case "3" -> new KaryawanStaff();
            default -> throw new IllegalStateException("Unexpected value: " + scanner.nextLine());
        };

        karyawan.chooseGolongan();
        System.out.println("Gaji karyawan: " + karyawan.getGaji());
    }
}

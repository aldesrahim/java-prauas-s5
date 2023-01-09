package App.GajiPegawai;

import java.util.Scanner;

public abstract class Karyawan implements KaryawanInterface {
    protected Double tunjanganJabatan = 0.0;
    protected Double tunjanganGolongan = 0.0;
    protected Double tunjanganKehadiran = 0.0;

    @Override
    public Double getGaji() {
        return this.tunjanganJabatan + this.tunjanganGolongan + this.tunjanganKehadiran;
    }

    @Override
    public void chooseGolongan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Golongan");

        System.out.println("1. Golongan A: 500.000");
        System.out.println("2. Golongan B: 1.000.000");
        System.out.println("3. Golongan C: 1.500.000");

        System.out.print("Pilih golongan: ");

        this.tunjanganGolongan = switch (scanner.nextLine()) {
            case "1" -> 500000.0;
            case "2" -> 1000000.0;
            case "3" -> 1500000.0;
            default -> 0.0;
        };
    }
}

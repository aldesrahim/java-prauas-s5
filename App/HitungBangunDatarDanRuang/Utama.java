package App.HitungBangunDatarDanRuang;

import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga();

        System.out.print("Masukkan sisi segitiga: ");
        prismaSegitiga.setSisi(Double.parseDouble(scanner.nextLine()));

        System.out.print("Masukkan alas segitiga: ");
        prismaSegitiga.setAlas(Double.parseDouble(scanner.nextLine()));

        System.out.print("Masukkan tinggi segitiga: ");
        prismaSegitiga.setTinggi(Double.parseDouble(scanner.nextLine()));

        System.out.println("\nHasil perhitungan segitiga");
        System.out.println("Keliling: " + prismaSegitiga.getKelilingSegitiga());
        System.out.println("Luas: " + prismaSegitiga.getLuasSegitiga());

        System.out.println("\nPerhitungan prisma segitiga");
        System.out.print("Masukkan tinggi (T) prisma: ");
        prismaSegitiga.setT(Double.parseDouble(scanner.nextLine()));

        System.out.println("\nHasil perhitungan prisma segitiga");
        System.out.println("Keliling: " + prismaSegitiga.getKelilingPrismaSegitiga());
        System.out.println("Volume: " + prismaSegitiga.getVolumePrismaSegitiga());
    }
}

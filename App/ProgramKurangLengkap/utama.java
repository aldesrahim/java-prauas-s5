package App.ProgramKurangLengkap;

import java.util.Scanner;

public class utama extends pizza {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        pizza a = new pizza();

        String toping, pinggiran;
        int harga_toping;
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("\t\t PIZZA NOTARU ");
        System.out.println("\t Terkenal Sejak Tahun 1988");
        System.out.println("---------------------------------------------");
        a.cetakData(" ");
        System.out.println();
        a.toping();
        System.out.println();
        a.pinggiran();
        System.out.println();
        a.ukuran();
        System.out.println();
        System.out.println("====================Data Pesanan==============");
        a.cetakTotal();
        System.out.println("-----------------------------------------------");
    }
}
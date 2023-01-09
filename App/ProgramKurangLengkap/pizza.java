package App.ProgramKurangLengkap;

import java.util.Scanner;

public class pizza extends resto {
    Scanner s = new Scanner(System.in);
    int harga_toping, harga_pinggiran, harga_ukuran;

    public void toping() {
        System.out.println("Daftar Toping / Rasa Pizza");
        System.out.println("1. Meat Lovers (Rp. 84,000)");
        System.out.println("2. Super Supreme (Rp. 84,000)");
        System.out.println("3. American Favourite (Rp. 74,000)");
        System.out.print("Toping pilihan Anda = ");
        int pil1 = s.nextInt();

        if (pil1 == 1) {
            toping = "Meat Lovers";
            harga_toping = 84000;
        } else if (pil1 == 2) {
            toping = "Super Supreme";
            harga_toping = 84000;
        } else {
            toping = "American Favourite";
            harga_toping = 74000;
        }
    }

    public void ukuran() {
        System.out.println("Daftar Ukuran Pizza");
        System.out.println("1. Regular 8Slices (+Rp. 0)");
        System.out.println("2. Jumbo 10Slices (+Rp. 40,000");
        System.out.print("Ukuran Pilihan Anda =  ");

        int pil3 = s.nextInt();

        if (pil3 == 1) {
            ukuran = "Reguler";
            harga_ukuran = 0;
        } else {
            ukuran = "jumbo";
            harga_ukuran = 40000;
        }
    }

    public void pinggiran() {
        System.out.println("Daftar Pinggiran Pizza");
        System.out.println("1. Original Crust (+Rp. 0)");
        System.out.println("2. Stuffed Crust (+Rp. 22,000)");
        System.out.println("3. Sausage Crust (+Rp. 22,000)");
        System.out.println("4. Cheesy Bites (+Rp. 32,000)");
        System.out.print("Pinggiran pilihan anda = ");

        int pil2 = s.nextInt();

        if (pil2 == 1) {
            pinggiran = "Original Crust";
            harga_pinggiran = 0;
        } else if (pil2 == 2) {
            pinggiran = "Stuffed Crust";
            harga_pinggiran = 22000;
        } else if (pil2 == 3) {
            pinggiran = "Sausage Crust";
            harga_pinggiran = 22000;
        } else {
            pinggiran = "Cheesy Bites";
            harga_pinggiran = 32000;
        }

    }

    public void cetakData(String nama) {
        System.out.println("Input data pesanan");
        System.out.print("Nama Pemesan : ");
        this.nama = s.nextLine();
    }

    public void cetakTotal() {
        System.out.println("Nama pemesan \t= " + this.nama);
        System.out.println("Pizza yang dipesan = " + toping + "/" + pinggiran + "/" + ukuran);
        biaya = harga_toping + harga_pinggiran + harga_ukuran;
        System.out.println("Total Biaya \t= " + biaya);
    }
}
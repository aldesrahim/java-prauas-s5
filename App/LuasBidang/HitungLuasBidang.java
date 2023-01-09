package App.LuasBidang;

import App.LuasBidang.Bidang.Factory.Bidang;
import App.LuasBidang.Bidang.Persegi;
import App.LuasBidang.Bidang.Segitiga;

import java.util.Scanner;

public class HitungLuasBidang {
    public static void main(String[] args) {
        HitungLuasBidang dis = new HitungLuasBidang();
        dis.run();
    }
    
    private void run() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        
        System.out.println("Hitung luas bidang");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");

        do {
            System.out.print("> ");
            choose = Integer.parseInt(scanner.nextLine());
        } while (choose < 1 || choose > 2);

        Bidang bidang = switch (choose) {
            case 1 -> new Persegi();
            case 2 -> new Segitiga();
            default -> throw new IllegalStateException("Unexpected value: " + choose);
        };

        bidang.inputInformation();
        bidang.calculateLuas();
    }
}

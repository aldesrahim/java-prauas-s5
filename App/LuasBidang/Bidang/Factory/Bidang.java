package App.LuasBidang.Bidang.Factory;

import java.util.Scanner;

abstract public class Bidang implements BidangInterface {
    protected Scanner scanner = new Scanner(System.in);
    protected Double luas;

    @Override
    public Double getLuas() {
        return this.luas;
    }

    abstract public void inputInformation();
}

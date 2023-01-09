package App.ProgramKurangLengkap;

abstract public class resto {
    String toping, ukuran, nama, pinggiran;
    int biaya;

    abstract public void toping();

    abstract public void ukuran();

    abstract public void pinggiran();

    abstract public void cetakData(String nama);

    abstract public void cetakTotal();

}

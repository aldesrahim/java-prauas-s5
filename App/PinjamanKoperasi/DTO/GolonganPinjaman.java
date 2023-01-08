package App.PinjamanKoperasi.DTO;

public class GolonganPinjaman {
    public String nama;
    public Double pinjaman;
    public Double pokokPinjamanPerBulan;
    public Double bungaPersen;
    public Integer bulanAngsuran;
    public Double bungaPinjaman;
    public Double bungaPerbulan;
    public Double kewajibanPerbulan;
    public Double totalPinjaman;

    public GolonganPinjaman(String nama, Double pinjaman) {
        this.nama = nama;
        this.pinjaman = pinjaman;
    }

    public void calculate(Double bungaPersen, Integer bulanAngsuran) {
        this.bungaPersen = bungaPersen;
        this.bulanAngsuran = bulanAngsuran;

        this.pokokPinjamanPerBulan = this.pinjaman / this.bulanAngsuran;
        this.bungaPinjaman = this.pinjaman * (this.bungaPersen / 100);
        this.bungaPerbulan = this.bungaPinjaman / this.bulanAngsuran;

        this.kewajibanPerbulan = this.pokokPinjamanPerBulan + this.bungaPerbulan;
        this.totalPinjaman = this.pinjaman + this.bungaPerbulan;
    }
}

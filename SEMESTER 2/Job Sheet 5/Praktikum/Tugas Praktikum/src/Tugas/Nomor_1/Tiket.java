package Tugas.Nomor_1;

public class Tiket {
    public String jenis, asal, tujuan;
    public int jmlhKursi, kodeTiket;
    public float harga;

    public Tiket() {
    }

    public Tiket(String jenis, String asal, String tujuan, int jmlhKursi, int kodeTiket, float harga) {
        this.jenis = jenis;
        this.asal = asal;
        this.tujuan = tujuan;
        this.jmlhKursi = jmlhKursi;
        this.kodeTiket = kodeTiket;
        this.harga = harga;
    }

    void tampil() {
        System.out.printf("%s %-14s %s %-14s %s %-14s %s %-4d %s %-4d %s %-10.0f %s \n", "|", jenis, "|", asal, "|",
                tujuan, "|", jmlhKursi, "|", kodeTiket, "|", harga, "|");
    }

}
package Tugas.Nomor_2;

public class NodeBuku {
    int kode;
    String judul;
    NodeBuku next;

    public NodeBuku(int kode, String judul, NodeBuku next) {
        this.kode = kode;
        this.judul = judul;
        this.next = next;
    }
}
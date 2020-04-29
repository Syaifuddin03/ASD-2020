package Tugas.Nomor_1;

public class NodeMahasiswa {
    int nim;
    String nama, alamat;
    NodeMahasiswa next;

    public NodeMahasiswa(int nim, String nama, String alamat, NodeMahasiswa next) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.next = next;
    }
}
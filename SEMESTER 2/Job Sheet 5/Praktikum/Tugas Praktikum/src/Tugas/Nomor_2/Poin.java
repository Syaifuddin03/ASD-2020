package Tugas.Nomor_2;

/**
 * Poin
 */
public class Poin {
    String namaClub;
    int P, GD, PTS;

    Poin() {
    }

    public Poin(String namaClub, int p, int gD, int pTS) {
        this.namaClub = namaClub;
        this.P = p;
        this.GD = gD;
        this.PTS = pTS;
    }

    void tampil() {
        System.out.printf("%s %-30s %s %-3d %s %-3d %s %-3d %s\n", "|", namaClub, "|", P, "|", GD, "|", PTS, "|");
    }

}
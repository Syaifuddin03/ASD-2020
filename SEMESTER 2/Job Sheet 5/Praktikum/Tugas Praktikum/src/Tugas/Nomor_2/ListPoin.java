package Tugas.Nomor_2;

/**
 * ListPoin
 */
public class ListPoin {
    Poin[] poins = new Poin[20];
    int a;

    void tambah(Poin poin) {
        poins[a] = poin;
        a++;
    }

    void tampil() {
        for (Poin point : poins) {
            point.tampil();
            System.out.println("----------------------------------------------------");
        }
    }

    void filterAscending() {
        for (int i = 0; i < poins.length - 1; i++) {
            for (int j = 1; j < poins.length - i; j++) {
                if (poins[j].PTS < poins[j - 1].PTS) {
                    Poin temp = poins[j];
                    poins[j] = poins[j - 1];
                    poins[j - 1] = temp;
                }
            }
        }
    }

    void filterDescending() {
        for (int i = 0; i < poins.length - 1; i++) {
            for (int j = 1; j < poins.length - i; j++) {
                if (poins[j].PTS > poins[j - 1].PTS) {
                    Poin temp = poins[j];
                    poins[j] = poins[j - 1];
                    poins[j - 1] = temp;
                }
            }
        }
    }
}
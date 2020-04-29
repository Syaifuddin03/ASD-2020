package Tugas;

/**
 * Tugas2
 */
public class Tugas2 {
    int[][] data;
    int kolom, baris;

    public Tugas2(int[][] Data, int baris, int kolom) {
        this.kolom = kolom;
        this.baris = baris;
        data= new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                data[i][j] = Data[i][j];
            }
        }
    }

    public void TampilPosisiSeqSearch(int[][] data, int cari){
        int k = 0;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if ( data[i][j] == cari) {
                    System.out.printf("   Nilai %d dapat ditemukan pada baris %d dan kolom %d\n", cari, i, j);
                    k = 1;
                }   
            }
        }
        if (k == 0) {
            System.out.println("\t   Nilai "+cari+" tidak dapat ditemukan!");
        }
    }

    public void tampilData (){
        System.out.printf("%11d %6d %6d %6d %6d\n", 0, 1, 2, 3, 4);
        for (int i = 0; i < baris; i++) {
            System.out.printf("%6s %s", " ","+------+------+------+------+----+\n");
            System.out.printf("%d => ", i);
            for (int j = 0; j < kolom; j++) {
                // System.out.println("");
                System.out.printf("%3s %-3d", "|", data[i][j]);                
            }
            System.out.println("|");
        }
        System.out.printf("%6s %s", " ","+------+------+------+------+----+\n");
    }  
}
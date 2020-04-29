package Tugas;

/**
 * Tugas4
 */
public class Tugas4 {
    String[] nama;
    String[] alamat;
    String[] jenisKelamin;
    int[] nik;

    Tugas4(){}

    Tugas4(String[] nama, String[] alamat, String[] jenisKelamin, int[] nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
    }

    void tampilData(int jmlh){
        System.out.println("+----+--------+---------------+------------+---------------+");
        System.out.printf("| %-2s | %-6s | %-13s | %-10s | %-10s |\n",
                        "NO", "NIK", "NAMA", "ALAMAT", "JENIS KELAMIN");
        System.out.println("+----+--------+---------------+------------+---------------+");

        for (int i = 0; i < jmlh; i++) {
            System.out.printf("| %-2d | %-6d | %-13s | %-10s | %-13s |\n",
                            (i+1), nik[i], nama[i], alamat[i], jenisKelamin[i]);
            System.out.println("------------------------------------------------------------");
        }
    }

    void pencarianData(int jmlhData, Tugas4 tugas4, int cari){
        int br = -1;
        for (int i = 0; i < jmlhData; i++) {
            if (cari == tugas4.nik[i]) {
                System.out.println("\n\t\t  ~Data Penduduk Ditemukan!~");
                System.out.println("+----+--------+---------------+------------+---------------+");
                System.out.printf("| %-2s | %-6s | %-13s | %-10s | %-10s |\n",
                                "NO", "NIK", "NAMA", "ALAMAT", "JENIS KELAMIN");
                System.out.println("+----+--------+---------------+------------+---------------+");
                System.out.printf("| %-2d | %-6d | %-13s | %-10s | %-13s |\n",
                                (i+1), nik[i], nama[i], alamat[i], jenisKelamin[i]);
                System.out.println("------------------------------------------------------------");
                br = i;
                break;
            } 
        }
        if (br == -1) {
            System.out.println("\n\t  ~Data Penduduk Tidak Dapat Ditemukan!~");
        }
    }
}
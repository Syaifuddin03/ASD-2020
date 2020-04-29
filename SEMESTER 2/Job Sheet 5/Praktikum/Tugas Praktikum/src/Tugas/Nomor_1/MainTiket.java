package Tugas.Nomor_1;

import java.util.Scanner;

/**
 * MainTiket
 */
public class MainTiket {

        static String sort, sort2, hasSort;

        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                DaftarTiket data = new DaftarTiket();
                Tiket[] ticket = new Tiket[10];
                ticket[0] = new Tiket("Economy", "Surabaya", "Palembang", 150, 101, 350000);
                ticket[1] = new Tiket("Business", "Malang", "Surabaya", 120, 102, 250000);
                ticket[2] = new Tiket("Economy", "Aceh", "Bali", 200, 103, 730000);
                ticket[3] = new Tiket("First Class", "Lombok", "Malang", 100, 104, 470000);
                ticket[4] = new Tiket("Premium", "Samarinda", "Aceh", 150, 105, 460000);
                ticket[5] = new Tiket("First Class", "Jakarta", "Malang", 150, 106, 310000);
                ticket[6] = new Tiket("Business", "Aceh", "Malang", 100, 107, 1115000);
                ticket[7] = new Tiket("Economy", "Bali", "Aceh", 150, 108, 1500000);
                ticket[8] = new Tiket("Premium", "Lombok", "Aceh", 200, 109, 1980000);
                ticket[9] = new Tiket("Business", "Pontianak", "Lampung", 150, 110, 365000);
                data.tambah(ticket[0]);
                data.tambah(ticket[1]);
                data.tambah(ticket[2]);
                data.tambah(ticket[3]);
                data.tambah(ticket[4]);
                data.tambah(ticket[5]);
                data.tambah(ticket[6]);
                data.tambah(ticket[7]);
                data.tambah(ticket[8]);
                data.tambah(ticket[9]);

                System.out.println("\n\t\t\t  *** DAFTAR TIKET PESAWAT ***");
                System.out.println("\t\t\t\t ~~ Normal ~~\n");
                System.out.println("+----------------+----------------+----------------+------+------+------------+");
                System.out.printf("| JENIS TIKET    | ASAL           | TUJUAN         | KURSI| KODE | HARGA      |\n");
                System.out.println("+----------------+----------------+----------------+------+------+------------+");
                data.tampil();

                boolean loop = true;
                while (loop == true) {
                        System.out.println("\n*** Pilih sorting data Ascending atau Descending ***");
                        System.out.print("Jawab (A/D)\t: ");
                        sort = input.next();
                        if (sort.equalsIgnoreCase("A")) {
                                loop = false;
                        } else if (sort.equalsIgnoreCase("D")) {
                                loop = false;
                        } else {
                                System.err.println("\n\t\tInput invalid!\n");
                        }
                }

                boolean looping = true;
                while (looping == true) {
                        System.out.println("*** Pilih Bubble Sort atau Selection Sort ***");
                        System.out.print("Jawab (B/S)\t: ");
                        sort2 = input.next();
                        if (sort2.equalsIgnoreCase("B")) {
                                bubbleSort(data, sort);
                                looping = false;
                        } else if (sort2.equalsIgnoreCase("S")) {
                                selectionSort(data, sort);
                                looping = false;
                        } else {
                                System.err.println("\n\t\tInput invalid!\n");
                        }
                }
        }

        static String hasilFilter(String filt) {
                String resl;
                if (filt.equalsIgnoreCase("A")) {
                        resl = "Ascending";
                } else {
                        resl = "Descending";
                }
                return resl;
        }

        static void bubbleSort(DaftarTiket data, String filter) {
                hasSort = hasilFilter(filter);
                System.out.println();
                System.out.println("\n\t\t\t  *** DAFTAR TIKET PESAWAT ***");
                System.out.println("\t\t\t~~ Bubble Sort & " + hasSort + " ~~\n");
                System.out.println("+----------------+----------------+----------------+------+------+------------+");
                System.out.printf("| JENIS TIKET    | ASAL           | TUJUAN         | KURSI| KODE | HARGA      |\n");
                System.out.println("+----------------+----------------+----------------+------+------+------------+");
                data.bubbleSort(filter);
                data.tampil();
        }

        static void selectionSort(DaftarTiket data, String filter) {
                hasSort = hasilFilter(filter);
                System.out.println();
                System.out.println("\n\t\t\t  *** DAFTAR TIKET PESAWAT ***");
                System.out.println("\t\t\t~~ Selection Sort & " + hasSort + " ~~\n");
                System.out.println("+----------------+----------------+----------------+------+------+------------+");
                System.out.printf("| JENIS TIKET    | ASAL           | TUJUAN         | KURSI| KODE | HARGA      |\n");
                System.out.println("+----------------+----------------+----------------+------+------+------------+");
                data.selectionSort(filter);
                data.tampil();
        }
}
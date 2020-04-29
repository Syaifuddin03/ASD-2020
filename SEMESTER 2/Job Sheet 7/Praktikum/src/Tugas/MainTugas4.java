package Tugas;

import java.util.Scanner;

/**
 * MainTugas4
 */
public class MainTugas4 {
    static Scanner angka = new Scanner(System.in);
    static Scanner huruf = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n===============================================");
        System.out.println("   *** PROGRAM PENCARIAN DATA PENDUDUK ***");
        System.out.println("===============================================\n");
        System.out.print("Masukkan jumlah data penduduk : ");
        int jmlhData = angka.nextInt();

        Tugas4 tugas4 = new Tugas4();
        tugas4.nik = new int[jmlhData];
        tugas4.nama = new String[jmlhData];
        tugas4.alamat = new String[jmlhData];
        tugas4.jenisKelamin = new String[jmlhData];

        inputData(jmlhData, tugas4);
        System.out.println("\n\t\t    *** DATA PENDUDUK ***");
        tugas4.tampilData(jmlhData);

        System.out.println("\n\t*** Mencari Data Penduduk Berdasarkan NIK ***");
        System.out.println("------------------------------------------------------------");
        System.out.print("\t\tMasukkan NIK Penduduk\t: ");
        int cari = angka.nextInt();
        tugas4.pencarianData(jmlhData, tugas4, cari);
    }

    static void inputData(int jmlhData, Tugas4 tugas4){
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < jmlhData; i++) {
            System.out.println("\t\tPenduduk ke-"+(i+1));
            System.out.println("-----------------------------------------------");
            System.out.print("Masukkan NIK\t\t: ");
            tugas4.nik[i] = angka.nextInt();
            System.out.print("Masukkan Nama\t\t: ");
            tugas4.nama[i] = huruf.nextLine();
            System.out.print("Masukkan Alamat\t\t: ");
            tugas4.alamat[i] = huruf.nextLine();
            System.out.print("Masukkan Jenis Kelamin\t: ");
            tugas4.jenisKelamin[i] = huruf.nextLine();
            System.out.println("-----------------------------------------------");
        }
    }
}
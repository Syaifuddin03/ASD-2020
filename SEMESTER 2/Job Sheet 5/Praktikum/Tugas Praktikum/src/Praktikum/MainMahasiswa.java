package Praktikum;

import java.util.Scanner;

/**
 * MainMahasiswa
 */
public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jmlhMhs = 5;

        System.out.println("\n--------------------------------");
        for (int i = 0; i < jmlhMhs; i++) {
            System.out.print("Nama\t\t: ");
            String nama = s1.nextLine();
            System.out.print("Tahun Masuk\t: ");
            int thn = s.nextInt();
            System.out.print("Umur\t\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t\t: ");
            double ipk = s.nextDouble();
            System.out.println("-----------------------------------");

            Mahasiswa mahasiswa = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(mahasiswa);
        }

        System.out.println("*********************************");
        System.out.println("Data mahasiswa sebelum sorting");
        System.out.println("*********************************");
        data.tampil();

        // System.out.println("*****************************************************");
        // System.out.println("Data mahasiswa setelah disorting desc berdasarkan ipk");
        // System.out.println("*****************************************************");
        // data.bubbleSort();
        // data.tampil();

        // System.out.println("***************************************************");
        // System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        // System.out.println("***************************************************");
        // data.selectionSort();
        // data.tampil();

        // System.out.println("****************************************");
        // System.out.println("Data mahasiswa setelah di insertion sort");
        // System.out.println("****************************************");
        // data.insertionSort();
        // data.tampil();

        System.out.println("****************************************");
        System.out.println("Data mahasiswa setelah di insertion sort");
        System.out.println("****************************************");
        System.out.print("Pilih Ascending ? (false or true) : ");
        boolean sort = s.nextBoolean();
        data.insertionSort(sort);
        data.tampil();
    }
}
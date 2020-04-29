package Tugas;

import java.util.Scanner;

/**
 * MainTugas1
 */
public class MainTugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n======================================");
        System.out.println(" *** Searching with Binary Search ***");
        System.out.println("======================================\n");
        System.out.print("Masukkan jumlah data pada array : ");
        int jmlhData = input.nextInt();
        System.out.println("--------------------------------------");
        int data[] = new int[jmlhData];
        for (int i = 0; i < jmlhData; i++) {
            System.out.print("Masukkan nilai indeks ke-"+i+" : ");
            data[i] = input.nextInt();
        }
        System.out.println("--------------------------------------\n");

        Tugas1 pencarian = new Tugas1(data, jmlhData);
        System.out.println("--------------------------------------");
        System.out.println("       Isi Array Sebelum Sorting");
        System.out.println("--------------------------------------");
        pencarian.printArray(data);
        System.out.println("--------------------------------------\n");

        pencarian.mergeSort(data);
        System.out.println("--------------------------------------");
        System.out.println("       Isi Array Setelah Sorting");
        System.out.println("--------------------------------------");
        pencarian.printArray(data);
        System.out.println("--------------------------------------");

        System.out.print("\n Masukkan nilai yang akan dicari : ");
        int cari = input.nextInt();
        System.out.println("======================================");
        int posisi = pencarian.FindBinarySearch(data, cari, 0, data.length-1);
        pencarian.TampilPosisi(cari, posisi);
        System.out.println();
    }
}

package Tugas;

import java.util.Scanner;

/**
 * MainTugas3
 */
public class MainTugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=========================================");
        System.out.println("  *** Searching with Binary Search ***");
        System.out.println("=========================================\n");
        
        int data[] = new int[10];
        data[0] = 12;
        data[1] = 17;
        data[2] = 2;
        data[3] = 1;
        data[4] = 70;
        data[5] = 50;
        data[6] = 90;
        data[7] = 17;
        data[8] = 2;
        data[9] = 90;

        Tugas3 pencarian = new Tugas3(data, 10);
        System.out.println("-----------------------------------------");
        System.out.println("       Isi Array Sebelum Sorting");
        System.out.println("-----------------------------------------");
        pencarian.printArray(data);
        System.out.println("-----------------------------------------\n");

        pencarian.sorting(data);
        System.out.println("-----------------------------------------");
        System.out.println("       Isi Array Setelah Sorting");
        System.out.println("-----------------------------------------");
        pencarian.printArray(data);
        System.out.println("-----------------------------------------\n");
        
        System.out.println("=========================================");
        System.out.print("Masukkan nilai yang akan dicari : ");
        int cari = input.nextInt();
        System.out.println("=========================================\n");
        int posisi = pencarian.FindBinarySearch(data, cari, 0, data.length-1);
        pencarian.TampilPosisi(cari, posisi);
        pencarian.CekNilaiMax(data);
        System.out.println();
    }
}
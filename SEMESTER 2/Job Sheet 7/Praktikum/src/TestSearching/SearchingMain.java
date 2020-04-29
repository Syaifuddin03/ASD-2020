package TestSearching;

import java.util.Scanner;

/**
 * SearchingMain
 */
public class SearchingMain {
    public static void main(String[] args) {
        int data[] = {10, 30, 40, 50, 60, 70, 80, 90};

        //Question number 3 Sequential Search ==> int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        // int data[] = {10, 40, 30, 50, 70, 20, 100, 90};

        //Question number 3 Binary Search ==>  int data[] = {100,90,80,70,60,50,40,30};
        // int data[] = {100,90,80,70,60,50,40,30};

        //Question number 4 Binary Search ==>  int  data[]  ={10,40,30,50,70,20,100,90};
        // int  data[]  ={10,40,30,50,70,20,100,90};

        //Question number 5 Binary Search ==> Data array melalui inputan 
        // Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan jumlah data pada array : ");
        // int jmlhData = input.nextInt();
        // System.out.println();
        // int data[] = new int[jmlhData];
        // for (int i = 0; i < jmlhData; i++) {
        //     System.out.print("Masukkan indeks ke-"+i+" : ");
        //     data[i] = input.nextInt();
        // }
        // System.out.println();
        // Searching pencarian = new Searching(data, jmlhData);
        
        Searching pencarian = new Searching(data, 8);
        System.out.println("Isi Array : ");
        pencarian.tampilData();
        System.out.println("=================================");

        int cari = 20;
        // SEQUENTIAL SEARCH
        System.out.println("Mengunakan Sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        pencarian.TampilPosisiSeqSearch(posisi, cari);

        //BINARY SEARCH
        System.out.println("=================================");
        System.out.println("Menggunakan Binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.TampilPosisi(cari, posisi);
    }
}
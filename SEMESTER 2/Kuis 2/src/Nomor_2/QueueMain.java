package Nomor_2;

import java.util.Scanner;

public class QueueMain {
    static Scanner angka = new Scanner(System.in);
    public static void main(String[] ar4gs) {
        String bio = "NIM\t: 1941720013\nNama\t: Mochammad Syaifuddin Zuhri\nKelas\t: TI-1E";
        System.out.println("\n*--------------------------------------*");
        System.out.println(bio);
        System.out.println("*--------------------------------------*\n");
        System.out.println("\t  ***** KUIS 2 *****");
        System.out.println("*--------------------------------------*");
        System.out.println("    Program Membalikkan Data (Queue)\n");

        System.out.print("Masukkan jumlah maksimal antrian : ");
        int n = angka.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        do {
            menu();
            System.out.print("Pilih : ");
            pilih = angka.nextInt();
            System.out.println("----------------------------------");
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = angka.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                    }
                    break;
                case 3:
                    System.out.println("\n           ~ Data Queue ~");
                    System.out.println("        --------------------");
                    Q.print();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
    }

    public static void menu(){
        System.out.println("\nMasukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Exit");
        System.out.println("----------------------------------");
    } 
}
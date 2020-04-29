package Tugas;

import java.util.Scanner;

/**
 * StackKalimatMain
 */
public class StackKalimatMain {
    static Scanner angka = new Scanner(System.in);
    static Scanner huruf = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n==============================================");
        System.out.println("\t    *** PROGRAM STACK ***");
        System.out.println("==============================================");
        int maxStack = inputMaxStack();
        int jmlhIsi = inputJmlhIsi(maxStack);
        int jmlhKosong = maxStack - jmlhIsi;
        System.out.println("==============================================");
        System.out.println("Maximum isi stack\t\t\t: " + maxStack);
        System.out.println("Jumlah stack yang diisi\t\t\t: " + jmlhIsi);
        System.out.println("Jumlah stack yang kosong\t\t: " + jmlhKosong);
        System.out.println("==============================================\n");
        StackKalimat tumpukan = new StackKalimat(maxStack);
        inputData(tumpukan, (maxStack-jmlhKosong));
        String jwb = "y";
        while (jwb.equalsIgnoreCase("y")) {
            printMenu();
            int pilMenu = pilihMenu();
            if (pilMenu >= 1 && pilMenu <= 5) {
                if (pilMenu == 1) {
                    tumpukan.print();
                } else if (pilMenu == 2) {
                    System.out.print("Masukkan elemen tambahan\t: ");
                    tumpukan.push(huruf.nextLine());
                } else if (pilMenu == 3){
                    tumpukan.pop();
                } else if (pilMenu == 4){
                    tumpukan.peek();
                } else if (pilMenu == 5){
                    tumpukan.clear();
                }
            } else if (pilMenu == 0){
                System.exit(0);
            } else {
                System.out.println("Pilihan menu tidak tersedia!");
            }
            System.out.println();
        }
    }

    static int pilihMenu(){
        System.out.print("\nMasukkan pilihan menu\t\t: ");
        int pilih = angka.nextInt();
        System.out.println();
        return pilih;
    }

    static void printMenu(){
        String menu = "\t1. Cetak Isi Stack\n\t2. Tambah Isi Stack\n\t3. Menghapus Top Stack\n\t4. Menampilkan Top Stack\n\t5. Menghapus Isi Stack\n\t0. Keluar";
        System.out.println("==============================================");
        System.out.println("\t   *** Menu pilihan ***");
        System.out.println("==============================================");
        System.out.println(menu);
        System.out.println("==============================================");
    }

    static int inputMaxStack(){
        System.out.print("\nMasukkan maximum isi stack\t\t: ");
        int max = angka.nextInt();
        return max;
    }

    static int inputJmlhIsi(int max){
        System.out.print("\nMasukkan jumlah isi stack yang diisi\t: ");
        int isi = angka.nextInt();
        if (isi > max) {
            System.out.println("Maaf, jumlah inputan melebihi maximum");
            return inputJmlhIsi(max);
        } else if (isi == 0){
            System.out.println("Maaf, jumlah tidak boleh 0");
            return inputJmlhIsi(max);
        } else {}
        System.out.println();
        return isi;
    }

    static void inputData(StackKalimat tumpukan, int dt){
        for (int i = 1; i <= dt; i++) {
            System.out.print("Masukkan elemen " + i + "\t: ");
            tumpukan.push(huruf.nextLine());
        }
        System.out.println();
    }
    
}
package Tugas.Nomor_1;

import java.util.*;

/**
 * * Syaifuddin Zuhri / 1941720013
 */

public class DoubleLinkedListsMain {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        try {
            int pil;
            do {
            menu();
            pil = pilMenu();

            } while (pil >= 1 && pil <= 9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void menu() {
        String title = "\nDOUBLE LINKED LISTS MENU";
        String wrewr = "==============================";
        String menu = "Memilih menu\n" + "1. Tambah Awal\n2. Tambah Akhir\n3. Tambah Data Indeks Tertentu\n"
                + "4. Hapus Awal\n5. Hapus Akhir\n6. Hapus Indeks Tertentu\n" + "7. Cetak Data\n8. Cari\n9. Keluar";
        System.out.println(title);
        System.out.println(wrewr);
        System.out.println(menu);
    }

    public static int pilMenu() {
        int pil;
        String batas = "==============================";
        System.out.println(batas);
        System.out.print(">> ");
        pil = input.nextInt();
        System.out.println(batas);
        return pil;
    }
}
package Tugas;

import java.util.Scanner;

/**
 * ReserveMain
 */
public class ReverseMain {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Scanner huruf = new Scanner(System.in);
        System.out.println("\n======================================================================================");
        System.out.println("\t\t\t*** PROGRAM KALIMAT TERBALIK ***");
        System.out.println("======================================================================================\n");
        System.out.print("Masukkan maximum jumlah kata\t: ");
        int max = angka.nextInt();
        System.out.print("\nMasukkan kalimat\t\t: ");
        String kalimat = huruf.nextLine();
        Reverse reverse = new Reverse(max, kalimat);
        reverse.reserveKalimat();
        reverse.print();   
        System.out.println("\n======================================================================================\n");
    }
}